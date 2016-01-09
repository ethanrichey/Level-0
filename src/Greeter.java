import javax.swing.JOptionPane;

public class Greeter {
	public static void main(String[] args) {
	String name =  JOptionPane.showInputDialog("Who are you?");
	 
	 JOptionPane.showMessageDialog(null, "Hi " + name);
	}

}
