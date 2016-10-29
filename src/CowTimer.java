


	import java.applet.AudioClip;
	import java.io.IOException;
	import javax.swing.JApplet;


	public class CowTimer {
		/*
		 * This is an advanced recipe. There may be more than one line of code for
		 * each instruction.
		 * Work in seconds when testing, then change to minutes
		 */
		

		public static void main(String[] args) throws InterruptedException {
			/* 1. Make a CowTimer, set the time and start it. */
			CowTimer timer = new CowTimer();
			timer.setTime(30);
			timer.start();
			
			
			

		}


		private int seconds;


		public void setTime(int seconds) {
			this.seconds = seconds;
			System.out.println("Cow set to " + seconds + " seconds.");
		}


		public void start() throws InterruptedException {
			/*
			 * 2. Count down the minutes, print the current minute then sleep for 60
			 * seconds using Thread.sleep(int milliseconds).
			 */
			for (int seconds = 30; seconds > 0; seconds--) {
				System.out.println(seconds);
				Thread.sleep(1000);
			}
			if(seconds == 0){
				
				
			}
			/*
			 * 3. When the timer is finished, use the playSound method to play a moo
			 * sound. You can download one from freesound.org, then drag it into
			 * your default package. Tell the students (by speaking) it's time to walk.
			 */
			

		}


		private void playSound(String fileName) {
			AudioClip sound = JApplet
					.newAudioClip(getClass().getResource(fileName));
			sound.play();
		}


	private void speak(String stuffToSay) {
			try {
				Runtime.getRuntime().exec("say " + stuffToSay).waitFor();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}




	}



	
	
	
	

