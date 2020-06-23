package Main;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class Panel extends JPanel {
	int index;

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		this.setBackground(Color.WHITE);
		this.setBounds(300, 30, 600, 600);
		this.setBorder(BorderFactory.createEtchedBorder(1));
		Graphics2D g2d = (Graphics2D) g;
		Axis2D(g2d);
		doDrawing(g2d);
	}

	// ham ve thi ta ve vao day
	public Panel() {
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
}