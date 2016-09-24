import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField answer = new JTextField(20);
	JTextField answer1 = new JTextField(20);
	JButton button = new JButton();
	String convert(String binary) {
	   	 int asciiValue = Integer.parseInt(binary, 2);
	   	 char theLetter = (char) asciiValue;
	   	 return "" + theLetter;
	    }

	
	
	void run(){
		
		frame.setVisible(true);
		frame.add(panel);
		panel.setVisible(true);
		panel.add(answer);
		panel.add(answer1);
		panel.add(button);
		button.addActionListener(this);
	}
	
	
	
	public static void main(String[] args) {
	
		BinaryConverter convert = new BinaryConverter();
		convert.run();
		
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();
		if(buttonPressed == button){
			answer1.setText(convert(answer.getText()));
		}
		
	}

	


}
