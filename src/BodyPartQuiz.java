import java.awt.Frame;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class BodyPartQuiz {

	// Get 3 celebrity photos from the internet, save them to your computer, and fill
	
	// in their paths here. To get the path, right click on the image, and copy its Location.
	String firstImage = "/Users/league/Desktop/kanye.png";
	String secondImage = "/Users/league/Desktop/keem.jpg";
	String thirdImage = "/Users/league/Desktop/tosh.jpeg";
	String fourthImage = "/Users/league/Desktop/charlie-sheen.jpg";
	Frame window = new Frame();
	
	private void startQuiz() {
		
		// Set the size of the window so that you can only see part of the image.
		window.setSize(800, 800);
		// Make an int variable to hold the score.
	int score = 0;
		// Ask the user who this person is and store their answer
	String answer = JOptionPane.showInputDialog("Who is this?");
		// If they got the answer right:
		if(answer.equals("Kanye West")){
			JOptionPane.showMessageDialog(null, "Correct");
		score++;
		}
	
		// -- Tell them they are correct.
		// -- Increase the score by 1
		else{
		JOptionPane.showMessageDialog(null, "Wrong");
		}
		// Otherwise:
		// -- Tell them they are wrong

		// Use the method below to show the next image
		// Show the score
		JOptionPane.showMessageDialog(null, score);
		// .... repeat for all your images.....
		showNextImage();
		window.setSize(200, 200);
		answer = JOptionPane.showInputDialog("Who is this?");
		if(answer.equals("Keemstar")){
			JOptionPane.showMessageDialog(null, "Correct");
			score++;
		}
		else{
			JOptionPane.showMessageDialog(null, "Wrong");
		}
		JOptionPane.showMessageDialog(null, score);
		showNextImage();
		window.setSize(100, 100);
		answer = JOptionPane.showInputDialog("Who is this?");
		if(answer.equals("Tosh")){
			JOptionPane.showMessageDialog(null, "Correct");
			score++;
		}
		else{
			JOptionPane.showMessageDialog(null, "Wrong");
		}
		JOptionPane.showMessageDialog(null, score);
	-		showNextImage();
		window.setSize(600, 600);
		answer = JOptionPane.showInputDialog("Winner winner chicken _______ dinner!");
		if(answer.equals("Sheen")){
			JOptionPane.showMessageDialog(null, "Correct");
			score++;
		}
		else{
			JOptionPane.showMessageDialog(null, "Wrong");
		}
		JOptionPane.showMessageDialog(null, score);
	
	
	}


	public void showNextImage() {
		window.removeAll();
		window.add(getNextImage());
		window.pack();
	}

	public static void main(String[] args) {
		BodyPartQuiz quiz = new BodyPartQuiz();
		quiz.initializeGui();
		quiz.startQuiz();
	}

	private void initializeGui() {
		initializeImageList();
		imageIterator = imageList.iterator();
		window.setVisible(true);
		showNextImage();
	}

	private JLabel loadImage(String fileName) {
		Icon icon = new ImageIcon(fileName);
		JLabel image = new JLabel(icon);
		return image;
	}

	ArrayList<JLabel> imageList = new ArrayList<JLabel>();
	Iterator<JLabel> imageIterator;

	private void initializeImageList() {
		JLabel imageLabel = loadImage(firstImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(secondImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(thirdImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(fourthImage);
		imageList.add(imageLabel);
	}

	private JLabel getNextImage() {
		if (imageIterator.hasNext())
			return imageIterator.next();
		window.dispose();
		return new JLabel();
	}
}


