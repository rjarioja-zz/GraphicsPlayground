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
		
		GradientPaint gradient1 = new GradientPaint(252, 666, new Color(62, 127, 187), 0, 666, Color.white);
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
	public Graphics2D drawNose(Graphics g) {
		Graphics2D graph = (Graphics2D) g;
		graph.setStroke(sketchLine);
		graph.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		GeneralPath skinShade1 = new GeneralPath();
		skinShade1.moveTo(199, 212);
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
		skinShade2.curveTo(210, 210, 204, 216, 200, 208);
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
		
		GeneralPath skinShade1 = new GeneralPath();
		skinShade1.moveTo(243, 232);
		skinShade1.curveTo(242, 234, 233, 240, 236, 250);
		skinShade1.curveTo(247, 261, 247, 277, 259, 294);
		skinShade1.curveTo(261, 290, 271, 283, 275, 283);
		skinShade1.curveTo(262, 251, 244, 249, 280, 239);
		skinShade1.curveTo(292, 236, 254, 221, 243, 232);
		graph.setColor(new Color(253, 230, 90));
		graph.fill(skinShade1);
		
		GeneralPath skinShade5 = new GeneralPath();
		skinShade5.moveTo(191, 163);
		skinShade5.curveTo(198, 172, 186, 177, 193, 188);
		skinShade5.curveTo(199, 220, 217, 209, 211, 225);
		skinShade5.curveTo(226, 213, 198, 222, 211, 179);
		skinShade5.curveTo(235, 180, 253, 164, 282, 175);
		skinShade5.curveTo(328, 184, 339, 228, 372, 225);
		skinShade5.curveTo(323, 251, 336, 215, 323, 220);
		skinShade5.curveTo(305, 218, 281, 213, 273, 215);
		skinShade5.curveTo(221, 230, 240, 199, 227, 200);
		skinShade5.curveTo(214, 184, 309, 219, 242, 176);
		skinShade5.curveTo(232, 179, 216, 180, 229, 170);
		skinShade5.curveTo(221, 163, 198, 160, 191, 163);
		graph.setColor(new Color(254, 149, 31));
		graph.fill(skinShade5);
		
		GeneralPath skinShade2 = new GeneralPath();
		skinShade2.moveTo(201, 198);
		skinShade2.curveTo(197, 214, 213, 206, 213, 220);
		skinShade2.curveTo(206, 228, 216, 229, 223, 217);
		skinShade2.curveTo(239, 215, 240, 227, 264, 223);
		skinShade2.curveTo(265, 220, 272, 218, 273, 215);
		skinShade2.curveTo(256, 221, 244, 211, 238, 213);
		skinShade2.curveTo(222, 208, 216, 193, 205, 203);
		skinShade2.curveTo(203, 203, 201, 200, 201, 198);
		graph.setColor(new Color(255, 113, 3));
		graph.fill(skinShade2);
		
		GeneralPath skinShade4 = new GeneralPath();
		skinShade4.moveTo(207, 203);
		skinShade4.curveTo(194, 210, 213, 207, 217, 212);
		skinShade4.curveTo(226, 218, 202, 221, 216, 223);
		skinShade4.curveTo(223, 213, 236, 214, 244, 221);
		skinShade4.curveTo(253, 226, 264, 213, 239, 213);
		skinShade4.closePath();
		graph.setColor(new Color(96, 19, 0));
		graph.fill(skinShade4);
		
		GeneralPath skinShade3 = new GeneralPath();
		skinShade3.moveTo(207, 203);
		skinShade3.curveTo(207, 206, 209, 209, 211, 209);
		skinShade3.curveTo(220, 210, 224, 213, 215, 220);
		skinShade3.curveTo(217, 227, 223, 212, 233, 217);
		skinShade3.curveTo(239, 217, 246, 226, 248, 218);
		skinShade3.curveTo(252, 212, 238, 215, 232, 210);
		skinShade3.curveTo(223, 207, 215, 195, 207, 203);
		graph.setColor(Color.black);
		graph.fill(skinShade3);
		
		return graph;
	}
	
	public void paint(Graphics g) {
		
		drawNose(g);
		drawEye(g);
		
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