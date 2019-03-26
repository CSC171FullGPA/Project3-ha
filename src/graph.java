import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class graph extends JComponent{
	double newX = 0;
	double newY = 0;
	public void paintComponent(Graphics g) {
		int width = getWidth();
		int height = getHeight();
		
		for (int i=0;i<=100;i++) {
			g.drawLine((int)newX, (int)newY,(int)(30*Math.cos(5)*i),(int)(30*Math.sin(5)*i-(1/2)*9.8*i*i));
			newX = 30*Math.cos(60)*i;
			newY = 30*Math.sin(60)*i-(1/2)*9.8*i*i;
		}
		
}
}