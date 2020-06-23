package Main;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import Object3D.*;
import java.awt.Font;
public class Coordinates extends JPanel {
	int x1 = 375;// tam O tuong ung voi he toa do cua chuong trinh
	int y1 = 375;
	int index;

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		this.setBackground(Color.WHITE);
		this.setBounds(300, 30, 600, 600);
		this.setBorder(BorderFactory.createEtchedBorder(1));
		Graphics2D g2d = (Graphics2D) g;
		//Axis2D(g2d);
		Axis3D(g2d);
		Object_2_3D x= new Object_2_3D();
		x.Object_2_3D(10,10,10,30,g2d);
	}

	// ham ve thi ta ve vao day
	public Coordinates() {
		this.index = -1;
	}

	public void doDrawing(Graphics2D g2d) {
		// ham chuc nang
		Axis2D(g2d);
		if (index == 0) {
			// DrawElip(g2d, x1, y1, R1, R2);
		}
	}

	// ham ve toa do
	public void Axis2D(Graphics2D g2d) {
		g2d.setColor(Color.GRAY);
		g2d.setStroke(new BasicStroke(1));
		for (int i = 0; i <= 150; i++) {
			g2d.drawLine(5 * i, 0, 5 * i, 750);// moi don vi la 5 pixel
			g2d.drawLine(0, 5 * i, 750, 5 * i);
		}
		g2d.setStroke(new BasicStroke(2));
		g2d.setColor(Color.BLACK);
		
	}
	 public void Axis3D(Graphics2D g2d)
     {
         
         g2d.setStroke(new BasicStroke(3));
         g2d.setColor(Color.BLACK);
         //ox
         g2d.drawLine(375, 375, 750, 375);
//         g2d.drawString("Ox", 550, 280);
//         g2d.drawLine(580, 290, 570, 285);
//         g2d.drawLine(580, 290, 570, 295);
         //oy
         g2d.drawLine(375, 375, 375, 0);
//         g2d.drawString("Oy",275,15);
//         g2d.drawLine(300, 2, 295, 10);
//         g2d.drawLine(300,2, 305, 10);
         //oz 
         g2d.drawLine(375,375,-4,755);
//         g2d.drawString("Oz",5,550);
//         g2d.drawLine(2, 580, 2, 570);
//         g2d.drawLine(4, 578, 12, 578);
     }
}