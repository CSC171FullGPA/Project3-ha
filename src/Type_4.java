import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

public class Type_4 extends Type_2 {
	//square explosion

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
		System.out.println("yo");
		Graphics g = getGraphics();
		int w = getWidth();
		int h = getHeight();
		
		for(int i=1;i<=10;i++) {
			Color[] colors = {Color.darkGray, Color.GREEN, Color.CYAN, Color.RED, 
					Color.MAGENTA, Color.BLUE, Color.BLUE, Color.BLACK, Color.GREEN,
					Color.RED, Color.CYAN};
			g.setColor(colors[i]);
			
			//Creates a random side for the square
			int length = rand.nextInt(100)+5;
			
			//Creates squares at random distances from the end point
			g.drawRect((int)newX + rand.nextInt(30)+5 - length/2, (int)newY + rand.nextInt(30)+5 -
					length/2, length, length);
			g.drawRect((int)newX + rand.nextInt(30)+5 - length/2, (int)newY - rand.nextInt(30)+5 -
					length/2, length, length);
			
			g.drawRect((int)newX - rand.nextInt(30)+5 - length/2, (int)newY + rand.nextInt(30)+5 -
					length/2, length, length);
			
			g.drawRect((int)newX - rand.nextInt(30)+5 - length/2,(int)newY - rand.nextInt(30)+5 -
					length/2, length, length);
			
			g.drawRect((int)newX - rand.nextInt(30)+5 - length/2, (int)newY - rand.nextInt(30)+5 -
					length/2, length, length);
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
