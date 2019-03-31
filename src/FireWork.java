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
	
	private JTextField angleField;
	private JTextField speedField;
	private JTextField timeField;
	
	private Color color;
	
	public FireWork() {
		setLayout(new FlowLayout());
		
		button1 = new JButton("Type 1");
		button1.addActionListener(this);
		this.add(button1);
		
		button2 = new JButton("Type 2");
		button2.addActionListener(this);
		this.add(button2);
		
		button3 = new JButton("Type 3");
		button3.addActionListener(this);
		this.add(button3);
		
		button4 = new JButton("Type 4");
		button4.addActionListener(this);
		this.add(button4);
		
		button5 = new JButton("Type 5");
		button5.addActionListener(this);
		this.add(button5);
		
		angleLabel = new JLabel("Angle: ");
		speedLabel = new JLabel("Speed: ");
		timeLabel = new JLabel("Time; ");
		
		angleField = new JTextField(10);
		angleField.setEditable(true);
		angleField.setText("0");
		angleField.addActionListener(this);
		this.add(angleField);
		
		speedField = new JTextField(10);
		speedField.setEditable(true);
		speedField.setText("0");
		speedField.addActionListener(this);
		this.add(speedField);
		
		timeField = new JTextField(10);
		timeField.setEditable(true);
		timeField.setText("0");
		timeField.addActionListener(this);
		this.add(timeField);
	
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
		
		if (e.getSource() == button1) {
			angle = angleField.getText();
			speed = speedField.getText();
			time = timeField.getText();
			Type_1 x = new Type_1(Integer.parseInt(angle), Integer.parseInt(speed), Integer.parseInt(time));
			x.draw();
			
		}
		else if (e.getSource() == button2) {
			angle = angleField.getText();
			speed = speedField.getText();
			time = timeField.getText();
		}
		else if (e.getSource() == button3) {
			angle = angleField.getText();
			speed = speedField.getText();
			time = timeField.getText();
		}
		else if (e.getSource() == button4) {
			angle = angleField.getText();
			speed = speedField.getText();
			time = timeField.getText();
		}
		else if (e.getSource() == button5) {
			angle = angleField.getText();
			speed = speedField.getText();
			time = timeField.getText();
		}
			
		
		
	}

}
