import org.jointheleague.graphical.robot.Robot;

public class ColorSpiral {

	public static void main(String[] args) {
		
		Robot Spiral = new Robot();
		
		Spiral.penDown();
		
		Spiral.setSpeed(10);
		
		for(int i=0; i<75; i++){
			
		Spiral.setRandomPenColor();
			
		Spiral.move(5*i);
			
		Spiral.turn(120);
			// 8. Change the number of sides to 7 (don’t add a new line of code for this one!)
		Spiral.move
			
			Spiral.setPenWidth(i);
		}
		
	}
}



