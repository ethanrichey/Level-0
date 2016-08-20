
public class HarryPotter {
	private boolean strike;
	private boolean cloakOn;
	
	HarryPotter() {
		System.out.println("making Harry Potter...");
	}

	void castSpell(String spell){
System.out.println("casting spell: " + spell);
	}

	void makeInvisible(boolean invisible) {
		this.cloakOn = invisible;
		
		if (cloakOn)
			System.out.println("Harry is invisible");
		else
			System.out.println("Harry is visible");
	}

	void spyOnSnape() {
		System.out.println("Harry sees Professor Snape doing nefarious things.");
	}
	
	void snapeAttack(boolean attack){
	if(attack){
	System.out.println("snape launches a counter attack!");
	  }
	else{ 
		System.out.println("Snape takes the L");
	  }
	}
	
	
	
	
	/*public static void main(String[] args) {
		// 1. make harry potter
		HarryPotter Potter = new HarryPotter();
		// 2. become invisible
		Potter.makeInvisible(true);
		
		
		// 3. spy on professor snape
		Potter.spyOnSnape();
		// 4. become visible again
		Potter.makeInvisible(false);
		// 5. cast a “stupefy” spell
		Potter.castSpell("Stupefy");
		Potter.snapeAttack(true);
		Potter.makeInvisible(true);
	}*/

}




