
import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

/* Teacher’s note: before beginning, draw a pentagon and have students work out the angle that the robot will have to turn (360/5) */

public class PentagonCrazy {

	private void makePrettyThings() {
		
		Robot Penta = new Robot();
		
		Penta.penDown();
		
		Penta.setSpeed(10);
		
		Penta.setPenWidth(20);
		
		Penta.setPenColor(Color.blue);
		
		int q = 5;
		
		int a = 360/5;
		
		for(int i=0; i<201; i++){
			
		Penta.move(i);
			
		
			
		Penta.turn(a);
			// 11. Turn the robot one more degree
		Penta.turn(1);
		}
	

	// Variations:
	// *12. make the pattern really huge
	
	// *13. randomize the color of the pattern 
	// *14. experiment with different shapes
	}
	public static void main(String[] args) {
		new PentagonCrazy().makePrettyThings();
	}
}

