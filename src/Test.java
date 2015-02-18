import java.awt.*;
import java.awt.geom.*;


public class Test extends Frame {

	public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        BasicStroke sketchLine = new BasicStroke(1.0f);
        BasicStroke outLine = new BasicStroke(3.0f);
        
		// Colors
		Color gokuBlack = new Color(0, 0, 0);
		Color gokuRed1 = new Color(210, 20, 20);
		Color gokuYellow1 = new Color(240, 225, 40);
		Color gokuBlue1 = new Color(30, 60, 190);
		Color gokuSkin1 = new Color(255, 200, 150);
		
		g2d.setStroke(sketchLine);
		g2d.setPaint(gokuBlack);
		Line2D.Double line1 = new Line2D.Double(100, 100, 400, 400);
		Line2D.Double line2 = new Line2D.Double(400, 100, 250, 250);
		g2d.draw(line1);
		//g2d.draw(line2);
		
		g2d.setPaint(gokuRed1);
		QuadCurve2D.Double quad1 = new QuadCurve2D.Double(100, 100, 300, 200, 400, 400);
		Line2D.Double line3 = new Line2D.Double(300, 200, 250, 250);
		g2d.draw(quad1);
		g2d.draw(line3);
		
		g2d.setPaint(gokuBlue1);
		Rectangle2D.Double rect1 = new Rectangle2D.Double(100, 100, 300, 300);
		g2d.draw(rect1);
		
    }
	
	public static void main(String[] args) {
		Test test = new Test();
		test.setTitle("TEST CANVAS");
		test.setBackground(Color.white);
		test.setSize(500, 500);
		test.setVisible(true);
		test.setForeground(Color.black);

	}

}
