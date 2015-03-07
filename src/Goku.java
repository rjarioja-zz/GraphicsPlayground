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
        BasicStroke sketchLine = new BasicStroke(1.0f);
        BasicStroke hairLine = new BasicStroke(1.25f);
		//BasicStroke outLine = new BasicStroke(3.0f);
        
		// Colors
		Color gokuBlack = new Color(0, 0, 0);
		Color gokuRed1 = new Color(210, 20, 20);
		Color gokuRed2 = new Color(145, 0, 0);
		Color gokuYellow1 = new Color(240, 225, 40);
		Color gokuBlue1 = new Color(30, 60, 190);
		Color gokuSkin1 = new Color(255, 200, 150);
		
		Graphics2D graphHair = (Graphics2D) g;
		GeneralPath hair = new GeneralPath();
		GeneralPath hairLine1 = new GeneralPath();
		GeneralPath hairLine2 = new GeneralPath();
		GeneralPath hairLine3 = new GeneralPath();
		GeneralPath hairLine4 = new GeneralPath();
		
		hair.moveTo(218, 52);
		hair.curveTo(240, 90, 245, 115, 246, 176);
		hair.curveTo(222, 150, 167, 106, 107, 114);
		hair.curveTo(140, 152, 160, 200, 190, 250);
		hair.curveTo(140, 225, 111, 215, 84, 213);
		hair.lineTo(167, 338);
		hair.lineTo(120, 315);
		hair.lineTo(190, 380);
		hair.curveTo(225, 426, 350, 450, 395, 420);
		hair.lineTo(475, 396);
		hair.lineTo(440, 393);
		hair.lineTo(555, 350);
		hair.curveTo(527, 343, 492, 340, 472, 339);
		hair.lineTo(575, 280);
		hair.curveTo(534, 265, 505, 262, 456, 265);
		hair.curveTo(452, 195, 379, 162, 325, 180);
		hair.curveTo(311, 124, 283, 70, 218, 52);
		hairLine1.moveTo(200, 70);
		hairLine1.curveTo(228, 102, 237, 140, 246, 176);
		hairLine2.moveTo(165, 335);
		hairLine2.lineTo(112, 294);
		hairLine3.moveTo(456, 263);
		hairLine3.curveTo(475, 260, 525, 250, 566, 252);
		hairLine4.moveTo(472, 339);
		hairLine4.lineTo(555, 333);
		graphHair.setColor(gokuBlack);
		graphHair.setStroke(hairLine);
		graphHair.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		graphHair.fill(hair);
		graphHair.draw(hairLine1);
		graphHair.draw(hairLine2);
		graphHair.draw(hairLine3);
		graphHair.draw(hairLine4);

		
		Graphics2D graphShirt = (Graphics2D) g;
		GeneralPath shirt = new GeneralPath();
		
		shirt.moveTo(185, 382);
		shirt.curveTo(177, 411, 162, 450, 172, 466);
		shirt.lineTo(172, 481);
		shirt.curveTo(160, 495, 150, 500, 156, 511);
		shirt.curveTo(146, 585, 365, 605, 375, 533);
		shirt.lineTo(371, 522);
		shirt.curveTo(378, 510, 379, 492, 379, 485);
		shirt.curveTo(389, 480, 393, 460, 394, 438);
		shirt.curveTo(367, 434, 322, 507, 228, 418);
		shirt.curveTo(233, 404, 215, 380, 200, 383);
		shirt.curveTo(195, 380, 184, 379, 185, 382);
		graphShirt.setColor(gokuRed1);
		graphShirt.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		graphShirt.fill(shirt);
		
		Graphics2D graphSkin1 = (Graphics2D) g;
		GeneralPath skin1 = new GeneralPath();
		
		skin1.moveTo(218, 318);
		skin1.lineTo(216, 329);
		skin1.curveTo(198, 303, 172, 346, 199, 382);
		skin1.curveTo(204, 384, 209, 391, 212, 389);
		skin1.curveTo(221, 396, 213, 402, 229, 418);
		skin1.quadTo(229, 443, 243, 451);
		skin1.lineTo(273, 481);
		skin1.lineTo(330, 462);
		skin1.curveTo(379, 436, 386, 421, 394, 417);
		skin1.curveTo(417, 404, 432, 357, 400, 365);
		skin1.lineTo(406, 351);
		skin1.lineTo(382, 365);
		skin1.curveTo(396, 346, 417, 318, 409, 288);
		skin1.curveTo(396, 302, 365, 326, 352, 334);
		skin1.curveTo(361, 317, 379, 295, 380, 265);
		skin1.curveTo(353, 279, 323, 303, 304, 326);
		skin1.curveTo(303, 305, 313, 279, 327, 251);
		skin1.curveTo(301, 258, 277, 286, 268, 301);
		skin1.curveTo(265, 287, 276, 261, 288, 235);
		skin1.curveTo(264, 245, 245, 267, 243, 309);
		skin1.curveTo(238, 301, 237, 292, 238, 267);
		skin1.curveTo(226, 285, 220, 308, 227, 328);
		skin1.quadTo(221, 325, 218, 318);
		graphSkin1.setColor(gokuSkin1);
		graphSkin1.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		graphSkin1.fill(skin1);
		
		Graphics2D graphShirtShade1 = (Graphics2D) g;
		GeneralPath shirtShade1 = new GeneralPath();
		
		shirtShade1.moveTo(335, 460);
		shirtShade1.quadTo(349, 447, 356, 437);
		shirtShade1.curveTo(366, 429, 367, 426, 372, 418);
		shirtShade1.curveTo(377, 425, 380, 409, 393, 416);
		shirtShade1.curveTo(394, 424, 395, 433, 394, 438);
		shirtShade1.curveTo(382, 436, 348, 461, 335, 460);
		graphShirtShade1.setColor(gokuRed2);
		graphShirtShade1.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		graphShirtShade1.fill(shirtShade1);
		
		Graphics2D graphLeftArm = (Graphics2D) g;
		GeneralPath leftArm = new GeneralPath();
		
		leftArm.moveTo(394, 431);
		leftArm.lineTo(412, 417);
		leftArm.curveTo(426, 416, 426, 420, 432, 419);
		leftArm.curveTo(441, 418, 448, 414, 459, 415);
		leftArm.quadTo(468, 418, 468, 469);
		leftArm.curveTo(454, 469, 448, 476, 401, 476);
		leftArm.lineTo(390, 469);
		leftArm.quadTo(393, 456, 394, 431);
		
		graphLeftArm.setColor(gokuSkin1);
		graphLeftArm.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		graphLeftArm.fill(leftArm);
		
		
		
		
		
		Graphics2D graphFaceOutline = (Graphics2D) g;
		GeneralPath faceOutline = new GeneralPath();
		
		faceOutline.moveTo(378, 409);
		faceOutline.curveTo(358, 438, 353, 446, 302, 449);
		faceOutline.curveTo(291, 451, 278, 447, 273, 445);
		faceOutline.curveTo(229, 419, 214, 415, 215, 375);
		graphFaceOutline.setColor(gokuBlack);
		graphFaceOutline.setStroke(hairLine);
		graphFaceOutline.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		graphFaceOutline.draw(faceOutline);
		
    }
    
    public static void main (String[] args) {
        Goku goku = new Goku();
        goku.setTitle("Goku - Ryan Arioja, 4CSC");
        goku.setBackground(Color.white);
        goku.setSize(590, 820);
        goku.setVisible(true);
        goku.setForeground(Color.black);
    }
}