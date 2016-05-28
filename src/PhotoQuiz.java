 // Copyright Wintriss Technical Schools 2013
import java.awt.Component;
import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	
	//public static void main(String[] args) throws Exception {
		//Frame quizWindow = new Frame();
		//quizWindow.setVisible(true);
		public static void main(String[] args) throws Exception {
		Frame quizWindow = new Frame();
		quizWindow.setVisible(true);

		// 1. find an image on the Internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image URL”)
		String picture = "https://www.royalcanin.com/~/media/Royal-Canin/Product-Categories/cat-adult-landing-hero.ashx";
		// 2. create a variable of type "Component" that will hold your image
			Component cat;
		// 3. use the "createImage()" method below to initialize your Component
		cat = createImage(picture);
		// 4. add the image to the quiz window
		quizWindow.add(cat);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String response = JOptionPane.showInputDialog(null, "What animal is this?");
		// 7. print "CORRECT" if the user gave the right answer
		if(response.equals("cat")){
			JOptionPane.showMessageDialog(null, "Correct");
		}
		// 8. print "INCORRECT" if the answer is wrong
		else{
			JOptionPane.showMessageDialog(null, "Incorrect");
		}
		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
		quizWindow.remove(cat);
		// 10. find another image and create it (might take more than one line of code)
		String animal = "http://r.ddmcdn.com/s_f/o_1/cx_633/cy_0/cw_1725/ch_1725/w_720/APL/uploads/2014/11/too-cute-doggone-it-video-playlist.jpg";
		
		Component dog;
		
		dog = createImage(animal);
		// 11. add the second image to the quiz window
		quizWindow.add(dog);
		// 12. pack the quiz window
		quizWindow.pack();
		// 13. ask another question
		String ans = JOptionPane.showInputDialog("Which animal is this?");
		// 14+ check answer, say if correct or incorrect, etc.
		if( ans.equals("dog")){
			JOptionPane.showMessageDialog(null, "Correct");
		}
		else{
			JOptionPane.showInputDialog(null, "Incorrect");
		}
		
	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}
// Copyright Wintriss Technical Schools 2013
/*import java.awt.Component;
import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		Frame quizWindow = new Frame();
		quizWindow.setVisible(true);

		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image URL”)

		// 2. create a variable of type "Component" that will hold your image

		// 3. use the "createImage()" method below to initialize your Component

		// 4. add the image to the quiz window

		// 5. call the pack() method on the quiz window

		// 6. ask a question that relates to the image

		// 7. print "CORRECT" if the user gave the right answer

		// 8. print "INCORRECT" if the answer is wrong

		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)

		// 10. find another image and create it (might take more than one line of code)

		// 11. add the second image to the quiz window

		// 12. pack the quiz window

		// 13. ask another question

		// 14+ check answer, say if correct or incorrect, etc.

	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 









