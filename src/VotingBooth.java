import javax.swing.JOptionPane;
import javax.xml.bind.helpers.ParseConversionEventImpl;

public class VotingBooth {
public static void main(String[] args) {
int num;
String answer = JOptionPane.showInputDialog("Who are you voting for?");

	if (answer.equals("Donald Trump")){
		JOptionPane.showMessageDialog(null, "You dun goofed!");
	}
	else {
		String age = JOptionPane.showInputDialog("What is your age?");
		num = Integer.parseInt(age);
			
	if (num >= 18){
		JOptionPane.showMessageDialog(null, answer + " will be the next president");
	}
	else{
	JOptionPane.showMessageDialog(null, "No one cares what you think");
	}
	}


}



	
	
	
	
	
	
	
	
	
	
	
	
}
