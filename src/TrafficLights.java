import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.geom.*;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Date;

public class TrafficLights extends Frame{
     public double state;
     int x, z;
     int second1, second2;
     Graphics2D g2d;
     DecimalFormat decimal = new DecimalFormat("00");
     
     Rectangle2D.Double rect1 = new Rectangle2D.Double(120,90,90,70);
     Rectangle2D.Double rect2 = new Rectangle2D.Double(1020,90,90,70);
     
     AffineTransform transform = new AffineTransform();
     
     GeneralPath gp1 = new GeneralPath();
     GeneralPath gp2 = new GeneralPath();
      
     public void paint(Graphics g){
    	g2d = (Graphics2D) g;
        BasicStroke bs = new BasicStroke(3.0f);
        g2d.setStroke(bs);
        
        Date date = new Date();
        Calendar time = Calendar.getInstance();
        time.setTime(date);
        
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setColor(Color.GRAY);
        
        Rectangle2D.Double r1 = new Rectangle2D.Double(30,70,90,270);
        g2d.fill(r1);
        
        g2d.setColor(Color.cyan);
        g2d.fill(rect1);
        
        g2d.setColor(Color.BLACK);
        Ellipse2D.Double red1 = new Ellipse2D.Double(50,90,50,50);
        g2d.fill(red1);

        g2d.setColor(Color.BLACK);
        Ellipse2D.Double yellow1 = new Ellipse2D.Double(50,180,50,50);
        g2d.fill(yellow1);

        g2d.setColor(Color.BLACK);
        Ellipse2D.Double green1 = new Ellipse2D.Double(50,270,50,50);
        g2d.fill(green1);
        
        g2d.setColor(Color.GRAY);
        Rectangle2D.Double r2 = new Rectangle2D.Double(930,70,90,270);
        g2d.fill(r2);
        
        g2d.setColor(Color.cyan);
        g2d.fill(rect2);
        
        g2d.setColor(Color.BLACK);
        Ellipse2D.Double red2 = new Ellipse2D.Double(950,90,50,50);
        g2d.fill(red2);

        g2d.setColor(Color.BLACK);
        Ellipse2D.Double yellow2 = new Ellipse2D.Double(950,180,50,50);
        g2d.fill(yellow2);

        g2d.setColor(Color.BLACK);
        Ellipse2D.Double green2 = new Ellipse2D.Double(950,270,50,50);
        g2d.fill(green2);
        
        gp1.moveTo(150,450);
        gp1.lineTo(125,450);
        gp1.lineTo(125,475);
        gp1.lineTo(150,475);
        gp1.curveTo(155,500,170,500,175,475);
        gp1.lineTo(200,475);
        gp1.curveTo(205,500,220,500,225,475);
        gp1.lineTo(250,475);
        gp1.lineTo(250,450);
        gp1.lineTo(225,450);
        gp1.curveTo(220,400,155,400,150,450);
        g2d.setColor(Color.blue);
        g2d.fill(gp1);
        
        gp2.moveTo(750,650);
        gp2.lineTo(725,650);
        gp2.lineTo(725,675);
        gp2.lineTo(750,675);
        gp2.curveTo(755,700,770,700,775,675);
        gp2.lineTo(800,675);
        gp2.curveTo(805,700,820,700,825,675);
        gp2.lineTo(850,675);
        gp2.lineTo(850,650);
        gp2.lineTo(825,650);
        gp2.curveTo(820,600,755,600,750,650);
        g2d.setColor(Color.orange);
        g2d.fill(gp2);
        
        state = 0;
        while (true) {
            if (state == 0) {
                g2d.setColor(Color.BLACK);
                g2d.fill(green1);
                g2d.fill(yellow1);
                g2d.fill(green2);
                g2d.fill(yellow2);
                g2d.fill(red1);
                g2d.fill(red2);
                g2d.setColor(Color.RED);
                g2d.fill(red1);
                g2d.fill(red2);
                sustain(3000);
                state = 1;
            } else if (state == 1) {
                g2d.setColor(Color.BLACK);
                g2d.fill(green1);
                g2d.fill(yellow1);
                g2d.fill(green2);
                g2d.fill(yellow2);
                g2d.fill(red1);
                g2d.fill(red2);
                g2d.setColor(Color.GREEN);
                g2d.fill(green1);
                g2d.setColor(Color.RED);
                g2d.fill(red2);
                sustain(30000,"green","red");
                state = 2;
            } else if (state == 2) {
                g2d.setColor(Color.BLACK);
                g2d.fill(green1);
                g2d.fill(yellow1);
                g2d.fill(green2);
                g2d.fill(yellow2);
                g2d.fill(red1);
                g2d.fill(red2);
                g2d.setColor(Color.YELLOW);
                g2d.fill(yellow1);
                g2d.setColor(Color.RED);
                g2d.fill(red2);
                sustain(3000,"yellow","red");
                state = 3;
            } else if (state == 3) {
                g2d.setColor(Color.BLACK);
                g2d.fill(green1);
                g2d.fill(yellow1);
                g2d.fill(green2);
                g2d.fill(yellow2);
                g2d.fill(red1);
                g2d.fill(red2);
                g2d.setColor(Color.RED);
                g2d.fill(red1);
                g2d.setColor(Color.GREEN);
                g2d.fill(green2);
                sustain(30000,"red","green");
                state = 4;
            } else if (state == 4) {
                g2d.setColor(Color.BLACK);
                g2d.fill(green1);
                g2d.fill(yellow1);
                g2d.fill(green2);
                g2d.fill(yellow2);
                g2d.fill(red1);
                g2d.fill(red2);
                g2d.setColor(Color.RED);
                g2d.fill(red1);
                g2d.setColor(Color.YELLOW);
                g2d.fill(yellow2);
                sustain(3000,"red","yellow");
                state = 1;
            }
        }
     }
     
    public void sustain(long t) {
        long finish = (new Date()).getTime() + t;
        while ((new Date()).getTime() < finish ) {}
    }
    
    public void sustain(long t,String light1,String light2) {
        long millis = System.currentTimeMillis();
        int seconds = (int) ((millis / 1000) % 60);
        
        long finish = (new Date()).getTime() + t;
        
        if (light1.equals("green")) second1 = 30;
        else if (light1.equals("yellow")) second1 = 3;
        else second1 = 33;

        if (light2.equals("green")) second2 = 30;
        else if (light2.equals("yellow")) second2 = 3;
        else second2 = 33;
        
        while ((new Date()).getTime() < finish ) {

            if ((int)(((new Date()).getTime()/1000)%60) != seconds) {
                second1--;
                second2--;
                if (light1 == "green" && light2=="red"
            	 || light1 == "yellow" && light2=="red") {
                	g2d.setColor(Color.cyan);
                    g2d.fill(rect1);
                    g2d.fill(rect2);
                    
                    g2d.setFont(new Font("Calibri",Font.PLAIN,50));
                    g2d.setColor(Color.BLACK);
                    g2d.drawString(decimal.format(second1),130,140);                
                    g2d.drawString(decimal.format(second2),1030,140);
                    
                    for (int core = 10; core > 0; core--) {
	                    g2d.clearRect(125, 575, 800, 120);
	                    g2d.setColor(Color.orange);
	                    transform.setToTranslation(x -=1, 0);
	                    g2d.fill(transform.createTransformedShape(gp2));
                    }
                } else {
                    g2d.setColor(Color.cyan);
                    g2d.fill(rect1);
                    g2d.fill(rect2);
                    
                    g2d.setFont(new Font("Calibri",Font.PLAIN,50));
                    g2d.setColor(Color.BLACK);
                    g2d.drawString(decimal.format(second1),130,140);                
                    g2d.drawString(decimal.format(second2),1030,140);
                    
                    for(int core = 10; core > 0; core--){
	                    g2d.clearRect(125,410,800,100);
	                    g2d.setColor(Color.blue);
	                    transform.setToTranslation(z += 1, 0);
	                    g2d.fill(transform.createTransformedShape(gp1));
                    }
                }
                seconds = (int) (((new Date()).getTime() / 1000) % 60);
            }
        }
        
    }
    
     public static void main(String[] args) throws InterruptedException  {
        TrafficLights traffic = new TrafficLights();
        traffic.setTitle("Traffic Lights");
        traffic.setBackground(Color.WHITE);
        traffic.setSize(1200,730);
        traffic.setResizable(false);
        traffic.setVisible(true);
        
        for(int x = 0; x < 200; x++) { 
             traffic.repaint();
             Thread.sleep(500);
        }
        
        traffic.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                e.getWindow().dispose();
            }
        });
    }
}
