import javax.swing.JOptionPane;

public class RiddleMeThis {

	public static void main(String[] args) {

		String answer = JOptionPane.showInputDialog("Riddle me this what comes down but never goes up?");;
		int score = 0;
		
		
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		if(answer.equals ("rain"))
		{
		JOptionPane.showMessageDialog(null, "Correct!");
		score++;
		}
		else
		{
		JOptionPane.showMessageDialog(null, "Wrong, the answer was Rain");
		}
		JOptionPane.showMessageDialog(null, "the score is " + score);
		// 6. Add some more riddles
		String ans = JOptionPane.showInputDialog("Riddle me this, what would become shorter if you added 2 letters?");;
		
		
		
	
		if(ans.equals ("short"))
		{
		JOptionPane.showMessageDialog(null, "Correct!");
		score++;
		}
		else
		{
		JOptionPane.showMessageDialog(null, "Wrong, the answer was short");
		}
		JOptionPane.showMessageDialog(null, "the score is " + score);
		
	}
}


