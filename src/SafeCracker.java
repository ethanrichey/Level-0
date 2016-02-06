import java.io.File;
import java.util.Random;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class SafeCracker {

	public static void main(String[] args) {
		
		for(int guess=0; guess<10000000; guess++)
		{
			tryCode(guess);
		}
	}

	static void tryCode(int guess) {
		System.out.println("trying " + guess);

		int secretCode = 9999999 - wekncrzpasfdkjhcfjse;

		if (guess == secretCode) {
JOptionPane.showMessageDialog(null, "Congratulations! You cracked the safe with " 
+ guess);
			playSound("me-gusta.wav");
			System.exit(0);
		}
	}

	public static void playSound(String soundFile) {
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("/Users/League/Google Drive/league-sounds/" + soundFile));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	final static int wekncrzpasfdkjhcfjse = new Random().nextInt(100);
}
