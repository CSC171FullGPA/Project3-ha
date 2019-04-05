import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

public class Type_4 extends Type_2{
	public Type_4(int angle, int speed, int time, String color) {
		super(angle, speed, time, color);
		
	}
	
	@Override
	
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
		x.add(new Type_4(angle, speed, time, color));
		x.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		x.setVisible(true);
		
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
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
		Graphics g = getGraphics();
		int w = getWidth();
		int h = getHeight();
		g.setColor(Color.MAGENTA);
		g.drawString("Release the mouse to explode!", w/3, 20);
		g.setColor(Color.ORANGE);
		g.drawLine((int)newX, (int)newY, (int)(newX + 50), (int)(newY + 50));
		g.drawLine((int)newX, (int)newY, (int)(newX + 50), (int)(newY - 50));
		g.drawLine((int)newX, (int)newY, (int)(newX - 50), (int)(newY - 50));
		
	
		 
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		Graphics g = getGraphics();
		
		g.setColor(Color.ORANGE);
		g.fillOval((int)(newX), (int)(newY), 100, 100);
		g.setColor(Color.MAGENTA);
		g.fillOval((int)(newX + 10), (int)(newY + 10), 80, 80);
		g.setColor(Color.LIGHT_GRAY);
		g.fillOval((int)(newX + 20), (int)(newY + 20), 60, 60);
		g.setColor(Color.BLUE);
		g.fillOval((int)(newX + 30),(int)(newY + 30), 40, 40);
		g.setColor(Color.RED);
		g.fillOval((int)(newX + 40), (int)(newY + 40), 20, 20);
		
		g.setColor(Color.GREEN);
		g.fillOval((int)(newX), (int)(newY - 100), 100, 100);
		g.setColor(Color.BLACK);
		g.fillOval((int)(newX + 10), (int)(newY - 90), 80, 80);
		g.setColor(Color.WHITE);
		g.fillOval((int)(newX + 20), (int)(newY - 80), 60, 60);
		g.setColor(Color.CYAN);
		g.fillOval((int)(newX + 30), (int)(newY - 70), 40, 40);
		g.setColor(Color.MAGENTA);
		g.fillOval((int)(newX + 40), (int)(newY - 60), 20, 20);
		
		g.setColor(Color.CYAN);
		g.fillOval((int)(newX - 100), (int)(newY - 100), 100, 100);
		g.setColor(Color.RED);
		g.fillOval((int)(newX - 90), (int)(newY - 90), 80, 80);
		g.setColor(Color.GREEN);
		g.fillOval((int)(newX - 80), (int)(newY - 80), 60, 60);
		g.setColor(Color.WHITE);
		g.fillOval((int)(newX - 70), (int)(newY - 70), 40, 40);
		g.setColor(Color.BLUE);
		g.fillOval((int)(newX - 60), (int)(newY - 60), 20, 20);

	}
	

}
