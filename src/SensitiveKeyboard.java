import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class SensitiveKeyboard implements KeyListener  {
	
	
	
	
	public static void main(String[] args) {
	SensitiveKeyboard keyboard = new SensitiveKeyboard();
	keyboard.Run();
	
	
	
	}
	
	public void Run(){
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.addKeyListener(this);
	
		
		
	
	}
	
	public void speak(String words) {
	   	 try {
	   		 Runtime.getRuntime().exec("say " + words).waitFor();
	   	 } catch (Exception e) {
	   		 e.printStackTrace();
	   	 }
	    }


	


	
	
	public void KeyPressed(){
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		speak("Ouch");
	
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		speak("Ouch");
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
	
	
	}
}
