import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class FireWork extends JComponent{
	double newX = 0;
	double newY = 0;
	public void paintComponent(Graphics g) {
		int width = getWidth();
		int height = getHeight();
		g.setColor(Color.BLACK);
		GeneralPath polyline = 
		        new GeneralPath(GeneralPath.WIND_EVEN_ODD, 500);

		
		for (int i=0;i<=100;i++) {
			polyline.moveTo(newX, newY);
			
			newX = 200*Math.cos(8)*i; //hahhahahahah /jhaahahahha
			newY= 200*Math.sin(8)*i-(1/2)*9.8*i*i;
			polyline.lineTo(newX, newY);
		}
		g.drawLine((int)newX, (int)newY,100,100);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame test1 = new JFrame("BasicLines");
		test1.setSize(600, 600);
		test1.add(new graph());
		test1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		test1.setVisible(true);

	}

}
