/**
*
* @author Ryan Arioja, 4CSC
*
*/

import java.awt.*;
import java.awt.geom.*;
        
public class TwitterLogo extends Frame {
    
	/**
	 * 
	 */
	private static final long serialVersionUID = 1143862912602067547L;

	public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        BasicStroke sketchLine = new BasicStroke(1.0f);
		BasicStroke outLine = new BasicStroke(3.0f);
        
		//colors
		Color twitterBlue = new Color (85, 172, 238);
		Color twitterDarkBlue = new Color (0, 172, 237);
		Color twitterGrey = new Color (102, 117, 127);
		Color twitterBlack = new Color (41, 47, 51);
		
		g2d.setStroke(outLine);
		
		//body
		g2d.setPaint(twitterBlue);
		Ellipse2D.Double body = new Ellipse2D.Double(94, 240, 390, 390);
		g2d.fill(body);
		
		//tail
		g2d.setPaint(Color.white);
		Ellipse2D.Double tail = new Ellipse2D.Double(52, 315, 285, 285);
		g2d.fill(tail);
		
		//featherBottom
		g2d.setPaint(twitterBlue);
		Ellipse2D.Double featherBottom = new Ellipse2D.Double(220, 430, 140, 140);
		g2d.fill(featherBottom);
		g2d.setPaint(Color.white);
		Ellipse2D.Double featherBottomCut = new Ellipse2D.Double(164, 384, 140, 140);
		g2d.fill(featherBottomCut);
		
		//featherMiddle
		g2d.setPaint(twitterBlue);
		Ellipse2D.Double featherMiddle = new Ellipse2D.Double(198, 382, 140, 140);
		g2d.fill(featherMiddle);
		g2d.setPaint(Color.white);
		Ellipse2D.Double featherMiddleCut = new Ellipse2D.Double(154, 320, 140, 140);
		g2d.fill(featherMiddleCut);
		
		//featherTop
		g2d.setPaint(twitterBlue);
		Ellipse2D.Double featherTop = new Ellipse2D.Double(199, 335, 140, 140);
		g2d.fill(featherTop);
		
		//bodyCut
		g2d.setPaint(Color.white);
		Ellipse2D.Double bodyCut = new Ellipse2D.Double(164, 52, 390, 390);
		g2d.fill(bodyCut);
		
		//mouthBottom
		g2d.setPaint(twitterBlue);
		Ellipse2D.Double mouthBottom = new Ellipse2D.Double(390, 302, 130, 130);
		g2d.fill(mouthBottom);
		g2d.setPaint(Color.white);
		Ellipse2D.Double mouthBottomCut = new Ellipse2D.Double(344, 166, 235, 235);
		g2d.fill(mouthBottomCut);
		
		//mouthTop
		g2d.setPaint(twitterBlue);
		Ellipse2D.Double mouthTop = new Ellipse2D.Double(381, 279, 130, 130);
		g2d.fill(mouthTop);
		g2d.setPaint(Color.white);
		Ellipse2D.Double mouthTopCut = new Ellipse2D.Double(326, 147, 235, 235);
		g2d.fill(mouthTopCut);
		
		//head
		g2d.setPaint(twitterBlue);
		Ellipse2D.Double head = new Ellipse2D.Double(347, 358, 135, 135);
		g2d.fill(head);
		
		//whitespace
		g2d.setPaint(Color.white);
		Ellipse2D.Double whitespace = new Ellipse2D.Double(110, 275, 100, 100);
		g2d.fill(whitespace);
		
		//sketch
			//sketch-rectangles
			g2d.setStroke(sketchLine);
			g2d.setPaint(twitterDarkBlue);
			Rectangle2D.Double rbody = new Rectangle2D.Double(94, 240, 390, 390);
			Rectangle2D.Double rtail = new Rectangle2D.Double(52, 315, 285, 285);
			Rectangle2D.Double rfeatherBottom = new Rectangle2D.Double(220, 430, 140, 140);
			Rectangle2D.Double rfeatherBottomCut = new Rectangle2D.Double(164, 384, 140, 140);
			Rectangle2D.Double rfeatherMiddle = new Rectangle2D.Double(198, 382, 140, 140);
			Rectangle2D.Double rfeatherMiddleCut = new Rectangle2D.Double(154, 320, 140, 140);
			Rectangle2D.Double rfeatherTop = new Rectangle2D.Double(199, 335, 140, 140);
			Rectangle2D.Double rbodyCut = new Rectangle2D.Double(164, 52, 390, 390);
			Rectangle2D.Double rmouthBottom = new Rectangle2D.Double(390, 302, 130, 130);
			Rectangle2D.Double rmouthBottomCut = new Rectangle2D.Double(344, 166, 235, 235);
			Rectangle2D.Double rmouthTop = new Rectangle2D.Double(381, 279, 130, 130);
			Rectangle2D.Double rmouthTopCut = new Rectangle2D.Double(326, 147, 235, 235);
			Rectangle2D.Double rhead = new Rectangle2D.Double(347, 358, 135, 135);
			
			// uncomment these lines if you wish to see the rectangles
			
			g2d.draw(rbody);
			g2d.draw(rtail);
			g2d.draw(rfeatherBottom);
			g2d.draw(rfeatherBottomCut);
			g2d.draw(rfeatherMiddle);
			g2d.draw(rfeatherMiddleCut);
			g2d.draw(rfeatherTop);
			g2d.draw(rbodyCut);
			g2d.draw(rmouthBottom);
			g2d.draw(rmouthBottomCut);
			g2d.draw(rmouthTop);
			g2d.draw(rmouthTopCut);
			g2d.draw(rhead);
			
			
			//sketch-centers
			g2d.setPaint(twitterBlack);
			Line2D.Double center1X = new Line2D.Double(284, 435, 294, 435);
			Line2D.Double center1Y = new Line2D.Double(289, 430, 289, 440);
			g2d.draw(center1X);
			g2d.draw(center1Y);
			
			Line2D.Double center2X = new Line2D.Double(189.5, 457.5, 199.5, 457.5);
			Line2D.Double center2Y = new Line2D.Double(194.5, 452.5, 194.5, 462.5);
			g2d.draw(center2X);
			g2d.draw(center2Y);
			
			Line2D.Double center3X = new Line2D.Double(285, 500, 295, 500);
			Line2D.Double center3Y = new Line2D.Double(290, 495, 290, 505);
			g2d.draw(center3X);
			g2d.draw(center3Y);
			
			Line2D.Double center4X = new Line2D.Double(229, 454, 239, 454);
			Line2D.Double center4Y = new Line2D.Double(234, 449, 234, 459);
			g2d.draw(center4X);
			g2d.draw(center4Y);
			
			Line2D.Double center5X = new Line2D.Double(263, 452, 273, 452);
			Line2D.Double center5Y = new Line2D.Double(268, 447, 268, 457);
			g2d.draw(center5X);
			g2d.draw(center5Y);
			
			Line2D.Double center6X = new Line2D.Double(219, 390, 229, 390);
			Line2D.Double center6Y = new Line2D.Double(224, 385, 224, 395);
			g2d.draw(center6X);
			g2d.draw(center6Y);
			
			Line2D.Double center7X = new Line2D.Double(264, 405, 274, 405);
			Line2D.Double center7Y = new Line2D.Double(269, 400, 269, 410);
			g2d.draw(center7X);
			g2d.draw(center7Y);
			
			Line2D.Double center8X = new Line2D.Double(354, 247, 364, 247);
			Line2D.Double center8Y = new Line2D.Double(359, 242, 359, 252);
			g2d.draw(center8X);
			g2d.draw(center8Y);
			
			Line2D.Double center9X = new Line2D.Double(450, 367, 460, 367);
			Line2D.Double center9Y = new Line2D.Double(455, 362, 455, 372);
			g2d.draw(center9X);
			g2d.draw(center9Y);
			
			Line2D.Double center10X = new Line2D.Double(456.5, 283.5, 466.5, 283.5);
			Line2D.Double center10Y = new Line2D.Double(461.5, 278.5, 461.5, 288.5);
			g2d.draw(center10X);
			g2d.draw(center10Y);
			
			Line2D.Double center11X = new Line2D.Double(441, 344, 451, 344);
			Line2D.Double center11Y = new Line2D.Double(446, 339, 446, 349);
			g2d.draw(center11X);
			g2d.draw(center11Y);
			
			Line2D.Double center12X = new Line2D.Double(448.5, 264.5, 458.5, 264.5);
			Line2D.Double center12Y = new Line2D.Double(453.5, 259.5, 453.5, 269.5);
			g2d.draw(center12X);
			g2d.draw(center12Y);
			
			Line2D.Double center13X = new Line2D.Double(409.5, 425.5, 419.5, 425.5);
			Line2D.Double center13Y = new Line2D.Double(414.5, 420.5, 414.5, 430.5);
			g2d.draw(center13X);
			g2d.draw(center13Y);
			
			//sketch-circles
			g2d.setStroke(sketchLine);
			g2d.setPaint(twitterGrey);
			Arc2D.Double arc1 = new Arc2D.Double(rbody, 0, 360, Arc2D.CHORD);
			Arc2D.Double arc2 = new Arc2D.Double(rtail, 0, 360, Arc2D.CHORD);
			Arc2D.Double arc3 = new Arc2D.Double(rfeatherBottom, 0, 360, Arc2D.CHORD);
			Arc2D.Double arc4 = new Arc2D.Double(rfeatherBottomCut, 0, 360, Arc2D.CHORD);
			Arc2D.Double arc5 = new Arc2D.Double(rfeatherMiddle, 0, 360, Arc2D.CHORD);
			Arc2D.Double arc6 = new Arc2D.Double(rfeatherMiddleCut, 0, 360, Arc2D.CHORD);
			Arc2D.Double arc7 = new Arc2D.Double(rfeatherTop, 0, 360, Arc2D.CHORD);
			Arc2D.Double arc8 = new Arc2D.Double(rbodyCut, 0, 360, Arc2D.CHORD);
			Arc2D.Double arc9 = new Arc2D.Double(rmouthBottom, 0, 360, Arc2D.CHORD);
			Arc2D.Double arc10 = new Arc2D.Double(rmouthBottomCut, 0, 360, Arc2D.CHORD);
			Arc2D.Double arc11 = new Arc2D.Double(rmouthTop, 0, 360, Arc2D.CHORD);
			Arc2D.Double arc12 = new Arc2D.Double(rmouthTopCut, 0, 360, Arc2D.CHORD);
			Arc2D.Double arc13 = new Arc2D.Double(rhead, 0, 360, Arc2D.CHORD);
			
			g2d.draw(arc1);
			g2d.draw(arc2);
			g2d.draw(arc3);
			g2d.draw(arc4);
			g2d.draw(arc5);
			g2d.draw(arc6);
			g2d.draw(arc7);
			g2d.draw(arc8);
			g2d.draw(arc9);
			g2d.draw(arc10);
			g2d.draw(arc11);
			g2d.draw(arc12);
			g2d.draw(arc13);
    }
    
    public static void main (String[] args) {
        TwitterLogo logo = new TwitterLogo();
        logo.setTitle("Twitter Logo - Ryan Arioja, 4CSC");
        logo.setBackground(Color.white);
        logo.setSize(631, 682);
        logo.setVisible(true);
        logo.setForeground(Color.black);
    }
}