import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;




public class AnimalJumping {
	
	
	
	
	
	
	public static void main(String[] args) throws MalformedURLException {
		
			AnimalJumping AJ = new AnimalJumping();
			JFrame frame = new JFrame();
			JLabel label = new JLabel();
			frame.add(label);
			frame.add(AnimalJumping.createImage(imageURL));
			frame.setLocation(null);
			label.setText("Dog Fail");
			frame.pack();
			
			
			
			
			/* We want to show an animation of an animal sucking at jumping inside a JFrame.
	         * Once you have chosen from http://animalssuckingatjumping.tumblr.com/, right click and "Copy Image URL" or “Copy Image Address”
	         * Your program must:
	         * 		- show the animation in full without any user interaction. You don’t need a JPanel since it’s only one JComponent.
	         * 		- show the animation in the center of the screen. Clue: frame.setLocationRelativeTo(null)
	         * 		- have a title such as "Gerbil Fail"
	         */

		 	String imageURL = " http://68.media.tumblr.com/e96ee8402ff26ed7e222218a9fd18598/tumblr_n5m9fg4TUV1s612eao1_500.jpg";
	       
	    }
	 
	 static JLabel createImage(String imageURL) throws MalformedURLException {
		 	URL url = new URL(imageURL);
	        Icon icon = new ImageIcon(url);
	        return new JLabel(icon);
	 }
}














	
	
	
		
	
	
	


