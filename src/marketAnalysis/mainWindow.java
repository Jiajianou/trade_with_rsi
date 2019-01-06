package marketAnalysis;

import java.awt.*;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class mainWindow extends JFrame {
	
	private JLabel label1;
	private JButton button1;
	private JTextField textfield1;

	
	
	public mainWindow () {
		
		setLayout(new GridBagLayout());
		GridBagConstraints g = new GridBagConstraints();
		g.fill = GridBagConstraints.HORIZONTAL;
		
		label1 = new JLabel ("Initial Amount:");
		g.gridx = 0;
		g.gridy = 0;
		add(label1,g);
		
		
		textfield1 = new JTextField(15);		
		g.gridx =1;
		g.gridy =0;
		g.gridwidth = 3;
		add(textfield1);
		
		button1 =new JButton("Run");		
		g.gridx = 2;
		g.gridy = 0;
		g.gridwidth = 1;
		add(button1);
		
		mainEvent runProgram = new mainEvent();
		
		

	}
	
	public static void main (String args[]) {
	
	mainWindow gui = new mainWindow();

	gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	gui.setSize(400,400);
	gui.setVisible(true);
	gui.setTitle("Market Predition");
	
	
	
	
	}
}
