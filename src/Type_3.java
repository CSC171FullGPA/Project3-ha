import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class Type_3 extends JComponent implements MouseListener{
	private int angle;
	private int speed;
	private int time;
	private String color;
	private double newX;
	private double newY;
	Random rand = new Random();
	
	public Type_3(int angle, int speed, int time, String color) {
		this.angle = angle;
		this.speed = speed;
		this.time = time;
		this.color = color;
		addMouseListener(this);
	}
	
	public void paintComponent(Graphics g) {
		int w = getWidth();
		int h = getHeight();
		newY = getHeight();
		
		for (int i=0;i<=time;i++) {
			if(color.equals("red")) {
				g.setColor(Color.RED);
			}else if(color.equals("blue")) {
				g.setColor(Color.BLUE);
			}else if(color.equals("green")) {
				g.setColor(Color.GREEN);
			}
			g.drawLine((int)newX, (int)newY,(int)(speed*Math.cos(angle/(180.0)*Math.PI)*i),h-((int)(speed*Math.sin(angle/(180.0)*Math.PI)*i-(1/2.0)*9.8*i*i)));
			newX = speed*Math.cos(angle/180.0*Math.PI)*i;
			newY = h-(speed*Math.sin(angle/180.0*Math.PI)*i-(1/2.0)*9.8*i*i);
		}
		g.drawString("click the screen to see the explosion", w/4, 10);
		
	}
	public void draw() {
		JFrame x = new JFrame();
		x.setSize(400, 400);
		x.add(new Type_3(angle, speed, time, color));
		x.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		x.setVisible(true);
		
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		int w = getWidth();
		int h = getHeight();
		newX = speed*Math.cos(angle/180.0*Math.PI)*time;
		newY = h-(speed*Math.sin(angle/180.0*Math.PI)*time-(1/2.0)*9.8*time*time);
		System.out.println("yo");
		Graphics g = getGraphics();
		for (int j=1;j<=60;j++) {
			for (int i=1;i<=7;i++) {
				g.drawLine((int)newX, (int)newY,(int)(speed*Math.cos(j*3/(180.0)*Math.PI)*i+speed*Math.cos(angle/180.0*Math.PI)*time),h-(int)((speed*Math.sin(j*3/(180.0)*Math.PI)*i-(1/2.0)*9.8*i*i)+h-(speed*Math.sin(angle/180.0*Math.PI)*time-(1/2.0)*9.8*time*time)));
				newX = speed*Math.cos(j*3/180.0*Math.PI)*i+speed*Math.cos(angle/180.0*Math.PI)*time;
				newY = h-(speed*Math.sin(j*3/180.0*Math.PI)*i-(1/2.0)*9.8*i*i)+h-(speed*Math.sin(angle/180.0*Math.PI)*time-(1/2.0)*9.8*time*time);
		}
		}
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}

