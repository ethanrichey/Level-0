import java.util.Random;

import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;
import info.gridworld.world.World;
public class WorldGrid{
	
	public static void main(String[] args) {
		Random rand = new Random();
		WorldGrid wg = new WorldGrid();
		World w = new World();
		w.show();
		Bug b = new Bug();
		Bug b2 = new Bug();
		Location L = new Location(5, 5);
		Location L2 = new Location(Random);
		b.getLocation();
		w.add(L, b);
		w.add(, occupant);
		
	}
}
