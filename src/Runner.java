
public class Runner {
	public static void main(String[] args) {
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
	}

}




