import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class FortuneCookie implements ActionListener{
	
	JPanel panel;
	JButton button;// = new JButton();
	JFrame frame;// = new JFrame();

FortuneCookie(){
		this.panel = new JPanel();
		this.button = new JButton();
		this.frame = new JFrame();
}
	private void showButton(){
		this.frame.setVisible(true);
		this.frame.setSize(500, 500);
		this.frame.add(panel);
		this.panel.add(button);
		this.button.setSize(200, 200);
		this.button.addActionListener((ActionListener) this);
		this.button.setText("Fortune");
	
	
	}
	
	
	
	
	
	
	public static void main(String[] args) {
	FortuneCookie fortune = new FortuneCookie();
	fortune.showButton();
}
	@Override
	public void actionPerformed(ActionEvent e) {
		int rand = new Random().nextInt(5);
		if( rand == 0){
			JOptionPane.showMessageDialog(null, "RIP");
		}
		else if(rand == 1){
			JOptionPane.showMessageDialog(null, "gg no re");
		}
		else if(rand == 2){
			JOptionPane.showMessageDialog(null, "You will always be a dissapointment");
		}
		else if(rand == 3){
			JOptionPane.showMessageDialog(null, "No");
		}
		else if(rand == 4){
			JOptionPane.showMessageDialog(null, "Dayum ur life is gonna SUCK");
		}
	
	}
}
