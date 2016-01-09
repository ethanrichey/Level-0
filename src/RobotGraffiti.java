import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
	public static void main(String[] args) {
		
	 Robot a123 = new Robot();
	 a123.setX(1000);
	 a123.setY(800);
	 
	 for (int i = 0; i < 2; i++) {
		
	
	 a123.penDown();
	 a123.setSpeed(8);
	 a123.turn(90);
	 a123.move(250);
	 a123.turn(180);
	 a123.move(250);
	 a123.turn(90);
	 a123.move(300);
	 }
	 a123.turn(90);
	 a123.move(250);
	}

}
