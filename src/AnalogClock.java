import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;

import javax.swing.*;

import java.util.*;

import javax.swing.Timer;


public class AnalogClock extends JFrame {

    Clock clockFace;

    public static void main(String[] args) {
        JFrame analogClock = new AnalogClock();
        analogClock.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
        analogClock.setVisible(true);
        analogClock.setResizable(false);
    }

    public AnalogClock() {
        Container content = this.getContentPane();
        content.setLayout(new BorderLayout());
        clockFace = new Clock();
        content.add(clockFace, BorderLayout.CENTER);

        this.setTitle("Analog Clock");
        this.pack(); 

        clockFace.start();
    }
}
class Clock extends JPanel {

    private int hours = 0;
    private int minutes = 0;
    private int seconds = 1;
    private int millis = 0;
    private static final int spaces = 10;
    private static final float threePi = (float) (3.0 * Math.PI);
    private static final float radsPerSeconds = (float) (Math.PI / 30.0); 

    private int size; 
    private int centerX; 
    private int centerY; 
    private BufferedImage clock;
    private Timer t;
    
    public Clock() {
        this.setPreferredSize(new Dimension(300, 300));
        this.setBackground(Color.gray);

        t = new Timer(1000,
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    update();
                }
            });
    }
    
    public void update() { this.repaint(); }
    public void start() { t.start(); }
    public void stop() { t.stop(); }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        int width = getWidth();
        int height = getHeight();
        size = ((width < height) ? width : height) - 2 * spaces;
        centerX = size / 2 + spaces;
        centerY = size / 2 + spaces;

        if (clock == null || clock.getWidth() != width || clock.getHeight() != height) {
            clock = (BufferedImage) (this.createImage(width, height)); 
            Graphics2D gc = clock.createGraphics();
            drawClockFace(gc);
        }
 
        Calendar now = Calendar.getInstance();
		Scanner console = new Scanner(System.in);
        
        do {
            System.out.println("Input current hour: ");
            hours = console.nextInt();
            if(!(hours <= 23 && hours >= 0)) System.out.println("Please input a valid hour from 0-23");
        } while(!(hours <= 23 && hours >= 0));
        
        do {
            System.out.println("Input current minutes: ");
            minutes = console.nextInt();
            if (!(minutes <= 59 && minutes >= 0)) 
                System.out.println("Please input a valid minute from 0-59"); 
        } while(!(minutes <= 59 && minutes >= 0));
        
        do {
            System.out.println("Input seconds: ");
            seconds =  console.nextInt() - 1;
            if(!(seconds <= 59 && seconds >= 0)) System.out.println("Please input a valid second from 0-59");
        } while(!(seconds <= 59 && seconds >= 0));
        
        millis = now.get(Calendar.MILLISECOND);
        g2.drawImage(clock, 0, 0, this);
        drawClockHands(g);
        //console.close();
    }

    private void drawClockHands(Graphics g) {
        int secondRadius = size / 2;
        int minuteRadius = secondRadius * 3 / 4;
        int hourRadius = secondRadius / 2;

        float fseconds = seconds + (float) millis / 1000;
        float secondAngle = threePi - (radsPerSeconds * fseconds);
        drawRadius(g, centerX, centerY, secondAngle, 0, secondRadius);

        float fminutes = (float) (minutes + fseconds / 60.0);
        float minuteAngle = threePi - (radsPerSeconds * fminutes);
        drawRadius(g, centerX, centerY, minuteAngle, 0, minuteRadius);

        float fhours = (float) (hours + fminutes / 60.0);
        float hourAngle = threePi - (5 * radsPerSeconds * fhours);
        drawRadius(g, centerX, centerY, hourAngle, 0, hourRadius);
    }

    private void drawClockFace(Graphics g) {
        g.setColor(Color.white);
        g.fillOval(spaces, spaces, size, size);
        g.setColor(Color.black);
        g.drawOval(spaces, spaces, size, size);

        for (int seconds = 0; seconds < 60; seconds++) {
            int tickStart;
            
            if (seconds % 5 == 0) tickStart = size / 2 - 10;
            else tickStart = size / 2 - 5;
            
            drawRadius(g, centerX, centerY, radsPerSeconds * seconds, tickStart, size / 2);
        }
    }

    private void drawRadius(Graphics g, int x, int y, double angle,
        int minRadius, int maxRadius) {
        float sine = (float) Math.sin(angle);
        float cosine = (float) Math.cos(angle);

        int dxmin = (int) (minRadius * sine);
        int dymin = (int) (minRadius * cosine);

        int dxmax = (int) (maxRadius * sine);
        int dymax = (int) (maxRadius * cosine);
        g.drawLine(x + dxmin, y + dymin, x + dxmax, y + dymax);
    }

}
