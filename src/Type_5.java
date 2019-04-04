import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

public class Type_5 extends Type_4{

	public Type_5(int angle, int speed, int time, String color) {
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
		x.add(new Type_5(angle, speed, time, color));
		x.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		x.setVisible(true);
		
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("yo");
		Graphics g = getGraphics();
		int w = getWidth();
		int h = getHeight();
		
		for (int i = 0; i <= 10; i ++) {
			
			Color[] colors = {Color.darkGray, Color.GREEN, Color.CYAN, Color.RED, 
					Color.MAGENTA, Color.BLUE, Color.BLUE, Color.BLACK, Color.GREEN,
					Color.RED, Color.CYAN};
			g.setColor(colors[i]);
			
			//Draws lines originating at the end point
			g.drawLine((int)newX, (int)newY, w/10 + i*5, h/10 + i*5);
			g.drawLine((int)newX, (int)newY, (int)newX - w/10 + i*5, (int)newY + h/10 + i*5);
			g.drawLine((int)newX, (int)newY, (int)newX + w/10 + i*5, (int)newY- h/10 + i*5);
			g.drawLine((int)newX, (int)newY, -w/10 + i*10, -h/10 + i*10);
			
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
