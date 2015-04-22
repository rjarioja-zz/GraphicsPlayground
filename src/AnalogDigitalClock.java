import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.geom.*;
import java.util.Date;
import java.text.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class AnalogDigitalClock extends Frame {
    static float min = 0, hour = 0, second = 0;
    static Graphics2D digital, analog, hourNumbers, clockCircles;

    class CloseHandler extends WindowAdapter {
		public void windowClosing(WindowEvent we) {	
			System.exit(0); 
		}
	}
	
	public AnalogDigitalClock() {
		addWindowListener(new CloseHandler());
		setTitle("Analog & DigitalClock - Ryan Arioja, 4CSC");
        setBackground(Color.white);
        setForeground(Color.black);
        setResizable(false);
	}
    
    public void paint(Graphics g) {
    	BasicStroke basicStroke = new BasicStroke(1.5f);
    	Calendar time = Calendar.getInstance();
    	int hours = time.get(Calendar.HOUR_OF_DAY), 
			minutes = time.get(Calendar.MINUTE), 
			seconds = time.get(Calendar.SECOND);
    	Date date = new Date();
        time.setTime(date);
        
    	analog = (Graphics2D) g;
        digital = (Graphics2D) g;
        hourNumbers = (Graphics2D) g;
        clockCircles = (Graphics2D) g;
        
        clockCircles.setStroke(basicStroke);
        clockCircles.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
       
        Ellipse2D.Double clock = new Ellipse2D.Double(80,80,450,450);
        Ellipse2D.Double clock2 = new Ellipse2D.Double(95,95,420,420);
        Ellipse2D.Double clock3 = new Ellipse2D.Double(280,280,50,50);
        Rectangle2D.Double mhand = new Rectangle2D.Double(305,130,10,180);
        Rectangle2D.Double hhand = new Rectangle2D.Double(305,160,10,140);
        Rectangle2D.Double shand = new Rectangle2D.Double(305,108,10,200);
        
        clockCircles.setColor(Color.black);
        clockCircles.fill(clock);
        
        clockCircles.setColor(Color.darkGray);
        clockCircles.fill(clock2);
        
        DecimalFormat decimal = new DecimalFormat("00");
        
        digital.setStroke(basicStroke);
        digital.setFont(new Font("Consolas", Font.BOLD, 34));
        digital.setPaint(Color.white);
        digital.drawString(decimal.format(hours)
        		+ " : " + decimal.format(minutes)
        		+ " : " + decimal.format(seconds),
    			200, 375);
        
        hourNumbers.setFont(new Font("Tahoma", Font.BOLD,50));
        hourNumbers.setPaint(Color.yellow);
        hourNumbers.drawString("3", 470, 330);
        hourNumbers.drawString("6", 295, 500);
        hourNumbers.drawString("9", 105, 330);
        hourNumbers.drawString("12", 275, 150);
        
        hourNumbers.setFont(new Font("Tahoma",Font.PLAIN,30));
        hourNumbers.drawString("I",400,160);
        hourNumbers.drawString("XI",200,160);
        hourNumbers.drawString("II",445,225);
        hourNumbers.drawString("X",130,225);
        hourNumbers.drawString("IV",445,410);
        hourNumbers.drawString("VIII",130,410);
        hourNumbers.drawString("V",390,480);
        hourNumbers.drawString("VII",200,480);
        
        
        AffineTransform hRotation = new AffineTransform();
        hRotation.translate(305, 305);
        hRotation.rotate((hour*(Math.PI/6)));
        hRotation.translate(-305, -305);
        analog.setTransform(hRotation);
        analog.fill(hhand);
        
        AffineTransform mRotation = new AffineTransform();
        mRotation.translate(305, 305);
        mRotation.rotate((min*(Math.PI/30)));
        mRotation.translate(-305, -305);
        analog.setTransform(mRotation);
        analog.fill(mhand);
        
        AffineTransform sRotation = new AffineTransform();
        sRotation.translate(307, 305);
        sRotation.rotate((second*(Math.PI/30)));
        sRotation.translate(-307, -305);
        analog.setTransform(sRotation);
        analog.setColor(Color.RED);
        analog.fill(shand);
        
        clockCircles.setPaint(Color.black);
        clockCircles.fill(clock3);
    }    
    
    public static void main(String[] args) throws InterruptedException {
        AnalogDigitalClock clock = new AnalogDigitalClock();

        clock.setSize(600, 600);
        clock.setVisible(true);
        clock.setBackground(Color.white);
        clock.setResizable(false);
        clock.setTitle("Analog/Digital Clock");
        
        while(true) {
            Calendar cc = GregorianCalendar.getInstance();
            hour = cc.get(Calendar.HOUR_OF_DAY);
            min = cc.get(Calendar.MINUTE);
            second = cc.get(Calendar.SECOND);
                clock.repaint();
                Thread.sleep(1000);
        }   
    
    }
        
}

        
        