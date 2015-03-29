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
		
		graph.fill(hairShade);
		return graph;
	}
	public Graphics2D drawBackground(Graphics g) {
		Graphics2D graph = (Graphics2D) g;
		graph.setStroke(sketchLine);
		graph.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		GeneralPath bg1 = new GeneralPath();
		
		bg1.moveTo(186, 184);
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
		bg1.lineTo(186, 25);
		bg1.lineTo(186, 170);
		bg1.curveTo(181, 180, 185, 180, 186, 184);
		bg1.closePath();
		
		GradientPaint bg = new GradientPaint(186, 666, new Color(133, 214, 182), 0, 666, Color.white);
		graph.setPaint(bg);
		graph.fill(bg1);
		
		return graph;
	}
	
	
	public void paint(Graphics g) {
		
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