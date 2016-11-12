import Kettle.Water;

public class TeaMaker {
	


		/* Figure out how to make a cup of tea using the classes below */


	}


	class TeaBag {


		public final static String GREEN = "Green";
		public final static String MINT = "Mint";
		public final static String CHAMOMILE = "Chamomile";
		public final static String PASSION_FRUIT = "Passion Fruit";


		private String flavor;
	
public static void main(String[] args) {
	TeaBag t = new TeaBag("Green");
	Cup c = new Cup();
	Kettle k = new Kettle();
	t.getFlavor();
	k.getWater();
	k.boil();
	
	
}
		TeaBag(String flavor) {
			this.flavor = flavor;
		}


		public TeaBag() {
			// TODO Auto-generated constructor stub
		}
		String getFlavor() {
			return flavor;
		}


	}


	class Kettle {


		private Water water = new Water();


		Water getWater() {
			return water;
		}


		void boil() {
			this.water.isHot = true;
		}


		class Water {


			private boolean isHot = false;


			public boolean isHot() {
				return this.isHot;
			}
		}


	}


	class Cup {


		private TeaBag teabag;


		void makeTea(TeaBag teabag, Kettle.Water hotWater) {
			this.teabag = teabag;
			if (hotWater.isHot())
				System.out.println("Making hot " + teabag.getFlavor() + " tea.");
			else
				System.out.println("Can't make tea with cold water! ");
		}


	}






