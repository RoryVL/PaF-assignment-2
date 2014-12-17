package view;

import controller.EditorController;
import controller.SelectorController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainView extends JFrame implements ActionListener {
	
	private JButton selectorButton, editorButton;
	public MainView() {

		
        JPanel panel = new JPanel();
        add(panel);
		
		selectorButton = new JButton("select pattern");
		panel.add(selectorButton);
		selectorButton.addActionListener(this);

		editorButton = new JButton("edit pattern");
		panel.add(editorButton);
		editorButton.addActionListener(this);
		
		
		pack();
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Patterns!!");
		setLocationRelativeTo(null);
		
	}
	public void actionPerformed(ActionEvent event){
		if(event.getSource() == selectorButton){
                    SelectorController sc = new SelectorController();
                    ParticipantView pv = new ParticipantView();
                    RelationView rv = new RelationView();
                }
                if(event.getSource() == editorButton ){
                    EditorController ec = new EditorController();
                }
	}

}
