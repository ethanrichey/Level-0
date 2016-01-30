import javax.swing.JOptionPane;

public class Unbirthday {
public static void main(String[] args) {
	
	String date = JOptionPane.showInputDialog("When is your birthday?");;
	
	
	
	if(date.equals("1/29"))
			{
		JOptionPane.showMessageDialog(null, "Happy Birthday!");
			}
	else
	{
		JOptionPane.showMessageDialog(null, "Happy Unbirthday!");
	}
	
	
	
	
	
	
	
	
	
}
}
