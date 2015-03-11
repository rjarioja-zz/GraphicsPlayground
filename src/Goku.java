/**
*
* @author Ryan Arioja, 4CSC
*
*/

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.geom.*;
        
public class Goku extends Frame {
    
	private static final long serialVersionUID = -5104858925667968715L;

	class CloseHandler extends WindowAdapter {
		public void windowClosing(WindowEvent we) {	
			System.exit(0); 
		}
	}
	
	public Goku() {
		addWindowListener(new CloseHandler());
		setTitle("Goku - Ryan Arioja, 4CSC");
        setBackground(Color.white);
        setForeground(Color.black);
        setResizable(false);
	}
	
	public void paint(Graphics g) {
		
        BasicStroke sketchLine = new BasicStroke(1.0f);
        BasicStroke hairLine = new BasicStroke(1.25f);
        BasicStroke outLine = new BasicStroke(1.75f);
		//BasicStroke outLine = new BasicStroke(3.0f);
        
		//Colors
		Color gokuBlack1 = new Color(0, 0, 0);
		Color gokuBlack2 = new Color(25, 25, 25);
		Color gokuRed1 = new Color(210, 20, 20);
		Color gokuRed2 = new Color(145, 0, 0);
		Color gokuYellow1 = new Color(240, 225, 40);
		Color gokuYellow2 = new Color(218, 199, 0);
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
		graphHair.setColor(gokuBlack1);
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
		shirt.curveTo(146, 575, 365, 600, 375, 533);
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
		GeneralPath shirtShade = new GeneralPath();
		shirtShade.moveTo(335, 460);
		shirtShade.quadTo(349, 447, 356, 437);
		shirtShade.curveTo(366, 429, 367, 426, 372, 418);
		shirtShade.curveTo(377, 425, 380, 409, 393, 416);
		shirtShade.curveTo(394, 424, 395, 433, 394, 438);
		shirtShade.curveTo(382, 436, 348, 461, 335, 460);
		shirtShade.moveTo(378, 500);
		shirtShade.curveTo(381, 492, 384, 489, 390, 470);
		shirtShade.curveTo(389, 475, 382, 482, 377, 488);
		shirtShade.lineTo(378, 500);
		shirtShade.moveTo(199, 409);
		shirtShade.curveTo(200, 430, 214, 457, 221, 461);
		shirtShade.curveTo(223, 465, 228, 470, 231, 471);
		shirtShade.curveTo(222, 444, 221, 465, 199, 409);
		shirtShade.moveTo(225, 490);
		shirtShade.curveTo(242, 501, 258, 524, 287, 520);
		shirtShade.lineTo(285, 511);
		shirtShade.curveTo(259, 508, 243, 492, 225, 490);
		shirtShade.moveTo(157, 522);
		shirtShade.curveTo(157, 533, 165, 539, 172, 542);
		shirtShade.lineTo(185, 535);
		shirtShade.curveTo(189, 542, 245, 559, 251, 554);
		shirtShade.curveTo(255, 552, 267, 551, 271, 556);
		shirtShade.curveTo(273, 555, 277, 557, 278, 558);
		shirtShade.curveTo(281, 558, 286, 561, 314, 561);
		shirtShade.curveTo(300, 553, 291, 544, 288, 539);
		shirtShade.curveTo(287, 537, 279, 541, 275, 545);
		shirtShade.curveTo(254, 551, 227, 537, 218, 528);
		shirtShade.curveTo(213, 526, 192, 528, 176, 532);
		shirtShade.curveTo(169, 531, 163, 521, 157, 522);
		shirtShade.moveTo(320, 563);
		shirtShade.curveTo(326, 560, 321, 557, 343, 557);
		shirtShade.curveTo(356, 548, 375, 550, 374, 531);
		shirtShade.curveTo(385, 547, 374, 551, 365, 560);
		shirtShade.lineTo(345, 560);
		shirtShade.curveTo(336, 564, 326, 568, 320, 563);
		graphShirtShade1.setColor(gokuRed2);
		graphShirtShade1.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		graphShirtShade1.fill(shirtShade);
		
		Graphics2D graphLogoBorder = (Graphics2D) g;
		GeneralPath logoBorder = new GeneralPath();
		logoBorder.moveTo(284, 510);
		logoBorder.curveTo(286, 485, 309, 476, 326, 477);
		logoBorder.curveTo(342, 478, 363, 488, 362, 518);
		logoBorder.curveTo(360, 532, 348, 549, 317, 549);
		logoBorder.curveTo(297, 544, 283, 535, 284, 510);
		graphLogoBorder.setColor(gokuBlack1);
		graphLogoBorder.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		graphLogoBorder.fill(logoBorder);
		
		Graphics2D graphLogoCircle = (Graphics2D) g;
		GeneralPath logoCircle = new GeneralPath();
		logoCircle.moveTo(290, 511);
		logoCircle.curveTo(291, 500, 301, 484, 323, 483);
		logoCircle.curveTo(333, 482, 356, 491, 356, 511);
		logoCircle.curveTo(355, 532, 335, 547, 317, 543);
		logoCircle.curveTo(300, 540, 287, 531, 290, 511);
		graphLogoCircle.setColor(gokuYellow1);
		graphLogoCircle.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		graphLogoCircle.fill(logoCircle);
		
		Graphics2D graphLogoShade = (Graphics2D) g;
		GeneralPath logoShade = new GeneralPath();
		logoShade.moveTo(290, 511);
		logoShade.curveTo(289, 514, 298, 512, 303, 512);
		logoShade.curveTo(302, 515, 297, 519, 290, 520);
		logoShade.closePath();
		graphLogoShade.setColor(gokuYellow2);
		graphLogoShade.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		graphLogoShade.fill(logoShade);
		
		Graphics2D graphLogo = (Graphics2D) g;
		GeneralPath logo = new GeneralPath();
		logo.moveTo(324, 483);
		logo.curveTo(321, 488, 317, 490, 307, 491);
		logo.curveTo(314, 500, 303, 489, 306, 502);
		logo.curveTo(306, 504, 305, 507, 303, 507);
		logo.curveTo(303, 508, 309, 512, 317, 511);
		logo.curveTo(319, 518, 304, 510, 299, 509);
		logo.curveTo(301, 511, 301, 517, 295, 523);
		logo.curveTo(297, 527, 303, 526, 310, 528);
		logo.curveTo(310, 538, 313, 540, 335, 540);
		graphLogo.setColor(gokuBlack1);
		graphLogo.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		graphLogo.draw(logo);
		
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
		
		Graphics2D graphRightArm = (Graphics2D) g;
		GeneralPath rightArm = new GeneralPath();
		rightArm.moveTo(184, 382);
		rightArm.curveTo(178, 383, 159, 364, 135, 365);
		rightArm.curveTo(132, 361, 122, 356, 117, 355);
		rightArm.curveTo(112, 350, 90, 373, 88, 401);
		rightArm.curveTo(148, 434, 164, 431, 169, 440);
		rightArm.closePath();
		graphRightArm.setColor(gokuSkin1);
		graphRightArm.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		graphRightArm.fill(rightArm);
		
		Graphics2D graphRightArmShade = (Graphics2D) g;
		GeneralPath rightArmShade = new GeneralPath();
		rightArmShade.moveTo(169, 440);
		rightArmShade.curveTo(164, 431, 148, 434, 88, 401);
		rightArmShade.quadTo(88, 413, 90, 414);
		rightArmShade.curveTo(103, 425, 96, 415, 125, 433);
		rightArmShade.curveTo(134, 440, 158, 444, 169, 455);
		rightArmShade.closePath();
		graphRightArmShade.setColor(gokuSkin2);
		graphRightArmShade.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		graphRightArmShade.fill(rightArmShade);
		
		Graphics2D graphRightHand = (Graphics2D) g;
		GeneralPath rightHand = new GeneralPath();
		rightHand.moveTo(74, 344);
		rightHand.curveTo(65, 333, 41, 330, 39, 333);
		rightHand.curveTo(32, 329, 19, 331, 12, 346);
		rightHand.curveTo(1, 360, 0, 366, 7, 373);
		rightHand.curveTo(14, 355, 24, 360, 24, 356);
		rightHand.lineTo(29, 351);
		rightHand.curveTo(35, 360, 29, 376, 25, 375);
		rightHand.curveTo(14, 382, 13, 380, 22, 390);
		rightHand.curveTo(36, 392, 37, 384, 51, 388);
		rightHand.closePath();
		graphRightHand.setColor(gokuSkin1);
		graphRightHand.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		graphRightHand.fill(rightHand);
		
		Graphics2D graphRightHandShade = (Graphics2D) g;
		GeneralPath rightHandShade = new GeneralPath();
		rightHandShade.moveTo(51, 388);
		rightHandShade.curveTo(37, 384, 36, 392, 22, 390);
		rightHandShade.curveTo(17, 386, 15, 383, 16, 380);
		rightHandShade.curveTo(11, 379, 9, 377, 7, 373);
		rightHandShade.curveTo(14, 355, 24, 360, 24, 356);
		rightHandShade.lineTo(29, 351);
		rightHandShade.curveTo(35, 360, 29, 376, 25, 375);
		rightHandShade.curveTo(4, 384, 14, 394, 18, 397);
		rightHandShade.curveTo(26, 400, 34, 393, 36, 395);
		rightHandShade.curveTo(37, 395, 41, 399, 53, 397);
		rightHandShade.closePath();
		graphRightHandShade.setColor(gokuSkin2);
		graphRightHandShade.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		graphRightHandShade.fill(rightHandShade);
		
		Graphics2D graphRightWrist = (Graphics2D) g;
		GeneralPath rightWrist = new GeneralPath();
		rightWrist.moveTo(118, 355);
		rightWrist.curveTo(107, 347, 87, 391, 88, 401);
		rightWrist.curveTo(79, 406, 71, 392, 59, 392);
		rightWrist.lineTo(51, 388);
		rightWrist.curveTo(46, 367, 79, 334, 84, 345);
		rightWrist.curveTo(93, 345, 99, 346, 104, 349);
		rightWrist.curveTo(113, 347, 118, 348, 118, 355);
		graphRightWrist.setColor(gokuBlue1);
		graphRightWrist.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		graphRightWrist.fill(rightWrist);
		
		Graphics2D graphRightWristShade = (Graphics2D) g;
		GeneralPath rightWristShade = new GeneralPath();
		rightWristShade.moveTo(88, 401);
		rightWristShade.curveTo(79, 405, 71, 391, 59, 391);
		rightWristShade.lineTo(51, 388);
		rightWristShade.curveTo(50, 397, 55, 403, 62, 404);
		rightWristShade.curveTo(66, 407, 72, 410, 77, 412);
		rightWristShade.curveTo(79, 416, 89, 419, 90, 415);
		rightWristShade.quadTo(88, 413, 87, 401);
		graphRightWristShade.setColor(gokuBlue2);
		graphRightWristShade.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		graphRightWristShade.fill(rightWristShade);
		
		Graphics2D graphBelt = (Graphics2D) g;
		GeneralPath belt = new GeneralPath();
		belt.moveTo(170, 541);
		belt.curveTo(172, 544, 178, 539, 185, 535);
		belt.curveTo(189, 542, 245, 559, 251, 554);
		belt.curveTo(255, 552, 267, 551, 271, 556);
		belt.curveTo(273, 555, 277, 557, 278, 558);
		belt.curveTo(281, 558, 286, 561, 314, 561);
		belt.curveTo(322, 568, 327, 569, 335, 567);
		belt.curveTo(338, 568, 340, 571, 340, 574);
		belt.curveTo(332, 575, 313, 576, 297, 574);
		graphBelt.setColor(gokuBlack2);
		graphBelt.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		graphBelt.fill(belt);
		
		
		
		
		
		
		
		Graphics2D graphFaceOutline = (Graphics2D) g;
		GeneralPath faceOutline = new GeneralPath();
		
		faceOutline.moveTo(378, 409);
		faceOutline.curveTo(358, 438, 353, 446, 302, 449);
		faceOutline.curveTo(291, 451, 278, 447, 273, 445);
		faceOutline.curveTo(229, 419, 214, 415, 215, 375);
		graphFaceOutline.setColor(gokuBlack1);
		graphFaceOutline.setStroke(outLine);
		graphFaceOutline.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		graphFaceOutline.draw(faceOutline);
		
		Graphics2D graphShirtOutline = (Graphics2D) g;
		GeneralPath shirtOutline = new GeneralPath();
		
		shirtOutline.moveTo(377, 501); //left sleeve
		shirtOutline.curveTo(382, 488, 396, 461, 393, 416);
		shirtOutline.moveTo(378, 476);
		shirtOutline.curveTo(380, 443, 379, 512, 370, 523);
		
		shirtOutline.moveTo(185, 382); //right sleeve
		shirtOutline.curveTo(177, 411, 162, 450, 172, 466);
		shirtOutline.moveTo(181, 439);
		shirtOutline.curveTo(167, 477, 174, 478, 168, 497);
		graphShirtOutline.setColor(gokuBlack1);
		graphShirtOutline.setStroke(hairLine);
		graphShirtOutline.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		graphShirtOutline.draw(shirtOutline);
    }
    
    public static void main (String[] args) {
        Goku goku = new Goku();
        goku.setSize(579, 820);
        goku.setVisible(true);
    }
}