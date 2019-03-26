import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class Type_1 extends JComponent{
	private int angle;
	private int speed;
	private int time;
	private double newX;
	private double newY;
	
	public Type_1(int angle, int speed, int time) {
		this.angle = angle;
		this.speed = speed;
		this.time = time;
	}
	
	public void paintComponent(Graphics g) {
		int w = getWidth();
		int h = getHeight();
		
		for (int i=0;i<=time*100;i++) {
			g.setColor(Color.RED);
			g.drawLine((int)newX, (int)newY,(int)(speed*Math.cos(angle/(180.0)*Math.PI)*i),(int)(speed*Math.sin(angle/(180.0)*Math.PI)*i-(1/2)*9.8*i*i));
			newX = speed*Math.cos(angle/180.0*Math.PI)*i;
			newY = speed*Math.sin(angle/180.0*Math.PI)*i-(1/2)*9.8*i*i;
		}
		
	}
	public void draw() {
		JFrame x = new JFrame();
		x.setSize(400, 400);
		x.add(new Type_1(angle, speed, time));
		x.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		x.setVisible(true);
		
	}

}
