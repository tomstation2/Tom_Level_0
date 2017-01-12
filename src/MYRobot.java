import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class MYRobot {
public static void main(String[] args) {
	Robot bender=new Robot();
	bender.setPenColor(Color.RED);
	bender.penDown();
	bender.move(100);
	bender.turn(60);
	bender.move(100);
}
}
