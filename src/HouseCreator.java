import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class HouseCreator {	
	Robot stan;
	public HouseCreator(){
	 stan = new Robot();
		
	}
	
	public void haveStanStartInTheBottomLeftCorner(){
		stan.setX(100);
		stan.setY(900);
	}
	
	public void drawAHouseOfHeight100WithGrassAfterIt(){
		stan.penDown();
		stan.setSpeed(10);
		stan.setPenColor(Color.PINK);
		stan.move(200);
		stan.turn(45);
		stan.move(40);
		stan.turn(90);
		stan.move(40);
		stan.turn(45);
		stan.move(200);
		stan.turn(-90);
		stan.setPenColor(Color.GREEN);
		stan.move(50);
		stan.turn(-90);
	
	}
}
