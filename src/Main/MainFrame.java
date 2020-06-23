package Main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.*;

public class MainFrame extends JFrame implements ActionListener {

	JPanel coordinates = new Coordinates();
	JLabel label1 = new JLabel();
	
	JButton bt2D = new JButton();
	JButton bt2D_object1 = new JButton();
	JButton bt2D_object2 = new JButton();
	
	JButton bt3D = new JButton();
	JButton bt3D_object1 = new JButton();
	JButton bt3D_object2 = new JButton();

	// ham khoi tao
	public MainFrame() {
		// ham khoi tao cac gia tri do hoa
		initUI();
	}

	public void initUI() {
//		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
//		this.setSize(screenSize.width, screenSize.height);
		this.setSize(950, 740);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Computer Graphics - Team 13");
		this.getContentPane().setBackground(new Color(16,54,103));
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2 - 20);

		// o trong nhap so lieu

//		tf1.setBounds(140, 200, 100, 40);
//		tf1.setFocusable(true);
//		tf1.setText("");
//		tf1.setEditable(true);

		label1.setBounds(300, 650, 300, 40);
		label1.setEnabled(false);
		label1.setText("Toa do diem ve");
		label1.setFont(new Font("", Font.BOLD, 15));

		// nut thu nhat
		bt2D.setText("2D Graphics");
		bt2D.setBounds(50, 50, 150, 40);
		bt2D.setBorder(BorderFactory.createBevelBorder(1));
		bt2D.setFocusable(false);
		bt2D.setFont(new Font("", Font.CENTER_BASELINE, 16));
		
		bt2D_object1.setText("Object 1");
		bt2D_object1.setBounds(70, 110, 100, 30);
		bt2D_object1.setBorder(BorderFactory.createBevelBorder(1));
		bt2D_object1.setFocusable(false);
		bt2D_object1.setFont(new Font("", Font.CENTER_BASELINE, 16));
		
		bt2D_object2.setText("Object 2");
		bt2D_object2.setBounds(70, 160, 100, 30);
		bt2D_object2.setBorder(BorderFactory.createBevelBorder(1));
		bt2D_object2.setFocusable(false);
		bt2D_object2.setFont(new Font("", Font.CENTER_BASELINE, 16));

		bt3D.setText("3D Graphics");
		bt3D.setBounds(50, 220, 150, 40);
		bt3D.setBorder(BorderFactory.createBevelBorder(1));
		bt3D.setFocusable(false);
		bt3D.setFont(new Font("", Font.CENTER_BASELINE, 16));
		
		bt3D_object1.setText("Object 1");
		bt3D_object1.setBounds(70, 280, 100, 30);
		bt3D_object1.setBorder(BorderFactory.createBevelBorder(1));
		bt3D_object1.setFocusable(false);
		bt3D_object1.setFont(new Font("", Font.CENTER_BASELINE, 16));
		
		bt3D_object2.setText("Object 2");
		bt3D_object2.setBounds(70, 330, 100, 30);
		bt3D_object2.setBorder(BorderFactory.createBevelBorder(1));
		bt3D_object2.setFocusable(false);
		bt3D_object2.setFont(new Font("", Font.CENTER_BASELINE, 16));

		// label
		this.add(label1);

		// button
		this.add(bt2D);
		bt2D.addActionListener(this);
		this.add(bt2D_object1);
		this.add(bt2D_object2);
		
		
		this.add(bt3D);
		this.add(bt3D_object1);
		this.add(bt3D_object2);
		
		

		// panel
		this.add(coordinates);
	}

	public void keyPressed(KeyEvent e) {
		switch (e.getKeyCode()) {
		case KeyEvent.VK_ENTER:
//			sf.index = 0;
//			xuLy();
			break;
		}
	}

//	public void xuLy() {
//		try {
//			int r1 = Integer.parseInt(tf2.getText());
//			int r2 = Integer.parseInt(tf1.getText());
//			if (r2 <= 200 && r1 <= 200) {
//				sf.R2 = r2;
//				sf.R1 = r1;
//				System.out.print(sf.R1);
//				System.out.print(sf.R2);
//				sf.repaint();
//			} else {
//				String message = "Vui long nhap dung dinh dang! ";
//				JOptionPane.showMessageDialog(new JFrame(), message, "Canh bao", JOptionPane.ERROR_MESSAGE);
//			}
//		} catch (Exception q) {
//			String message = "Vui long nhap dung dinh dang! ";
//			JOptionPane.showMessageDialog(new JFrame(), message, "Canh bao", JOptionPane.ERROR_MESSAGE);
//		}
//	}

	public void actionPerformed(ActionEvent e) {
		if ("DRAW!".equals(e.getActionCommand())) {
//			sf.index = 0;
//			xuLy();
		}
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				MainFrame mainframe = new MainFrame();
				mainframe.setVisible(true);
			}
		});
	}
}
