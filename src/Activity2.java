import java.awt.*;
import java.awt.geom.*;

public class Activity2 extends Frame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void paint (Graphics g) {
       
        Graphics2D g2d = (Graphics2D) g;       
        BasicStroke bs = new BasicStroke (2.0f);
        g2d.setStroke(bs);
       
        g2d.setPaint(Color.black);
        Line2D.Double A = new Line2D.Double(50, 475, 500, 125);
        g2d.draw(A);
        Line2D.Double B = new Line2D.Double(500, 125, 300, 300);
        g2d.draw(B);
        Line2D.Double C = new Line2D.Double(300, 300, 450, 500);
        g2d.draw(C);
        Line2D.Double D = new Line2D.Double(450, 500, 200, 375);
        g2d.draw(D);
        Line2D.Double E = new Line2D.Double(200, 375, 50, 475);
        g2d.draw(E);
       
        g2d.setPaint(Color.green);
        QuadCurve2D.Double qc = new QuadCurve2D.Double(175, 500, 200, 300, 400, 550);
        g2d.draw(qc);
       
        g2d.setPaint(Color.blue);
        CubicCurve2D.Double cc = new CubicCurve2D.Double(375, 300, 450, 550, 550, 450, 575, 350);
        g2d.draw(cc);
       
        g2d.setPaint(Color.red);
        Rectangle2D.Double rect = new Rectangle2D.Double(100, 100, 150, 200);
        g2d.draw(rect);
       
        g2d.setPaint(Color.yellow);
        Rectangle2D.Double ellipse = new Rectangle2D.Double(80, 60, 40, 60);
        Arc2D.Double arc1 = new Arc2D.Double(ellipse, 0, 360, Arc2D.CHORD);
        g2d.draw(arc1);
    }
   
    public static void main (String args[]) {
        Activity2 a2 = new Activity2();
        a2.setTitle ("Activity 2");
        a2.setBackground(Color.WHITE);
        a2.setSize(625, 600);
        a2.setVisible(true);
    }   
}