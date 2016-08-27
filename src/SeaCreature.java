/*
 * 1. In a Runner class, make a SeaCreature called “Spongebob”. Use the methods below to make him eat, and laugh.
 * 2. Make Patrick and Squidward and print their name, have them eat, and make them laugh.
 */

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class SeaCreature {

	private String name;

	SeaCreature(String name) {
		this.name = name;
	}

	public String getName() {
		return "My name is " + name;
	}
	public void PopCulture(){
	System.out.println(name + " spouts a funny line that is going to be a meme 6 years later lmao xddddd savage af 100!!!");	
		
	}
	public void RealityHits(){
		if(name.equals("Spongebob")){
			System.out.println("Spongebob shows HR every episode of the show and Mr. Krabs loses his job and goes to jail on hundreds of assault charges and tax fraud charges");
			}
		else if(name.equals ("Squidward")){
			System.out.println("Squidward ");
		}
		
		
	}
	
	
	
	public void eat() {
		System.out.println(name + " is eating krabby patties");
	}

	public void laugh() {
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(
					"/Users/League/Google Drive/league-sounds/" + this.name + ".wav").toURI().toURL());
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
