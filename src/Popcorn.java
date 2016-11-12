
public class Popcorn {

	public static void main(String[] args) {
		Popcorn p = new Popcorn();
		Microwave m = new Microwave();
		m.putInMicrowave(p);
		m.setTime(20);
		m.startMicrowave();
		p.applyHeat();
		
		
	}
		private int kernels = 20;
		private String flavor;
		
		
		Popcorn(String flavor) {
			this.flavor = flavor;
			System.out.println("Popcorn says: making package of " + this.flavor + " popcorn.");
		}




		public Popcorn() {
			
		}
		public void applyHeat() {
			pause();


			if (kernels == 0) {
				System.out.println("Popcorn says: Time to eat popcorn!");
				System.exit(0);
			} else {
				System.out.println("POP!" + kernels);
				kernels--;
			}
		}

	
		private void pause() {
			try {
				Thread.sleep(150);
			} catch (InterruptedException e) {
				e.printStackTrace();
				
			
			}
			
			
		}
}
		class Microwave {
			
			private int cookTime;
			Popcorn thingToBeCooked;
			

			Microwave() {
				System.out.println("Microwave says: a Microwave has been made.");
			}


			void putInMicrowave(Popcorn thingToBeCooked) {
				System.out.println("Microwave says: popcorn put in microwave.");
				this.thingToBeCooked = thingToBeCooked;
			}


			void setTime(int cookTimeInMinutes) {
				this.cookTime = cookTimeInMinutes;
				System.out.println("Microwave says: cook time is set to " + this.cookTime + " minutes.");
				
			}


			void startMicrowave() {
				if (thingToBeCooked == null)
					System.out.println("Microwave says: there's nothing in the microwave!");
				for (int i = 0; i < cookTime*10 + 1; i++) {
					thingToBeCooked.applyHeat();
				}
			}
		}
	




