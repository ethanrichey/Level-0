import java.awt.Color;
import java.awt.Component;
import java.util.Random;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TypingTutor implements KeyListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	
	char currentLetter;
	
	
	char generateRandomLetter() {
			Random r = new Random();
			return (char) (r.nextInt(26) + 'a');
		}

	void run(){
		currentLetter = generateRandomLetter();
		frame.add(panel);
		frame.setVisible(true);
		panel.add(label);
		label.setText(currentLetter + "");
		label.setFont(label.getFont().deriveFont(28.0f));
		frame.pack();
		frame.addKeyListener(this);
		
		
	}
	
	
	public static void main(String[] args) {
	TypingTutor T = new TypingTutor();
	T.run();
	T.generateRandomLetter();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent key) {
		System.out.println("You typed: " + currentLetter);
		key.getKeyChar();
		if( key.getKeyChar() == currentLetter ){
			panel.setBackground(Color.green);
			System.out.println("Correct");
		}
		else{
			panel.setBackground(Color.red);
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		currentLetter = generateRandomLetter();
		label.setText(currentLetter + "");
		
	}
	
	
	
}
