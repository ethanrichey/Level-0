import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;

public class FancyWindow implements KeyListener{

	JFrame frame = new JFrame();
Random rand = new Random();
public static void main(String[] args) {
	FancyWindow f = new FancyWindow();
	f.buildWindow();
	
}

void buildWindow(){
	frame.setSize(200, 200);
	frame.pack();
	frame.setVisible(true);
	frame.addKeyListener(this);
	
	
}



@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	if(e.getKeyCode() == KeyEvent.VK_ENTER){
		int ran = rand.nextInt(1000);
		frame.setSize(ran, ran);
		
	}
	
}

@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
}
