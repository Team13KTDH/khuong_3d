package Main;

import java.awt.Point;


public class Transformation {

	
	public Transformation() {
		// TODO Auto-generated constructor stub
	}
	
	public Point translation(int x, int y, int vectorX, int vectorY) {
		int x_des, y_des; // toa do diem dich
		x_des = x + vectorX;
		y_des = y + vectorY;
		return new Point(x_des, y_des);
	}
	
	public Point scaling(int x, int y, int scaleX, int scaleY) {
		int x_des, y_des; 
		x_des = x*scaleX;
		y_des = y*scaleY;
		return new Point(x_des, y_des);
	}
	
	public Point rotation(int x, int y, double degrees) {
		int x_des, y_des; 
		// convert degrees to radians 
        double radians = Math.toRadians(degrees); 
        // sin() method to get the sine value 
        double sinValue = Math.sin(radians);
        double cosValue = Math.cos(radians);
		x_des = (int)(x*cosValue - y*sinValue);
		y_des = (int)(x*sinValue - y*cosValue);
		return new Point(x_des, y_des);
	}
	
}
