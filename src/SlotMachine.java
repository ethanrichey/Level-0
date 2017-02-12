import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener {
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel lab1 = new JLabel();
	JLabel lab2 = new JLabel();
	JLabel lab3 = new JLabel();
	JButton button = new JButton();
	Random rand = new Random();
	int n1 = rand.nextInt(3);
	int n2 = rand.nextInt(3);
	int n3 = rand.nextInt(3);
		
void Run(){
	rand.nextInt(3);
	frame.setVisible(true);
	frame.add(panel);
	panel.add(lab1);
	panel.add(lab2);
	panel.add(lab3);
	panel.add(button);
	frame.pack();
	rand.nextInt(3);
	lab1.setText("|" + n1 + "|");
	lab2.setText("|" + n2 + "|");
	lab3.setText("|" + n3 + "|");
	button.setText("Spin!");
	button.addActionListener(this);
	if(n1 == n2 &&){
		JOptionPane.showMessageDialog(null, "Winner");
	}
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public static void main(String[] args) {
SlotMachine ST = new SlotMachine();
ST.Run();
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if (e.getSource() == button){
	 n1 = rand.nextInt(3);
	 n2 = rand.nextInt(3);
	 n3 = rand.nextInt(3);
	 lab1.setText("|" + n1 + "|");
	 lab2.setText("|" + n2 + "|");
	 lab3.setText("|" + n3 + "|");
	}
}
}
