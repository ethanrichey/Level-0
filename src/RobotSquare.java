
import org.jointheleague.graphical.robot.Robot;

public class RobotSquare {
	public static void main(String[] args) throws Exception {
	
		Robot Robot = new Robot();
		
		Robot.penDown();
		
		Robot.setSpeed(20);
		
		for(int i=0; i<4; i++){
		
		Robot.move(200);
		
		Robot.turn(90);
	}}
}

