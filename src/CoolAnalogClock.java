import java.awt.EventQueue;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import java.io.IOException;
import java.time.LocalTime;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.time.temporal.ChronoField;
import javax.swing.JComponent;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.GradientPaint;
import java.awt.RadialGradientPaint;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.geom.Point2D;

public class CoolAnalogClock {
    public static void main(String[] args) {
        EventQueue.invokeLater(CoolAnalogClock::launch);
    }

    private static void launch() {
        final JFrame j = new JFrame();
        j.setTitle("Analog Clock");
        final javaClock clock = new javaClock(new CoolPaint());

        j.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                clock.stop();
                j.dispose();
            }
        });

        j.add(clock);
        j.setBounds(20, 20, 600, 500);
        j.setVisible(true);
        
        clock.start();
    }
}

class javaClock extends JComponent {
    private static final long serialVersionUID = 1L;

    private final CoolPaint paint;
    private final Object lock;
    private Thread updater;

    public javaClock(CoolPaint paint) {
        this.paint = paint;
        this.lock = new Object();
    }

    private void runClock() {
    	
        int lastTime = -1;
        try {
            while (isRunning()) {
                Thread.sleep(10);
                int t = time();
                if (t != lastTime) {
                    lastTime = t;
                    repaint();
                }
            }
        } catch (InterruptedException e) {}
    }

    private int time() { return LocalTime.now().get(ChronoField.SECOND_OF_DAY); }

    private boolean isRunning() {
        synchronized (lock) {
            return updater == Thread.currentThread();
        }
    }

    public void start() {
        synchronized (lock) {
            if (updater != null) return;
            updater = new Thread(this::runClock);
            updater.start();
        }
    }

    public void stop() {
        synchronized (lock) {
            updater = null;
        }
    }

    public void paintComponent(Graphics g) {
        paint.paintClock(getWidth(), getHeight(), time(), (Graphics2D) g);
    }
}

interface ClockPaint {

    public void paintClock(int width, int height, int seconds, Graphics2D g2);
    
    public default void paintClock(int width, int height, LocalTime time, Graphics2D g2) {
        paintClock(width, height, time.get(ChronoField.SECOND_OF_DAY), g2);
    }

    public default void paintClock(int width, int height, Graphics2D g2) {
        paintClock(width, height, LocalTime.now(), g2);
    }

    public default void saveClock(int width, int height, String fileName) throws IOException {
        saveClock(width, height, LocalTime.now(), fileName);
    }

    public default void saveClock(int width, int height, LocalTime time, String fileName) throws IOException {
        saveClock(width, height, time.get(ChronoField.SECOND_OF_DAY), fileName);
    }

    public default void saveClock(int width, int height, int seconds, String fileName) throws IOException {
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        paintClock(width, height, seconds, (Graphics2D) image.getGraphics());
        String f = fileName.endsWith(".png") ? fileName : fileName + ".png";
        ImageIO.write(image, "png", new File(f));
    }
}

class CoolPaint implements ClockPaint {

    private static final int SECONDS_IN_MINUTE = 60;
    private static final int SECONDS_IN_HALF_HOUR = 30 * SECONDS_IN_MINUTE;
    private static final int SECONDS_IN_HOUR = 60 * SECONDS_IN_MINUTE;
    private static final int SECONDS_IN_12_HOURS = 12 * SECONDS_IN_HOUR;

    private static final int AM_0_00 = 0;
    private static final int AM_3_00 = 3 * SECONDS_IN_HOUR;
    private static final int AM_4_30 = 4 * SECONDS_IN_HOUR + SECONDS_IN_HALF_HOUR;
    private static final int AM_7_30 = 7 * SECONDS_IN_HOUR + SECONDS_IN_HALF_HOUR;
    private static final int AM_12_00 = 12 * SECONDS_IN_HOUR;
    private static final int PM_4_30 = 16 * SECONDS_IN_HOUR + SECONDS_IN_HALF_HOUR;
    private static final int PM_7_30 = 19 * SECONDS_IN_HOUR + SECONDS_IN_HALF_HOUR;
    private static final int PM_9_00 = 21 * SECONDS_IN_HOUR;
    private static final int PM_12_00 = 24 * SECONDS_IN_HOUR;

    private static final Color BLACK = new Color(0, 0, 0);
    private static final Color DARK_GRAY = new Color(32, 32, 32);
    private static final Color DARK_BLUE = new Color(0, 0, 128);
    private static final Color PURPLE = new Color(128, 0, 128);
    private static final Color CYAN = new Color(0, 255, 255);
    private static final Color YELLOW = new Color(225, 225, 0);
    private static final Color PALE_YELLOW = new Color(224, 224, 64);
    private static final Color RED = new Color(255, 0, 0);
    private static final Color GREEN = new Color(0, 255, 0);
    private static final Color LIGHT_BLUE = new Color(128, 128, 255);
    private static final Color SKY_CYAN = new Color(48, 224, 224);

    private static final Color[] COLOR_CYCLE = {
        DARK_GRAY, LIGHT_BLUE, RED, PALE_YELLOW, GREEN, SKY_CYAN, LIGHT_BLUE, DARK_GRAY
    };

    private static final int RADIAL_PERIOD_LENGTH = PM_12_00 / COLOR_CYCLE.length;
    private static final String[] ROMAN = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII"};

    private static class Painter {
        private final int width;
        private final int height;
        private final int seconds;
        private final int radius;
        private final Graphics2D g2;
        private final int cx;
        private final int cy;
        private final int secondColorIndex;
        private final int secondsInPeriod;
        private final Color pointersAndNumbersColor;

        public Painter(int width, int height, int seconds, Graphics2D g2) {
            this.width = width;
            this.height = height;
            this.seconds = seconds;
            this.radius = Math.min(width / 2, height / 2);
            this.cx = width / 2;
            this.cy = height / 2;
            this.g2 = g2;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            this.secondColorIndex = seconds / RADIAL_PERIOD_LENGTH;
            this.secondsInPeriod = seconds % RADIAL_PERIOD_LENGTH;

            int startIndex = (secondColorIndex + COLOR_CYCLE.length + 5) % COLOR_CYCLE.length;
            int endIndex = (secondColorIndex + COLOR_CYCLE.length + 6) % COLOR_CYCLE.length;
            Color color1 = COLOR_CYCLE[startIndex];
            Color color2 = COLOR_CYCLE[endIndex];
            this.pointersAndNumbersColor = mixColors(color1, color2, 0, RADIAL_PERIOD_LENGTH, secondsInPeriod);
        }

        private int mixColorComponent(int startComponent, int endComponent, double position) {
            int difference = endComponent - startComponent;
            return startComponent + (int) (difference * position);
        }

        private Color mixColors(Color startColor, Color endColor, int startTime, int endTime, int currentTime) {
            double normalized = (currentTime - startTime) / (double) (endTime - startTime);
            return new Color(
                    mixColorComponent(startColor.getRed(), endColor.getRed(), normalized),
                    mixColorComponent(startColor.getGreen(), endColor.getGreen(), normalized),
                    mixColorComponent(startColor.getBlue(), endColor.getBlue(), normalized));
        }

        private Color upperBackgroundColor() {
            if (seconds < 0) throw new IllegalArgumentException();
            if (seconds <= AM_3_00) return BLACK;
            if (seconds <= AM_4_30) return mixColors(BLACK, DARK_BLUE, AM_3_00, AM_4_30, seconds);
            if (seconds <= AM_7_30) return mixColors(DARK_BLUE, CYAN, AM_4_30, AM_7_30, seconds);
            if (seconds <= AM_12_00) return CYAN;
            if (seconds <= PM_4_30) return CYAN;
            if (seconds <= PM_7_30) return mixColors(CYAN, DARK_BLUE, PM_4_30, PM_7_30, seconds);
            if (seconds <= PM_9_00) return mixColors(DARK_BLUE, BLACK, PM_7_30, PM_9_00, seconds);
            if (seconds <= PM_12_00) return BLACK;
            throw new IllegalArgumentException();
        }

        private Color lowerBackgroundColor() {
            if (seconds < 0) throw new IllegalArgumentException();
            if (seconds <= AM_3_00) return mixColors(BLACK, DARK_BLUE, AM_0_00, AM_3_00, seconds);
            if (seconds <= AM_4_30) return mixColors(DARK_BLUE, PURPLE, AM_3_00, AM_4_30, seconds);
            if (seconds <= AM_7_30) return mixColors(PURPLE, YELLOW, AM_4_30, AM_7_30, seconds);
            if (seconds <= AM_12_00) return mixColors(YELLOW, CYAN, AM_7_30, AM_12_00, seconds);
            if (seconds <= PM_4_30) return mixColors(CYAN, YELLOW, AM_12_00, PM_4_30, seconds);
            if (seconds <= PM_7_30) return mixColors(YELLOW, PURPLE, PM_4_30, PM_7_30, seconds);
            if (seconds <= PM_9_00) return mixColors(PURPLE, DARK_BLUE, PM_7_30, PM_9_00, seconds);
            if (seconds <= PM_12_00) return mixColors(DARK_BLUE, BLACK, PM_9_00, PM_12_00, seconds);
            throw new IllegalArgumentException();
        }

        private void paintBackground() {
            Point2D p1 = new Point2D.Double(width / 2, 0);
            Point2D p2 = new Point2D.Double(width / 2, height);
            g2.setPaint(new GradientPaint(p1, upperBackgroundColor(), p2, lowerBackgroundColor()));
            g2.fillRect(0, 0, width, height);
        }

        private RadialGradientPaint colorOnCycle(Point2D center, float radius) {
            Color baseColor1 = COLOR_CYCLE[(secondColorIndex + COLOR_CYCLE.length - 1) % COLOR_CYCLE.length];
            Color baseColor2 = COLOR_CYCLE[secondColorIndex];
            Color baseColor3 = COLOR_CYCLE[(secondColorIndex + COLOR_CYCLE.length + 1) % COLOR_CYCLE.length];
            Color baseColor4 = COLOR_CYCLE[(secondColorIndex + COLOR_CYCLE.length + 2) % COLOR_CYCLE.length];

            Color start = mixColors(baseColor1, baseColor2, 0, RADIAL_PERIOD_LENGTH, secondsInPeriod);
            Color end = mixColors(baseColor3, baseColor4, 0, RADIAL_PERIOD_LENGTH, secondsInPeriod);
            float index2 = (RADIAL_PERIOD_LENGTH - secondsInPeriod) / (float) RADIAL_PERIOD_LENGTH / 2;
            float index3 = 0.5f + index2;
            float[] positions = index3 == 1.0 ? new float[] {0.0f, index2, 1.0f}
                    : new float[] {0.0f, index2, index3, 1.0f};
            Color[] colors = index3 == 1.0 ? new Color[] {start, baseColor2, end}
                    : new Color[] {start, baseColor2, baseColor3, end};

            return new RadialGradientPaint(center, radius, positions, colors);
        }

        private void paintClockArea() {
            Point2D center = new Point2D.Double(width / 2, height / 2);
            g2.setPaint(colorOnCycle(center, radius));
            g2.fillOval(width / 2 - radius, height / 2 - radius, radius * 2, radius * 2);
        }

        private double pointerRevolutionsToRadians(double angle) {
            return Math.toRadians((450 + angle * -360) % 360.0);
        }

        private void paintPointers() {
            double hAngle = pointerRevolutionsToRadians(seconds % SECONDS_IN_12_HOURS / (double) SECONDS_IN_12_HOURS);
            double mAngle = pointerRevolutionsToRadians(seconds % SECONDS_IN_HOUR / (double) SECONDS_IN_HOUR);
            double sAngle = pointerRevolutionsToRadians(seconds % SECONDS_IN_MINUTE / (double) SECONDS_IN_MINUTE);

            g2.setStroke(new BasicStroke(4.0f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
            g2.drawLine(cx, cy, (int) (cx + Math.cos(hAngle) * radius * 0.55), (int) (cy - Math.sin(hAngle) * radius * 0.55));
            g2.drawLine(cx, cy, (int) (cx + Math.cos(mAngle) * radius * 0.85), (int) (cy - Math.sin(mAngle) * radius * 0.85));
            g2.setStroke(new BasicStroke(1.0f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
            g2.drawLine(cx, cy, (int) (cx + Math.cos(sAngle) * radius * 0.85), (int) (cy - Math.sin(sAngle) * radius * 0.85));
        }

        private void paintNumbers() {
            Font originalFont = g2.getFont();
            double amplification = (int) Math.max(radius * 0.08, originalFont.getSize()) / (double) originalFont.getSize();
            AffineTransform at0 = AffineTransform.getScaleInstance(amplification, amplification);
            Font amplifiedFont = originalFont.deriveFont(at0);
            g2.setFont(amplifiedFont);
            FontMetrics fm = g2.getFontMetrics();

            for (int i = 1; i <= 12; i++) {
                double angle = pointerRevolutionsToRadians(i / 12.0);
                double textInclination = Math.toRadians(30 * i);
                AffineTransform at = AffineTransform.getRotateInstance(textInclination);
                at.scale(amplification, amplification);
                Font derivedFont = originalFont.deriveFont(at);
                g2.setFont(derivedFont);
                int pixelsOffset = fm.stringWidth(ROMAN[i]) / 2;
                int xPlot = (int) (cx + Math.cos(angle) * radius * 0.9 - pixelsOffset * Math.cos(textInclination));
                int yPlot = (int) (cy - Math.sin(angle) * radius * 0.9 - pixelsOffset * Math.sin(textInclination));
                g2.drawString(ROMAN[i], xPlot, yPlot);
            }
            g2.setFont(originalFont);
        }

        private void paintDots() {
            for (int i = 1; i < 60; i++) {
                if (i % 5 == 0) continue;
                double angle = pointerRevolutionsToRadians(i / 60.0);
                g2.fillRect((int) (cx + Math.cos(angle) * radius * 0.9) - 1, (int) (cy - Math.sin(angle) * radius * 0.9) - 1, 3, 3);
            }
        }

        public void paintClock() {
            paintBackground();
            paintClockArea();

            g2.setColor(pointersAndNumbersColor);
            g2.setPaint(pointersAndNumbersColor);
            paintNumbers();
            paintDots();
            paintPointers();
        }
    }

    public void paintClock(int width, int height, int seconds, Graphics2D g2) {
        new Painter(width, height, seconds, g2).paintClock();
    }
}
