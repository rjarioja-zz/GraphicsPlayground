/**
*
* @author Ryan Arioja, 4CSC
*
*/

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.geom.*;
        
public class Portrait extends Frame {
    
	private static final long serialVersionUID = -5104858925667968715L;

	//Strokes
	BasicStroke sketchLine = new BasicStroke(1.0f);
    BasicStroke hairLine = new BasicStroke(1.25f);
    BasicStroke outLine = new BasicStroke(1.75f);
	//BasicStroke outLine = new BasicStroke(3.0f);
    
	//Colors
	Color hairBlack = new Color(1, 1, 1);
	Color hairBlue1 = new Color(3, 7, 55);
	Color hairBlue2 = new Color(5, 8, 85);
	Color hairBrown = new Color(57, 8, 3);

	class CloseHandler extends WindowAdapter {
		public void windowClosing(WindowEvent we) {	
			System.exit(0); 
		}
	}
	
	public Portrait() {
		addWindowListener(new CloseHandler());
		setTitle("\"It's feels weird being encapsulated into an object.\"");
        setBackground(Color.white);
        setResizable(false);
	}
	
	public Graphics2D drawBackground(Graphics g) {
		Graphics2D graph = (Graphics2D) g;
		graph.setStroke(sketchLine);
		graph.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		GeneralPath bg1 = new GeneralPath();
		GeneralPath bg2 = new GeneralPath();
		
		bg1.moveTo(133, 25);
		bg1.curveTo(143, 35, 124, 28, 120, 41);
		bg1.curveTo(122, 45, 117, 51, 110, 47);
		bg1.curveTo(106, 57, 119, 62, 114, 72);
		bg1.curveTo(107, 73, 104, 65, 97, 65);
		bg1.curveTo(109, 78, 113, 72, 118, 77);
		bg1.curveTo(121, 85, 108, 89, 130, 93);
		bg1.curveTo(137, 102, 127, 104, 135, 108);
		bg1.curveTo(148, 138, 125, 106, 127, 144);
		bg1.curveTo(162, 170, 146, 145, 158, 166);
		bg1.curveTo(171, 175, 173, 156, 186, 184);
		bg1.curveTo(189, 205, 205, 210, 205, 237);
		bg1.curveTo(204, 260, 176, 305, 194, 321);
		bg1.curveTo(210, 343, 239, 314, 226, 342);
		bg1.curveTo(207, 348, 225, 378, 243, 367);
		bg1.curveTo(241, 387, 254, 380, 242, 399);
		bg1.curveTo(241, 423, 256, 426, 268, 416);
		bg1.curveTo(284, 427, 257, 421, 281, 454);
		bg1.curveTo(298, 469, 323, 472, 376, 456);
		bg1.curveTo(383, 477, 412, 489, 408, 500);
		bg1.curveTo(400, 508, 412, 507, 398, 525);
		bg1.curveTo(394, 552, 374, 559, 370, 619);
		bg1.curveTo(358, 645, 362, 648, 365, 665);
		bg1.lineTo(0, 665);
		bg1.lineTo(0, 25);
		bg1.closePath();
		
		GradientPaint gradient1 = new GradientPaint(252, 666, new Color(76, 126, 42), 0, 666, Color.white);
		graph.setPaint(gradient1);
		graph.fill(bg1);
		
		bg2.moveTo(133, 25);
		bg2.curveTo(143, 35, 124, 28, 120, 41);
		bg2.curveTo(122, 45, 117, 51, 110, 47);
		bg2.curveTo(106, 57, 119, 62, 114, 72);
		bg2.curveTo(107, 73, 104, 65, 97, 65);
		bg2.curveTo(109, 78, 113, 72, 118, 77);
		bg2.curveTo(121, 85, 108, 89, 130, 93);
		bg2.curveTo(137, 102, 127, 104, 135, 108);
		bg2.curveTo(148, 138, 125, 106, 127, 144);
		bg2.curveTo(162, 170, 146, 145, 158, 166);
		bg2.curveTo(171, 175, 173, 156, 186, 184);
		bg2.curveTo(189, 205, 205, 210, 205, 237);
		bg2.curveTo(204, 260, 176, 305, 194, 321);
		bg2.curveTo(210, 343, 239, 314, 226, 342);
		bg2.curveTo(207, 348, 225, 378, 243, 367);
		bg2.curveTo(241, 387, 254, 380, 242, 399);
		bg2.curveTo(241, 423, 256, 426, 268, 416);
		bg2.curveTo(284, 427, 257, 421, 281, 454);
		bg2.curveTo(298, 469, 323, 472, 376, 456);
		bg2.curveTo(383, 477, 412, 489, 408, 500);
		bg2.curveTo(400, 508, 412, 507, 398, 525);
		bg2.curveTo(394, 552, 374, 559, 370, 619);
		bg2.curveTo(358, 645, 362, 648, 365, 665);
		bg2.lineTo(0, 665);
		bg2.lineTo(0, 25);
		bg2.closePath();
		
		GradientPaint gradient2 = new GradientPaint(86, 666, new Color(80, 193, 68), 0, 666, Color.white);
		graph.setPaint(gradient2);
		//graph.fill(bg2);
		
		return graph;
	}
	public Graphics2D drawHair(Graphics g) {
		Graphics2D graph = (Graphics2D) g;
		graph.setColor(hairBlack);
		graph.setStroke(sketchLine);
		graph.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		GeneralPath hair = new GeneralPath();
		
		hair.moveTo(133, 25);
		hair.curveTo(143, 35, 124, 28, 120, 41);
		hair.curveTo(122, 45, 117, 51, 110, 47);
		hair.curveTo(106, 57, 119, 62, 114, 72);
		hair.curveTo(107, 73, 104, 65, 97, 65);
		hair.curveTo(109, 78, 113, 72, 118, 77);
		hair.curveTo(121, 85, 108, 89, 130, 93);
		hair.curveTo(137, 102, 127, 104, 135, 108);
		hair.curveTo(148, 138, 125, 106, 127, 144);
		hair.curveTo(162, 170, 146, 145, 158, 166);
		hair.curveTo(171, 175, 173, 156, 186, 184);
		hair.curveTo(182, 174, 189, 171, 190, 163);
		hair.curveTo(191, 164, 193, 164, 193, 169);
		hair.curveTo(213, 167, 208, 164, 219, 165);
		hair.curveTo(214, 158, 209, 164, 206, 161);
		hair.curveTo(206, 156, 194, 163, 192, 154);
		hair.curveTo(191, 148, 176, 151, 195, 136);
		hair.curveTo(193, 118, 203, 126, 196, 113);
		hair.curveTo(200, 106, 207, 111, 215, 98);
		hair.curveTo(226, 99, 220, 103, 227, 105);
		hair.curveTo(218, 105, 226, 112, 218, 108);
		hair.curveTo(221, 117, 232, 121, 262, 121);
		hair.curveTo(261, 125, 256, 129, 253, 129);
		hair.curveTo(261, 132, 262, 123, 271, 127);
		hair.curveTo(281, 138, 276, 146, 278, 145);
		hair.curveTo(276, 146, 276, 148, 274, 145);
		hair.curveTo(274, 156, 288, 147, 290, 152);
		hair.curveTo(294, 163, 278, 158, 308, 173);
		hair.curveTo(330, 182, 293, 184, 349, 184);
		hair.curveTo(358, 176, 354, 196, 367, 210);
		hair.curveTo(368, 228, 364, 212, 353, 230);
		hair.curveTo(346, 230, 340, 227, 338, 224);
		hair.curveTo(335, 232, 340, 236, 357, 237);
		hair.curveTo(365, 243, 370, 237, 374, 237);
		hair.curveTo(391, 209, 379, 244, 427, 191);
		hair.curveTo(426, 154, 449, 150, 461, 153);
		hair.curveTo(473, 156, 488, 171, 493, 177);
		hair.curveTo(496, 185, 498, 205, 499, 218);
		hair.curveTo(501, 215, 507, 217, 508, 212);
		hair.curveTo(511, 210, 517, 215, 521, 210);
		hair.curveTo(522, 203, 523, 202, 528, 201);
		hair.curveTo(540, 216, 531, 225, 527, 231);
		hair.curveTo(525, 246, 526, 248, 530, 248);
		hair.curveTo(531, 260, 518, 264, 526, 269);
		hair.curveTo(530, 272, 526, 287, 530, 296);
		hair.curveTo(534, 325, 534, 304, 546, 319);
		hair.curveTo(567, 327, 583, 306, 581, 336);
		hair.curveTo(644, 280, 631, 220, 642, 209);
		hair.lineTo(642, 59);
		hair.curveTo(638, 48, 633, 29, 626, 25);
		hair.closePath();
		
		graph.fill(hair);
		return graph;
	}
	public Graphics2D drawHairShades(Graphics g) {
		Graphics2D graph = (Graphics2D) g;
		graph.setColor(hairBrown);
		graph.setStroke(sketchLine);
		graph.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		GeneralPath hairShade = new GeneralPath();
		
		hairShade.moveTo(316, 182);
		hairShade.curveTo(312, 195, 354, 190, 344, 210);
		hairShade.lineTo(339, 210);
		hairShade.curveTo(347, 217, 352, 218, 363, 203);
		hairShade.lineTo(363, 150);
		hairShade.closePath();
		hairShade.moveTo(249, 120);
		hairShade.curveTo(245, 125, 240, 129, 232, 130);
		hairShade.curveTo(242, 136, 250, 126, 255, 136);
		hairShade.curveTo(263, 131, 262, 123, 267, 121);
		hairShade.closePath();
		
		graph.fill(hairShade);
		return graph;
	}
	public Graphics2D drawNose(Graphics g) {
		Graphics2D graph = (Graphics2D) g;
		graph.setStroke(sketchLine);
		graph.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		GeneralPath skinShade1 = new GeneralPath();
		skinShade1.moveTo(186, 184);
		skinShade1.curveTo(202, 216, 205, 225, 206, 230);
		skinShade1.curveTo(211, 240, 213, 227, 220, 236);
		skinShade1.curveTo(222, 247, 203, 256, 204, 276);
		skinShade1.curveTo(213, 289, 238, 292, 219, 306);
		skinShade1.curveTo(202, 302, 192, 314, 194, 320);
		skinShade1.curveTo(206, 339, 241, 326, 233, 296);
		skinShade1.curveTo(210, 283, 227, 250, 224, 234);
		skinShade1.closePath();
		graph.setColor(new Color(255, 254, 153));
		graph.fill(skinShade1);
		
		GeneralPath skinShade2 = new GeneralPath();
		skinShade2.moveTo(224, 234);
		skinShade2.curveTo(227, 254, 215, 270, 220, 278);
		skinShade2.curveTo(233, 279, 244, 296, 242, 311);
		skinShade2.curveTo(245, 326, 230, 318, 234, 341);
		skinShade2.curveTo(237, 343, 247, 348, 252, 357);
		skinShade2.curveTo(249, 342, 260, 343, 251, 329);
		skinShade2.curveTo(249, 313, 250, 307, 258, 295);
		skinShade2.curveTo(242, 233, 208, 241, 235, 227);
		skinShade2.curveTo(224, 221, 219, 230, 212, 226);
		skinShade2.curveTo(210, 212, 217, 208, 186, 184);
		skinShade2.curveTo(211, 236, 219, 227, 224, 234);
		graph.setColor(new Color(255, 254, 107));
		graph.fill(skinShade2);
		
		GeneralPath skinShade3 = new GeneralPath();
		skinShade3.moveTo(219, 280);
		skinShade3.curveTo(218, 295, 238, 287, 233, 313);
		skinShade3.curveTo(216, 329, 206, 316, 198, 320);
		skinShade3.curveTo(210, 343, 239, 314, 226, 342);
		skinShade3.curveTo(241, 343, 231, 333, 242, 320);
		skinShade3.curveTo(247, 312, 231, 297, 231, 284);
		skinShade3.curveTo(228, 278, 222, 275, 219, 280);
		graph.setColor(new Color(252, 190, 53));
		graph.fill(skinShade3);
		
		GeneralPath skinShade4 = new GeneralPath();
		skinShade4.moveTo(228, 287);
		skinShade4.curveTo(228, 294, 249, 309, 228, 324);
		skinShade4.curveTo(214, 327, 210, 321, 202, 322);
		skinShade4.curveTo(215, 333, 231, 320, 230, 337);
		skinShade4.curveTo(255, 313, 235, 307, 235, 295);
		skinShade4.curveTo(234, 293, 231, 287, 228, 287);
		graph.setColor(new Color(130, 13, 4));
		graph.fill(skinShade4);
		
		return graph;
	}
	public Graphics2D drawEye(Graphics g) {
		Graphics2D graph = (Graphics2D) g;
		graph.setStroke(sketchLine);
		graph.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		GeneralPath skinShade15 = new GeneralPath();
		skinShade15.moveTo(172, 146);
		skinShade15.curveTo(202, 179, 305, 222, 367, 230);
		skinShade15.curveTo(406, 101, 186, 36, 172, 146);
		
		GeneralPath skinShade14 = new GeneralPath();
		skinShade14.moveTo(248, 158);
		skinShade14.lineTo(257, 150);
		skinShade14.curveTo(242, 147, 241, 146, 242, 133);
		skinShade14.curveTo(211, 128, 235, 126, 225, 122);
		skinShade14.curveTo(223, 127, 212, 128, 214, 136);
		skinShade14.curveTo(176, 136, 190, 162, 207, 179);
		skinShade14.closePath();
		
		GeneralPath skinShade12 = new GeneralPath();
		skinShade12.moveTo(372, 225);
		skinShade12.curveTo(323, 251, 336, 215, 323, 220);
		skinShade12.curveTo(305, 218, 281, 213, 273, 215);
		skinShade12.curveTo(221, 230, 240, 199, 227, 200);
		skinShade12.curveTo(256, 236, 250, 261, 275, 283);
		skinShade12.curveTo(297, 287, 327, 266, 357, 238);
		skinShade12.closePath();
		
		GeneralPath skinShade13 = new GeneralPath();
		skinShade13.moveTo(303, 278);
		skinShade13.curveTo(283, 279, 272, 279, 258, 295);
		skinShade13.curveTo(250, 307, 249, 313, 251, 329);
		skinShade13.lineTo(262, 362);
		skinShade13.curveTo(258, 356, 253, 357, 252, 357);
		skinShade13.curveTo(250, 333, 257, 345, 268, 335);
		skinShade13.lineTo(296, 320);
		skinShade13.curveTo(295, 317, 307, 287, 303, 278);
		
		GeneralPath skinShade1 = new GeneralPath();
		skinShade1.moveTo(240, 220);
		skinShade1.curveTo(242, 234, 233, 240, 236, 250);
		skinShade1.curveTo(247, 261, 247, 277, 258, 295);
		skinShade1.curveTo(261, 290, 271, 283, 275, 283);
		skinShade1.curveTo(262, 251, 244, 249, 280, 239);
		skinShade1.curveTo(292, 236, 254, 221, 243, 222);
		
		GeneralPath skinShade11 = new GeneralPath();
		skinShade11.moveTo(236, 168);
		skinShade11.curveTo(227, 162, 226, 152, 216, 148);
		skinShade11.lineTo(248, 158);
		skinShade11.curveTo(252, 165, 251, 176, 243, 177);
		skinShade11.curveTo(227, 185, 209, 182, 221, 165);
		skinShade11.closePath();
				
		GeneralPath skinShade10 = new GeneralPath();
		skinShade10.moveTo(236, 170);
		skinShade10.curveTo(228, 154, 219, 142, 196, 148);
		skinShade10.curveTo(190, 163, 216, 170, 236, 170);
				
		GeneralPath skinShade6 = new GeneralPath();
		skinShade6.moveTo(227, 200);
		skinShade6.curveTo(214, 184, 309, 219, 242, 176);
		skinShade6.curveTo(212, 182, 200, 180, 192, 160);
		skinShade6.curveTo(167, 190, 217, 214, 260, 220);
		skinShade6.lineTo(260, 200);
		skinShade6.closePath();
		
		GeneralPath skinShade5 = new GeneralPath();
		skinShade5.moveTo(191, 163);
		skinShade5.curveTo(198, 172, 186, 177, 193, 188);
		skinShade5.curveTo(199, 220, 217, 209, 211, 225);
		skinShade5.curveTo(226, 213, 198, 222, 223, 179);
		skinShade5.curveTo(235, 180, 253, 164, 282, 175);
		skinShade5.curveTo(328, 184, 339, 228, 372, 225);
		skinShade5.curveTo(323, 251, 336, 215, 323, 220);
		skinShade5.curveTo(305, 218, 281, 213, 273, 215);
		skinShade5.curveTo(221, 230, 240, 199, 227, 200);
		skinShade5.curveTo(214, 184, 309, 219, 242, 176);
		skinShade5.curveTo(232, 179, 216, 180, 229, 170);
		skinShade5.curveTo(221, 163, 198, 160, 191, 163);
		
		GeneralPath skinShade7 = new GeneralPath();
		skinShade7.moveTo(241, 222);
		skinShade7.curveTo(244, 234, 235, 239, 236, 248);
		skinShade7.curveTo(210, 231, 235, 230, 236, 226);
		skinShade7.curveTo(240, 225, 233, 222, 238, 219);
		skinShade7.closePath();
		
		GeneralPath skinShade8 = new GeneralPath();
		skinShade8.moveTo(241, 226);
		skinShade8.curveTo(239, 233, 235, 236, 234, 242);
		skinShade8.curveTo(221, 233, 242, 226, 241, 226);
		
		GeneralPath skinShade9 = new GeneralPath();
		skinShade9.moveTo(236, 170);
		skinShade9.curveTo(222, 179, 222, 161, 204, 173);
		skinShade9.curveTo(194, 171, 187, 167, 200, 164);
		skinShade9.curveTo(242, 161, 218, 171, 234, 169);
		skinShade9.closePath();
		
		GeneralPath skinShade2 = new GeneralPath();
		skinShade2.moveTo(201, 198);
		skinShade2.curveTo(197, 214, 213, 206, 213, 220);
		skinShade2.curveTo(206, 228, 216, 229, 223, 217);
		skinShade2.curveTo(239, 215, 240, 227, 264, 223);
		skinShade2.curveTo(265, 220, 272, 218, 273, 215);
		skinShade2.curveTo(256, 221, 244, 211, 238, 213);
		skinShade2.curveTo(222, 208, 216, 193, 205, 203);
		skinShade2.curveTo(203, 203, 201, 200, 201, 198);
				
		GeneralPath skinShade4 = new GeneralPath();
		skinShade4.moveTo(207, 203);
		skinShade4.curveTo(194, 210, 213, 207, 217, 212);
		skinShade4.curveTo(226, 218, 202, 221, 216, 223);
		skinShade4.curveTo(223, 213, 236, 214, 244, 221);
		skinShade4.curveTo(253, 226, 264, 213, 239, 213);
		skinShade4.closePath();
		
		GeneralPath skinShade3 = new GeneralPath();
		skinShade3.moveTo(207, 203);
		skinShade3.curveTo(207, 206, 209, 209, 211, 209);
		skinShade3.curveTo(220, 210, 224, 213, 215, 220);
		skinShade3.curveTo(217, 227, 223, 212, 233, 217);
		skinShade3.curveTo(239, 217, 246, 226, 248, 218);
		skinShade3.curveTo(252, 212, 238, 215, 232, 210);
		skinShade3.curveTo(223, 207, 215, 195, 207, 203);
		
		graph.setColor(new Color(253, 107, 21));
		graph.fill(skinShade15);
		graph.setColor(new Color(250, 141, 14));
		graph.fill(skinShade14);
		graph.setColor(new Color(255, 196, 58));
		graph.fill(skinShade12);
		graph.setColor(new Color(254, 189, 33));
		graph.fill(skinShade13);
		graph.setColor(new Color(253, 230, 90));
		graph.fill(skinShade1);
		graph.setColor(new Color(253, 163, 67));
		graph.fill(skinShade11);
		graph.setColor(new Color(252, 206, 120));
		graph.fill(skinShade10);
		graph.setColor(new Color(255, 209, 74));
		graph.fill(skinShade6);
		graph.setColor(new Color(254, 149, 31));
		graph.fill(skinShade5);
		graph.setColor(new Color(231, 72, 17));
		graph.fill(skinShade7);
		graph.setColor(new Color(140, 9, 0));
		graph.fill(skinShade8);
		graph.setColor(new Color(107, 31, 7));
		graph.fill(skinShade9);
		graph.setColor(new Color(255, 113, 3));
		graph.fill(skinShade2);
		graph.setColor(new Color(96, 19, 0));
		graph.fill(skinShade4);
		graph.setColor(Color.black);
		graph.fill(skinShade3);
		
		return graph;
	}
	public Graphics2D drawMouth(Graphics g) {
		Graphics2D graph = (Graphics2D) g;
		graph.setStroke(sketchLine);
		graph.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		GeneralPath skinShade4 = new GeneralPath();
		skinShade4.moveTo(257, 354);
		skinShade4.curveTo(266, 362, 269, 371, 260, 379);
		skinShade4.curveTo(254, 372, 248, 379, 247, 368);
		graph.setColor(new Color(255, 214, 42));
		graph.fill(skinShade4);
		
		GeneralPath skinShade3 = new GeneralPath();
		skinShade3.moveTo(243, 361);
		skinShade3.curveTo(250, 358, 259, 352, 258, 364);
		skinShade3.curveTo(260, 368, 269, 371, 264, 375);
		graph.setColor(new Color(251, 200, 85));
		graph.fill(skinShade3);
		
		GeneralPath skinShade2 = new GeneralPath();
		skinShade2.moveTo(226, 354);
		skinShade2.curveTo(231, 351, 244, 362, 248, 360);
		skinShade2.curveTo(265, 360, 253, 367, 265, 374);
		skinShade2.curveTo(267, 399, 260, 373, 256, 371);
		skinShade2.curveTo(253, 369, 247, 372, 243, 367);
		skinShade2.curveTo(243, 365, 237, 374, 229, 367);
		skinShade2.curveTo(234, 366, 222, 361, 226, 354);
		graph.setColor(new Color(248, 154, 40));
		graph.fill(skinShade2);
		
		GeneralPath skinShade10 = new GeneralPath();
		skinShade10.moveTo(267, 415);
		skinShade10.curveTo(271, 417, 275, 422, 274, 422);
		skinShade10.curveTo(274, 417, 278, 390, 267, 415);
		graph.setColor(new Color(248, 43, 0));
		graph.fill(skinShade10);
		
		GeneralPath skinShade11 = new GeneralPath();
		skinShade11.moveTo(274, 406);
		skinShade11.curveTo(275, 418, 275, 422, 271, 422);
		skinShade11.curveTo(272, 444, 287, 436, 283, 454);
		skinShade11.curveTo(302, 473, 351, 468, 361, 451);
		graph.setColor(new Color(254, 174, 25));
		graph.fill(skinShade11);
		
		GeneralPath skinShade13 = new GeneralPath();
		skinShade13.moveTo(274, 434);
		skinShade13.curveTo(276, 440, 280, 437, 281, 442);
		skinShade13.curveTo(291, 444, 290, 436, 287, 426);
		skinShade13.curveTo(287, 430, 279, 429, 274, 434);
		graph.setColor(new Color(254, 215, 26));
		graph.fill(skinShade13);
		
		GeneralPath skinShade1 = new GeneralPath();
		skinShade1.moveTo(254, 341);
		skinShade1.curveTo(259, 355, 271, 380, 261, 388);
		skinShade1.curveTo(262, 416, 244, 398, 243, 406);
		skinShade1.curveTo(243, 418, 255, 425, 266, 418);
		skinShade1.lineTo(274, 406);
		skinShade1.lineTo(288, 435);
		skinShade1.curveTo(339, 356, 358, 400, 367, 401);
		skinShade1.curveTo(432, 421, 434, 377, 445, 391);
		skinShade1.curveTo(435, 338, 420, 388, 357, 350);
		skinShade1.curveTo(340, 332, 375, 272, 254, 341);
		graph.setColor(new Color(252, 146, 8));
		graph.fill(skinShade1);
		
		GeneralPath skinShade16 = new GeneralPath();
		skinShade16.moveTo(376, 456);
		skinShade16.curveTo(381, 470, 403, 485, 405, 488);
		skinShade16.curveTo(415, 496, 411, 502, 415, 505);
		skinShade16.curveTo(411, 493, 424, 479, 450, 462);
		skinShade16.curveTo(455, 452, 449, 471, 448, 429);
		skinShade16.closePath();
		graph.setColor(new Color(255, 135, 4));
		graph.fill(skinShade16);
		
		GeneralPath skinShade12 = new GeneralPath();
		skinShade12.moveTo(288, 435);
		skinShade12.curveTo(339, 356, 358, 400, 367, 401);
		skinShade12.curveTo(432, 421, 434, 377, 445, 391);
		skinShade12.curveTo(449, 403, 445, 415, 450, 418);
		skinShade12.curveTo(455, 421, 441, 424, 449, 429);
		skinShade12.lineTo(401, 479);
		skinShade12.curveTo(404, 475, 381, 472, 380, 454);
		skinShade12.curveTo(366, 452, 315, 475, 291, 460);
		skinShade12.closePath();
		graph.setColor(new Color(254, 106, 0));
		graph.fill(skinShade12);
		
		GeneralPath skinShade14 = new GeneralPath();
		skinShade14.moveTo(299, 459);
		skinShade14.curveTo(311, 457, 315, 456, 317, 456);
		skinShade14.curveTo(343, 435, 347, 409, 372, 453);
		skinShade14.curveTo(341, 464, 299, 464, 299, 459);
		skinShade14.moveTo(389, 441);
		skinShade14.curveTo(428, 396, 416, 430, 413, 451);
		skinShade14.curveTo(407, 456, 385, 462, 382, 457);
		skinShade14.closePath();
		graph.setColor(new Color(245, 71, 2));
		graph.fill(skinShade14);
		
		GeneralPath skinShade15 = new GeneralPath();
		skinShade15.moveTo(376, 456);
		skinShade15.curveTo(378, 454, 380, 458, 386, 456);
		skinShade15.curveTo(398, 458, 390, 448, 398, 441);
		skinShade15.lineTo(389, 441);
		skinShade15.curveTo(385, 448, 379, 453, 374, 456);
		skinShade15.closePath();
		graph.setColor(new Color(139, 49, 0));
		graph.fill(skinShade15);
		
		GeneralPath skinShade8 = new GeneralPath();
		skinShade8.moveTo(261, 389);
		skinShade8.curveTo(246, 411, 252, 418, 261, 415);
		skinShade8.curveTo(261, 412, 264, 400, 261, 389);
		graph.setColor(new Color(248, 56, 7));
		graph.fill(skinShade8);
		
		GeneralPath skinShade9 = new GeneralPath();
		skinShade9.moveTo(252, 407);
		skinShade9.curveTo(266, 406, 261, 419, 257, 418);
		skinShade9.curveTo(256, 422, 239, 415, 252, 407);
		graph.setColor(new Color(249, 34, 3));
		graph.fill(skinShade9);
		
		GeneralPath skinShade5 = new GeneralPath();
		skinShade5.moveTo(256, 388);
		skinShade5.curveTo(259, 382, 259, 379, 258, 377);
		skinShade5.curveTo(271, 372, 267, 383, 261, 389);
		skinShade5.curveTo(260, 387, 258, 386, 256, 387);
		graph.setColor(new Color(255, 124, 101));
		graph.fill(skinShade5);
		
		GeneralPath skinShade6 = new GeneralPath();
		skinShade6.moveTo(256, 388);
		skinShade6.curveTo(259, 385, 263, 383, 263, 381);
		skinShade6.curveTo(268, 384, 266, 366, 245, 365);
		skinShade6.curveTo(240, 364, 238, 363, 234, 361);
		skinShade6.curveTo(235, 365, 244, 365, 246, 366);
		skinShade6.curveTo(249, 375, 257, 365, 263, 380);
		skinShade6.curveTo(261, 380, 255, 387, 256, 388);
		graph.setColor(new Color(70, 2, 1));
		graph.fill(skinShade6);
		
		GeneralPath skinShade7 = new GeneralPath();
		skinShade7.moveTo(259, 384);
		skinShade7.curveTo(258, 381, 262, 378, 264, 382);
		skinShade7.curveTo(263, 383, 262, 385, 259, 384);
		graph.setColor(new Color(215, 88, 45));
		graph.fill(skinShade7);
		
		GeneralPath skinShade17 = new GeneralPath();
		skinShade17.moveTo(380, 451);
		skinShade17.curveTo(382, 451, 385, 447, 387, 445);
		skinShade17.curveTo(387, 449, 397, 446, 385, 454);
		skinShade17.curveTo(386, 450, 379, 455, 380, 451);
		graph.setColor(new Color(76, 11, 0));
		graph.fill(skinShade17);
		
		GeneralPath skinShade18 = new GeneralPath();
		skinShade18.moveTo(248, 364);
		skinShade18.curveTo(247, 362, 239, 361, 238, 364);
		skinShade18.curveTo(239, 368, 244, 363, 246, 367);
		skinShade18.closePath();
		graph.setColor(new Color(252, 83, 18));
		graph.fill(skinShade18);
		
		return graph;
	}
	public Graphics2D drawEar(Graphics g) {
		Graphics2D graph = (Graphics2D) g;
		graph.setStroke(sketchLine);
		graph.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		GeneralPath skinShade2 = new GeneralPath();
		skinShade2.moveTo(434, 233);
		skinShade2.curveTo(436, 218, 441, 219, 445, 226);
		skinShade2.curveTo(457, 218, 447, 214, 435, 204);
		skinShade2.curveTo(435, 183, 430, 182, 434, 169);
		skinShade2.curveTo(435, 150, 418, 174, 373, 227);
		skinShade2.curveTo(349, 237, 364, 251, 383, 250);
		skinShade2.closePath();
		graph.setColor(new Color(255, 130, 2));
		graph.fill(skinShade2);
		
		GeneralPath skinShade3 = new GeneralPath();
		skinShade3.moveTo(449, 280);
		skinShade3.curveTo(458, 275, 458, 275, 445, 226);
		//skinShade3.curveTo(457, 218, 447, 214, 435, 204);
		//skinShade3.curveTo(435, 183, 430, 182, 434, 169);
		//skinShade3.curveTo(435, 150, 418, 174, 373, 227);
		graph.setColor(Color.black);
		graph.draw(skinShade2);
		
		GeneralPath skinShade1 = new GeneralPath();
		skinShade1.moveTo(360, 235);
		skinShade1.lineTo(303, 278);
		skinShade1.lineTo(287, 322);
		skinShade1.curveTo(318, 420, 389, 444, 410, 494);
		skinShade1.curveTo(409, 503, 435, 530, 437, 531);
		skinShade1.curveTo(436, 523, 456, 519, 461, 517);
		skinShade1.curveTo(473, 507, 460, 509, 518, 460);
		skinShade1.curveTo(519, 449, 498, 474, 487, 481);
		skinShade1.lineTo(466, 461);
		skinShade1.curveTo(467, 434, 451, 420, 469, 357);
		skinShade1.curveTo(476, 347, 463, 329, 497, 310);
		skinShade1.curveTo(513, 304, 524, 334, 540, 328);
		skinShade1.curveTo(540, 315, 529, 331, 516, 273);
		skinShade1.curveTo(500, 290, 491, 313, 472, 309);
		skinShade1.curveTo(468, 303, 460, 297, 475, 287);
		skinShade1.curveTo(463, 288, 460, 284, 453, 286);
		skinShade1.curveTo(440, 280, 464, 267, 439, 263);
		skinShade1.curveTo(431, 256, 440, 245, 434, 233);
		skinShade1.curveTo(410, 238, 403, 226, 389, 230);
		skinShade1.curveTo(379, 231, 380, 247, 364, 237);
		skinShade1.closePath();
		graph.setColor(new Color(253, 176, 8));
		graph.fill(skinShade1);
		
		return graph;
	}
	
	public void paint(Graphics g) {

		drawNose(g);
		drawEye(g);
		drawEar(g);
		drawMouth(g);
		
		
		drawBackground(g);
		drawHairShades(g);
		drawHair(g);
    }
	
    public static void main (String[] args) {
        Portrait portrait = new Portrait();
        portrait.setSize(645, 666); //641 + 4, 641 + 25
        portrait.setVisible(true);
    }
}