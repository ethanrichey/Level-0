import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener{
	 
	
	
	public void makeButtons(){
		JFrame frame = new JFrame("frame");
		 JPanel panel = new JPanel();
		 JButton button1 = new JButton();
		 JButton button2 = new JButton();
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		frame.setVisible(true);
		button1.setText("Joke");
		button2.setText("Punchline");
		button1.addActionListener(this);
		button2.addActionListener(this);
	
		
	}

	
	public static void main(String[] args) {
	new ChuckleClicker().makeButtons();
}


	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource() == button1){
			
		}
		
	}
}



