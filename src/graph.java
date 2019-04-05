import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class graph extends JComponent{
	double newX = 0;
	double newY = 0;
	public void paintComponent(Graphics g) {
		
		for (int i=0;i<=1000;i++) {
			g.setColor(Color.RED);
			g.drawLine((int)newX, (int)newY,(int)(0.3*Math.cos(60/(180.0)*Math.PI)*i),(int)(0.3*Math.sin(60/(180.0)*Math.PI)*i-(1/2)*9.8*i*i));
			newX = 0.3*Math.cos(60/180.0*Math.PI)*i;
			newY = 0.3*Math.sin(60/180.0*Math.PI)*i-(1/2)*9.8*i*i;
		}
		g.drawLine((int)newX, (int)newY,400,400);
		
	}
}