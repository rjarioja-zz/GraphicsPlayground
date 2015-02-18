/**
*
* @author Ryan Arioja, 4CSC
*
*/

import java.awt.*;
import java.awt.geom.*;
        
public class GoogleChromeLogo extends Frame {
    
	/**
	 * 
	 */
	private static final long serialVersionUID = 1143862912602067547L;

	public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        BasicStroke sketchLine = new BasicStroke(1.0f);
		//BasicStroke outLine = new BasicStroke(3.0f);
        
		// Colors
		Color chromeRed = new Color (249, 1, 1);
		Color chromeGreen = new Color (0, 147, 59);
		Color chromeYellow = new Color (242, 181, 15);
		Color chromeBlue = new Color (2, 102, 200);
		
		g2d.setStroke(sketchLine);
		Rectangle2D.Double square1 = new Rectangle2D.Double(50, 80, 500, 500);
		//Arc2D.Double circle1 = new Arc2D.Double(square1, 0, 360, Arc2D.CHORD);
		// g2d.draw(circle1);
		
		g2d.setPaint(chromeRed);
		Arc2D.Double red = new Arc2D.Double(square1, 30, 120, Arc2D.PIE);
		g2d.fill(red);
		
		g2d.setPaint(chromeGreen);
		Arc2D.Double green = new Arc2D.Double(square1, 150, 120, Arc2D.PIE);
		g2d.fill(green);
		
		g2d.setPaint(chromeYellow);
		Arc2D.Double yellow = new Arc2D.Double(square1, 270, 120, Arc2D.PIE);
		g2d.fill(yellow);
		g2d.fillPolygon(new int[] {516, 300, 300}, new int[] {205, 200, 330}, 3);
		
		g2d.setPaint(chromeRed);
		g2d.fillPolygon(new int[] {84, 188, 300}, new int[] {205, 395, 330}, 3);
		g2d.setPaint(chromeGreen);
		g2d.fillPolygon(new int[] {412, 300, 300}, new int[] {395,  580, 330}, 3);
		g2d.setPaint(chromeYellow);
		g2d.fillPolygon(new int[] {517, 300, 300}, new int[] {205, 200, 330}, 3);

		g2d.setPaint(Color.white);
		Rectangle2D.Double square2 = new Rectangle2D.Double(170, 200, 260, 260);
		Arc2D.Double circle2 = new Arc2D.Double(square2, 0, 360, Arc2D.CHORD);
		g2d.fill(circle2);
			
		g2d.setPaint(chromeBlue);
		Rectangle2D.Double square3 = new Rectangle2D.Double(190, 220, 220, 220);
		Arc2D.Double circle3 = new Arc2D.Double(square3, 0, 360, Arc2D.CHORD);
		g2d.fill(circle3);
    }
    
    public static void main (String[] args) {
        GoogleChromeLogo logo = new GoogleChromeLogo();
        logo.setTitle("Google Chrome Logo - Ryan Arioja, 4CSC");
        logo.setBackground(Color.white);
        logo.setSize(610, 640);
        logo.setVisible(true);
        logo.setForeground(Color.black);
    }
}