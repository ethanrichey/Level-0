// Copyright Wintriss Technical Schools 2013
import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

		public static void main(String[] args) {
			
		
	
			int luck = new Random().nextInt(4);
		JOptionPane.showInputDialog("Ask a question.");
		
	if(luck == 0)
	{
		JOptionPane.showMessageDialog(null, "Yes");
	}
	
	else if(luck == 1)
	{
		JOptionPane.showMessageDialog(null, "no");
	}
	else if(luck == 2)
	{
		JOptionPane.showMessageDialog(null, "Maybe you should ask google?");
	}
	else if(luck == 3)
	{
		JOptionPane.showMessageDialog(null, "hahahaha, no");
	}
	

}}

