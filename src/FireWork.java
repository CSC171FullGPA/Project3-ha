import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class FireWork extends JFrame implements ActionListener,ChangeListener {
	
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
	
	private JSlider angleSlider;
	private JSlider speedSlider;
	private JSlider timeSlider;
	private JTextField colorField;
	
	private Color color;
	
	public FireWork() {
		setLayout(new FlowLayout());
		//FIXME bad layout, use border layout
		
		button1 = new JButton("Type 1");
		button1.addActionListener(this);
		
		button2 = new JButton("Type 2");
		button2.addActionListener(this);
		
		button3 = new JButton("Type 3");
		button3.addActionListener(this);
		
		button4 = new JButton("Type 4");
		button4.addActionListener(this);
		
		button5 = new JButton("Type 5");
		button5.addActionListener(this);
		
		angleLabel = new JLabel("Angle: ");
		speedLabel = new JLabel("Speed: ");
		timeLabel = new JLabel("Time: ");
		colorLabel = new JLabel("Color(blue, green, red): ");
		
		add(angleLabel);
		angleSlider = new JSlider(1, 80, 45);
		angleSlider.addChangeListener(this);
		add(angleSlider);
		
		add(speedLabel);
		speedSlider = new JSlider(1, 100, 1);
		speedSlider.addChangeListener(this);
		add(speedSlider);
		
		add(timeLabel);
		timeSlider = new JSlider(1, 10, 1);
		timeSlider.addChangeListener(this);
		add(timeSlider);
		
		colorField = new JTextField(7);
		colorField.setEditable(true);
		colorField.setText("");
		colorField.addActionListener(this);
		this.add(colorLabel);
		this.add(colorField);
		
		this.add(button1);
		this.add(button2);
		this.add(button3);
		this.add(button4);
		this.add(button5);
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FireWork x = new FireWork();
		x.setTitle("firework");
		x.setSize(830, 150);
		x.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		x.setVisible(true);


	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int angle;
		int speed;
		int time;
		String color;
		
		if (e.getSource() == button1) {
			angle = angleSlider.getValue();
			speed = speedSlider.getValue();
			time = timeSlider.getValue();
			color = colorField.getText();
			Type_1 x = new Type_1(angle, speed, time, color);
			x.draw();
			
		}
		else if (e.getSource() == button2) {
			angle = angleSlider.getValue();
			speed = speedSlider.getValue();
			time = timeSlider.getValue();
			color = colorField.getText();
			Type_2 x = new Type_2(angle, speed, time, color);
			x.draw();
		}
		else if (e.getSource() == button3) {
			angle = angleSlider.getValue();
			speed = speedSlider.getValue();
			time = timeSlider.getValue();
			color = colorField.getText();
			Type_3 x = new Type_3(angle, speed, time, color);
			x.draw();
		}
		else if (e.getSource() == button4) {
			angle = angleSlider.getValue();
			speed = speedSlider.getValue();
			time = timeSlider.getValue();
			color = colorField.getText();
			Type_4 x = new Type_4(angle, speed, time, color);
			x.draw();
		}
		else if (e.getSource() == button5) {
			angle = angleSlider.getValue();
			speed = speedSlider.getValue();
			time = timeSlider.getValue();
			color = colorField.getText();
			Type_5 x = new Type_5(angle, speed, time, color);
			x.draw();
		}
			
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		Object source = e.getSource();
		if (source == angleSlider) {
			angleLabel.setText("Angle: " + String.valueOf(angleSlider.getValue()));
			
		} else if (source == speedSlider) {
			speedLabel.setText("Speed: " + String.valueOf(speedSlider.getValue()));
			
		} else if (source == timeSlider) {
			timeLabel.setText("Time: " + String.valueOf(timeSlider.getValue()));
			
		}
		
	}

}
