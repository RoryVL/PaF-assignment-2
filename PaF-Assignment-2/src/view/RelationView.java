package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RelationView extends JFrame implements ActionListener{
	
		//Deze combobox moet gevuld worden met partisipants ipv ints, maar dat moet via de controller
		private JComboBox<Integer> toComboBox;
		//Idem
		private JComboBox<Integer> fromComboBox;
		
		private JTextField fromMultiField, toMultiField;
		
		private JButton saveButton;
		
		
		public RelationView(){
			drawField();
		}
		/*
		 * Deze construcor moet nog twee Participants meekrijgen
		 * 
		 * public RelationView(){
			drawField();
		}
		*/
		public void actionPerformed(ActionEvent event){
			
		}
		public void drawField(){
			JPanel panel = new JPanel();
	        add(panel);
			
			JLabel fromLabel = new JLabel("From participant");
			panel.add(fromLabel);
	        
	        //ook hier participants ipv ints
			fromComboBox = new JComboBox<Integer>();
			panel.add(fromComboBox);
			fromComboBox.addActionListener(this);
			
			JLabel fromMultiLabel = new JLabel("Multiplicity");
			panel.add(fromMultiLabel);
			
			fromMultiField = new JTextField(3);
			panel.add(fromMultiField);
	        
	        
			JLabel toLabel = new JLabel("to participant");
			panel.add(toLabel);
			
			//ook hier participants ipv ints
			toComboBox = new JComboBox<Integer>();
			//for-loop die de ComboBox vult
			panel.add(toComboBox);
			toComboBox.addActionListener(this);
			
			
			JLabel toMultiLabel = new JLabel("Multiplicity");
			panel.add(toMultiLabel);
			
			toMultiField = new JTextField(3);
			panel.add(toMultiField);
	        
			saveButton = new JButton("Save");
			panel.add(saveButton);
			saveButton.addActionListener(this);
			
			
			
			pack();
			setVisible(true);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setTitle("RelationView");
			setLocationRelativeTo(null);
		}

}
