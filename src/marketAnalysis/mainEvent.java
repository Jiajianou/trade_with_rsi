package marketAnalysis;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame;

import java.awt.FlowLayout;



public class mainEvent extends JFrame {
	
	private JLabel label;
	private JLabel label2;
	private JButton button;
	private JButton button2;
	
	public mainEvent () {
		setLayout(new GridBagLayout());
		
		button = new JButton ("c");
		add(button);
		
		button2 = new JButton("click MEEE");
		add(button2);
		
		
		label = new JLabel("");
		add(label);
		
		label2 = new JLabel("2");
		add(label2);
		
		event e = new event();
		button.addActionListener(e);
		
		event2 e2 = new event2();
		button2.addActionListener(e2);
			
		
	}
	
	public class event implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
			label.setText("Now you can see me");
		}
	}
	
	public class event2 implements ActionListener{
		public void actionPerformed(ActionEvent e2) {
			
			label.setText("suprise!");
		}
	}

	
	public static void main (String args[]) {
		
		mainEvent gui = new mainEvent();
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setTitle("event");
		gui.setSize(300,300);
		gui.setVisible(true);
		
	}
}
