import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

public class FireWork extends JFrame implements ActionListener {
	private double newX = 0;
	private double newY = 0;
	
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	
	private JLabel angleLabel;
	private JLabel speedLabel;
	private JLabel timeLabel;
	private JLabel colorLabel;
	private JLabel note;
	
	private JTextField angleField;
	private JTextField speedField;
	private JTextField timeField;
	private JTextField colorField;
	
	private Color color;
	
	public FireWork() {
		setLayout(new FlowLayout());
		
		button1 = new JButton("Type  1");
		button1.addActionListener(this);
		this.add(button1);
		
		button2 = new JButton("Type  2");
		button2.addActionListener(this);
		this.add(button2);
		
		button3 = new JButton("Type  3");
		button3.addActionListener(this);
		this.add(button3);
		
		button4 = new JButton("Type  4");
		button4.addActionListener(this);
		this.add(button4);
		
		button5 = new JButton("Type  5");
		button5.addActionListener(this);
		this.add(button5);
		
		angleLabel = new JLabel("Angle: ");
		speedLabel = new JLabel("Speed: ");
		timeLabel = new JLabel("Time: ");
		colorLabel = new JLabel("Color(blue, green, red): ");
		note = new JLabel("Click the screen to see the exploding.");
		
		
		angleField = new JTextField(10);
		angleField.setEditable(true);
		angleField.setText("0");
		angleField.addActionListener(this);
		this.add(angleLabel);
		this.add(angleField);
		
		speedField = new JTextField(5);
		speedField.setEditable(true);
		speedField.setText("0");
		speedField.addActionListener(this);
		this.add(speedLabel);
		this.add(speedField);
		
		timeField = new JTextField(5);
		timeField.setEditable(true);
		timeField.setText("0");
		timeField.addActionListener(this);
		this.add(timeLabel);
		this.add(timeField);
		
		colorField = new JTextField(10);
		colorField.setEditable(true);
		colorField.setText("");
		colorField.addActionListener(this);
		this.add(colorLabel);
		this.add(colorField);
		
		this.add(note);
		this.pack();
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FireWork x = new FireWork();
		x.setSize(600, 600);
		x.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		x.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String angle;
		String speed;
		String time;
		String color;
		
		if (e.getSource() == button1) {
			angle = angleField.getText();
			speed = speedField.getText();
			time = timeField.getText();
			color = colorField.getText();
			Type_1 x = new Type_1(Integer.parseInt(angle), Integer.parseInt(speed), Integer.parseInt(time), color);
			x.draw();
			
		}
		else if (e.getSource() == button2) {
			angle = angleField.getText();
			speed = speedField.getText();
			time = timeField.getText();
			color = colorField.getText();
			Type_2 x = new Type_2(Integer.parseInt(angle), Integer.parseInt(speed), Integer.parseInt(time), color);
			x.draw();
		}
		else if (e.getSource() == button3) {
			angle = angleField.getText();
			speed = speedField.getText();
			time = timeField.getText();
			color = colorField.getText();
			Type_3 x = new Type_3(Integer.parseInt(angle), Integer.parseInt(speed), Integer.parseInt(time), color);
			x.draw();
		}
		else if (e.getSource() == button4) {
			angle = angleField.getText();
			speed = speedField.getText();
			time = timeField.getText();
			color = colorField.getText();
			Type_4 x = new Type_4(Integer.parseInt(angle), Integer.parseInt(speed), Integer.parseInt(time), color);
			x.draw();
		}
		else if (e.getSource() == button5) {
			angle = angleField.getText();
			speed = speedField.getText();
			time = timeField.getText();
			color = colorField.getText();
		}
			
		
		
	}

}
