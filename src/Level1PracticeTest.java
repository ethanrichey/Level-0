import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Level1PracticeTest implements ActionListener {

	void Run(){
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JLabel label = new JLabel();
		JButton button = new JButton();
		JButton button1 = new JButton();
		JTextField text = new JTextField();
		frame.add(panel);
		frame.setVisible(true);
		frame.pack();
		panel.add(label);
		panel.add(button);
		panel.add(button1);
		panel.add(text);
		button.addActionListener(this);
		button.addActionListener(this);
		label.setText("What is black and white, but red all over?");
		button.setText("Enter");
		button1.setText("Hint");
		text.setSize(30, 10);
		
		
		
	}
	public static void main(String[] args) {
	Level1PracticeTest riddle = new Level1PracticeTest();
	riddle.Run();
	
}
	
	//@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == button){
			
		}
			
		}
		
	}

