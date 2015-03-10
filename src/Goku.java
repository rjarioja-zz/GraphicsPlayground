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
        BasicStroke outLine = new BasicStroke(1.75f);
		//BasicStroke outLine = new BasicStroke(3.0f);
        
		// Colors
		Color gokuBlack = new Color(0, 0, 0);
		Color gokuRed1 = new Color(210, 20, 20);
		Color gokuRed2 = new Color(145, 0, 0);
		Color gokuYellow1 = new Color(240, 225, 40);
		Color gokuBlue1 = new Color(30, 60, 190);
		Color gokuBlue2 = new Color(15, 30, 75);
		Color gokuSkin1 = new Color(255, 200, 150);
		Color gokuSkin2 = new Color(225, 130, 78);
		
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
		hair.curveTo(225, 426, 350, 450, 400, 420);
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
		shirt.curveTo(378, 510, 379, 492, 379, 488);
		shirt.curveTo(389, 480, 393, 460, 394, 438);
		shirt.curveTo(367, 434, 322, 507, 228, 418);
		shirt.curveTo(233, 404, 215, 380, 200, 383);
		shirt.curveTo(195, 380, 184, 379, 185, 382);
		graphShirt.setColor(gokuRed1);
		graphShirt.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		graphShirt.fill(shirt);
		
		Graphics2D graphFace = (Graphics2D) g;
		GeneralPath face = new GeneralPath();
		face.moveTo(218, 318);
		face.lineTo(216, 329);
		face.curveTo(198, 303, 172, 346, 199, 382);
		face.curveTo(204, 384, 209, 391, 212, 389);
		face.curveTo(221, 396, 213, 402, 229, 418);
		face.quadTo(229, 443, 243, 451);
		face.lineTo(273, 481);
		face.lineTo(330, 462);
		face.curveTo(379, 436, 386, 421, 394, 417);
		face.curveTo(417, 404, 432, 357, 400, 365);
		face.lineTo(406, 351);
		face.lineTo(382, 365);
		face.curveTo(396, 346, 417, 318, 409, 288);
		face.curveTo(396, 302, 365, 326, 352, 334);
		face.curveTo(361, 317, 379, 295, 380, 265);
		face.curveTo(353, 279, 323, 303, 304, 326);
		face.curveTo(303, 305, 313, 279, 327, 251);
		face.curveTo(301, 258, 277, 286, 268, 301);
		face.curveTo(265, 287, 276, 261, 288, 235);
		face.curveTo(264, 245, 245, 267, 243, 309);
		face.curveTo(238, 301, 237, 292, 238, 267);
		face.curveTo(226, 285, 220, 308, 227, 328);
		face.quadTo(221, 325, 218, 318);
		graphFace.setColor(gokuSkin1);
		graphFace.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		graphFace.fill(face);
		
		Graphics2D graphNeckShade = (Graphics2D) g;
		GeneralPath neckShade = new GeneralPath();
		neckShade.moveTo(229, 419);
		neckShade.quadTo(231, 436, 233, 440);
		neckShade.curveTo(254, 446, 258, 458, 283, 461);
		neckShade.curveTo(312, 460, 330, 463, 335, 460);
		neckShade.curveTo(343, 454, 350, 445, 355, 437);
		neckShade.curveTo(348, 444, 333, 449, 302, 450);
		neckShade.curveTo(275, 452, 257, 437, 229, 419);
		graphNeckShade.setColor(gokuSkin2);
		graphNeckShade.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		graphNeckShade.fill(neckShade);
		
		Graphics2D graphShirtShade1 = (Graphics2D) g;
		GeneralPath shirtShade1 = new GeneralPath();
		shirtShade1.moveTo(335, 460);
		shirtShade1.quadTo(349, 447, 356, 437);
		shirtShade1.curveTo(366, 429, 367, 426, 372, 418);
		shirtShade1.curveTo(377, 425, 380, 409, 393, 416);
		shirtShade1.curveTo(394, 424, 395, 433, 394, 438);
		shirtShade1.curveTo(382, 436, 348, 461, 335, 460);
		shirtShade1.moveTo(378, 500);
		shirtShade1.curveTo(381, 492, 384, 489, 390, 470);
		shirtShade1.curveTo(389, 475, 382, 482, 377, 488);
		shirtShade1.lineTo(378, 500);
		graphShirtShade1.setColor(gokuRed2);
		graphShirtShade1.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		graphShirtShade1.fill(shirtShade1);
		
		Graphics2D graphLeftArm = (Graphics2D) g;
		GeneralPath leftArm = new GeneralPath();
		leftArm.moveTo(394, 431);
		leftArm.lineTo(412, 417);
		leftArm.curveTo(426, 416, 426, 420, 432, 419);
		leftArm.curveTo(441, 418, 448, 414, 459, 415);
		leftArm.quadTo(468, 418, 468, 470);
		leftArm.curveTo(454, 469, 448, 476, 401, 476);
		leftArm.lineTo(390, 469);
		leftArm.quadTo(393, 456, 394, 431);
		graphLeftArm.setColor(gokuSkin1);
		graphLeftArm.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		graphLeftArm.fill(leftArm);
		
		Graphics2D graphLeftArmShade = (Graphics2D) g;
		GeneralPath leftArmShade = new GeneralPath();
		leftArmShade.moveTo(394, 420);
		leftArmShade.quadTo(401, 418, 413, 417);
		leftArmShade.lineTo(394, 431);
		leftArmShade.lineTo(394, 420);
		leftArmShade.moveTo(390, 469);
		leftArmShade.lineTo(402, 476);
		leftArmShade.curveTo(448, 476, 454, 469, 467, 470);
		leftArmShade.lineTo(467, 477);
		leftArmShade.curveTo(464, 478, 467, 485, 434, 484);
		leftArmShade.quadTo(411, 495, 380, 494);
		leftArmShade.curveTo(385, 487, 387, 480, 390, 469);
		graphLeftArmShade.setColor(gokuSkin2);
		graphLeftArmShade.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		graphLeftArmShade.fill(leftArmShade);
		
		Graphics2D graphLeftWrist = (Graphics2D) g;
		GeneralPath leftWrist = new GeneralPath();
		leftWrist.moveTo(458, 414);
		leftWrist.curveTo(460, 412, 463, 408, 467, 408);
		leftWrist.curveTo(469, 413, 472, 407, 488, 411);
		leftWrist.curveTo(496, 405, 504, 431, 502, 440);
		leftWrist.quadTo(505, 443, 505, 458);
		leftWrist.curveTo(493, 461, 494, 471, 468, 469);
		leftWrist.curveTo(468, 445, 465, 416, 458, 414);
		graphLeftWrist.setColor(gokuBlue1);
		graphLeftWrist.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		graphLeftWrist.fill(leftWrist);
		
		Graphics2D graphLeftWristShade = (Graphics2D) g;
		GeneralPath leftWristShade = new GeneralPath();
		leftWristShade.moveTo(468, 469);
		leftWristShade.curveTo(494, 470, 493, 460, 505, 457);
		leftWristShade.curveTo(505, 467, 504, 480, 493, 477);
		leftWristShade.curveTo(492, 479, 480, 484, 473, 481);
		leftWristShade.curveTo(470, 486, 468, 488, 460, 482);
		leftWristShade.curveTo(466, 481, 466, 478, 468, 469);
		graphLeftWristShade.setColor(gokuBlue2);
		graphLeftWristShade.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		graphLeftWristShade.fill(leftWristShade);
		
		Graphics2D graphLeftHand = (Graphics2D) g;
		GeneralPath leftHand = new GeneralPath();
		leftHand.moveTo(496, 414);
		leftHand.curveTo(502, 417, 503, 402, 539, 405);
		leftHand.curveTo(564, 428, 565, 440, 553, 453);
		leftHand.curveTo(528, 442, 564, 446, 534, 428);
		leftHand.curveTo(530, 436, 527, 450, 537, 454);
		leftHand.quadTo(543, 464, 518, 463);
		leftHand.curveTo(512, 461, 511, 456, 505, 457);
		leftHand.curveTo(506, 454, 505, 448, 502, 440);
		leftHand.curveTo(503, 434, 503, 427, 496, 414);
		graphLeftHand.setColor(gokuSkin1);
		graphLeftHand.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		graphLeftHand.fill(leftHand);
		
		Graphics2D graphLeftHandShade = (Graphics2D) g;
		GeneralPath leftHandShade = new GeneralPath();
		leftHandShade.moveTo(505, 457);
		leftHandShade.curveTo(511, 456, 512, 461, 518, 463);
		leftHandShade.quadTo(543, 464, 537, 454);
		leftHandShade.curveTo(527, 450, 530, 436, 534, 428);
		leftHandShade.curveTo(564, 446, 528, 442, 552, 453);
		leftHandShade.curveTo(550, 455, 548, 460, 545, 459);
		leftHandShade.curveTo(551, 469, 538, 474, 535, 474);
		leftHandShade.curveTo(522, 473, 517, 478, 507, 468);
		leftHandShade.lineTo(504, 470);
		leftHandShade.curveTo(504, 466, 505, 465, 505, 457);
		graphLeftHandShade.setColor(gokuSkin2);
		graphLeftHandShade.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		graphLeftHandShade.fill(leftHandShade);
		
		
		
		
		
		
		
		
		
		
		
		
		
		Graphics2D graphFaceOutline = (Graphics2D) g;
		GeneralPath faceOutline = new GeneralPath();
		
		faceOutline.moveTo(378, 409);
		faceOutline.curveTo(358, 438, 353, 446, 302, 449);
		faceOutline.curveTo(291, 451, 278, 447, 273, 445);
		faceOutline.curveTo(229, 419, 214, 415, 215, 375);
		graphFaceOutline.setColor(gokuBlack);
		graphFaceOutline.setStroke(outLine);
		graphFaceOutline.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		graphFaceOutline.draw(faceOutline);
		
		Graphics2D graphShirtOutline = (Graphics2D) g;
		GeneralPath shirtOutline = new GeneralPath();
		
		shirtOutline.moveTo(378, 500);
		shirtOutline.curveTo(382, 488, 396, 461, 393, 416);
		graphShirtOutline.setColor(gokuBlack);
		graphShirtOutline.setStroke(hairLine);
		graphShirtOutline.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		graphShirtOutline.draw(shirtOutline);
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