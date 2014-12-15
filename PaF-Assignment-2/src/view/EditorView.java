package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class EditorView extends JFrame implements ActionListener{
	
	//Deze combobox moet gevuld worden met alle scopes ipv ints, maar dat moet via de controller
	private JComboBox<Integer> scopeComboBox;
	//Idem, maar dan voor de purposes
	private JComboBox<Integer> purposeComboBox;
	//Idem, maar dan voor patterns
	private JComboBox<Integer> patternComboBox;
	
	private JTextArea problemTextArea, solutionTextArea, consequencesTextArea; 
	
	
	//Moet nog een pattern meekrijgen
	public EditorView(){
		
		JPanel panel = new JPanel();
        add(panel);
		
		//ook hiet scopes ipv int
		scopeComboBox = new JComboBox<Integer>();
		//for-loop die de ComboBox vult
		panel.add(scopeComboBox);
		scopeComboBox.addActionListener(this);
		
		//hier hetzelfde verhaal als bij scopes maar nu purposes
		purposeComboBox = new JComboBox<Integer>();
		panel.add(purposeComboBox);
		purposeComboBox.addActionListener(this);
		
		//hier hetzelfde verhaal als bij scopes maar nu patterns
		patternComboBox = new JComboBox<Integer>();
		panel.add(patternComboBox);
		patternComboBox.addActionListener(this);
		
		JLabel problemLabel = new JLabel("Problem");
		panel.add(problemLabel);
		
		problemTextArea = new JTextArea(10,25);
		panel.add(problemTextArea);
		
		
		JLabel solutionLabel = new JLabel("Solution");
		panel.add(solutionLabel);
		
		solutionTextArea = new JTextArea(10,25);
		panel.add(solutionTextArea);
		solutionTextArea.setEditable(false);
		
		JLabel consequencesLabel = new JLabel("Consequnces");
		panel.add(consequencesLabel);
		
		consequencesTextArea = new JTextArea(10,25);
		panel.add(consequencesTextArea);
		
		
		
		//plaatje moet nog toegevoegd worden, maar dat is makkelijker als de controller bestaat.
		
		pack();
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Edit pattern");
		setLocationRelativeTo(null);
		
		
	}
	public void actionPerformed(ActionEvent event){
		
	}

}
