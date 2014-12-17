package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class ParticipantView extends JFrame implements ActionListener {
	private JTextField nameField, visibillityField;
	private JRadioButton interfaceTrue, interfaceFalse, staticTrue, staticFalse, abstractTrue, abstractFalse;
	
	
	
	public ParticipantView(){
		JPanel panel = new JPanel();
                add(panel);
		
		JLabel nameLabel = new JLabel("Name");
		panel.add(nameLabel);
		
		nameField = new JTextField(10);
		panel.add(nameField);
		
		JLabel visibillityLabel = new JLabel("Visibillity");
		panel.add(visibillityLabel);
		
		visibillityField = new JTextField(10);
		panel.add(visibillityField);
		
		JLabel interfaceLabel = new JLabel("Is interface");
		panel.add(interfaceLabel);
		
		interfaceTrue = new JRadioButton("Yes");
		panel.add(interfaceTrue);
		interfaceTrue.addActionListener(this);
		
		interfaceFalse = new JRadioButton("No");
		panel.add(interfaceFalse);
		interfaceFalse.addActionListener(this);
		
		JLabel staticLabel = new JLabel("Is static");
		panel.add(staticLabel);
		
		staticTrue = new JRadioButton("Yes");
		panel.add(staticTrue);
		staticTrue.addActionListener(this);
		
		staticFalse = new JRadioButton("No");
		panel.add(staticFalse);
		staticFalse.addActionListener(this);
		
		
		JLabel abstractLabel = new JLabel("Is abstract");
		panel.add(abstractLabel);
		
		abstractTrue = new JRadioButton("Yes");
		panel.add(abstractTrue);
		abstractTrue.addActionListener(this);
		
		abstractFalse = new JRadioButton("No");
		panel.add(abstractFalse);
		abstractFalse.addActionListener(this);
		
		
		
		pack();
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("ParticipantView");
		setLocationRelativeTo(null);
		
		
		
		
	}
	
	
	public void actionPerformed(ActionEvent event){
		
	}

}
