/**
*
* @author Ryan Arioja, 4CSC
*
*/

import java.awt.*;
import java.awt.geom.*;
        
public class Goku extends Frame {
    
	/**
	 * 
	 */
	private static final long serialVersionUID = 1143862912602067547L;

	public void paint(Graphics g) {
        Graphics2D graphHair = (Graphics2D) g;
        Graphics2D graphCloth = (Graphics2D) g;
        Graphics2D graphFace = (Graphics2D) g;
        BasicStroke sketchLine = new BasicStroke(1.0f);
        BasicStroke hairLine = new BasicStroke(1.25f);
		//BasicStroke outLine = new BasicStroke(3.0f);
        
		// Colors
		Color gokuBlack = new Color(0, 0, 0);
		Color gokuRed1 = new Color(210, 20, 20);
		Color gokuYellow1 = new Color(240, 225, 40);
		Color gokuBlue1 = new Color(30, 60, 190);
		Color gokuSkin1 = new Color(255, 200, 150);
		
		GeneralPath hair = new GeneralPath();
		GeneralPath hairLine1 = new GeneralPath();
		GeneralPath hairLine2 = new GeneralPath();
		GeneralPath hairLine3 = new GeneralPath();
		GeneralPath hairLine4 = new GeneralPath();

		hair.moveTo(220, 52);
		hair.curveTo(233, 66, 255, 145, 246, 180);
		hair.curveTo(237, 160, 164, 105, 107, 114);
		hair.curveTo(140, 147, 180, 231, 185, 250);
		hair.curveTo(158, 234, 123, 215, 85, 213);
		hair.lineTo(170, 339);
		hair.lineTo(121, 316);
		hair.lineTo(189, 380);
		hair.lineTo(395, 420);
		hair.lineTo(475, 395);
		hair.lineTo(438, 392);
		hair.lineTo(555, 348);
		hair.curveTo(551, 346, 480, 338, 470, 340);
		hair.lineTo(578, 280);
		hair.curveTo(542, 262, 467, 262, 457, 266);
		hair.curveTo(448, 188, 362, 162, 325, 180);
		hair.curveTo(309, 107, 257, 56, 220, 52);
		hairLine1.moveTo(248, 180);
		hairLine1.curveTo(244, 149, 219, 86, 200, 68);
		hairLine2.moveTo(112, 294);
		hairLine2.lineTo(166, 334);
		hairLine3.moveTo(477, 339);
		hairLine3.lineTo(555, 333);
		hairLine4.moveTo(566, 253);
		hairLine4.curveTo(534, 252, 481, 255, 457, 264);
		graphHair.setStroke(sketchLine);
		graphHair.setColor(gokuBlack);
		graphHair.fill(hair);
		graphHair.draw(hairLine3);
		graphHair.draw(hairLine4);
		graphHair.setStroke(hairLine);
		graphHair.draw(hairLine1);
		graphHair.draw(hairLine2);
		
		GeneralPath shirt = new GeneralPath();
		//GeneralPath hairLine1 = new GeneralPath();
		
		shirt.moveTo(186, 380);
		shirt.curveTo(181, 396, 162, 448, 172, 455);
		shirt.lineTo(171, 481);
		shirt.curveTo(169, 484, 158, 499, 156, 503);
		shirt.lineTo(156, 509);
		shirt.lineTo(157, 511);
		shirt.lineTo(157, 528);
		shirt.curveTo(160, 536, 166, 540, 172, 542);
		shirt.lineTo(185, 536);
		shirt.curveTo(198, 543, 219, 551, 244, 555);
		shirt.curveTo(257, 552, 267, 552, 270, 557);
		shirt.lineTo(277, 559);
		shirt.lineTo(321, 566);
		shirt.lineTo(378, 543);
		shirt.lineTo(375, 532);
		shirt.lineTo(371, 523);
		shirt.curveTo(374, 518, 377, 508, 377, 502);
		shirt.curveTo(384, 493, 391, 473, 394, 432);
		shirt.lineTo(202, 381);
		shirt.lineTo(186, 380);
		graphCloth.setStroke(sketchLine);
		graphCloth.setColor(gokuRed1);
		graphCloth.fill(shirt);
		
		GeneralPath face = new GeneralPath();
		face.moveTo(188, 356);
		face.curveTo(188, 367, 198, 385, 206, 387);
		face.lineTo(216, 391);
		face.curveTo(216, 410, 249, 434, 271, 444);
		face.curveTo(290, 451, 296, 451, 310, 448);
		graphFace.setStroke(sketchLine);
		graphFace.setColor(gokuSkin1);
		graphFace.draw(face);
    }
    
    public static void main (String[] args) {
        Goku goku = new Goku();
        goku.setTitle("Goku - Ryan Arioja, 4CSC");
        goku.setBackground(Color.white);
        goku.setSize(700, 700);
        goku.setVisible(true);
        goku.setForeground(Color.black);
    }
}