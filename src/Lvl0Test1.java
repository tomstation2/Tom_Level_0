import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

/* Level 0 Exam: Coding  Exercise #1 */
public class Lvl0Test1 {
	static Robot rob = new Robot();

	public static void main(String[] args) {
		// 3. ask the user what color they would like the Robot to draw
		String x = JOptionPane.showInputDialog("What colour would you like to have? Black, yellow, or blue?");
		// 4. use an if/else statement to set the pen color that the user requested (minimum of 2 colors)
		if (x.equals("Black")) {
			rob.setPenColor(0, 255, 0);
		} else if (x.equals("Yellow")) {
			rob.setPenColor(255, 0, 0);
		} else if (x.equals("Blue")) {
			rob.setPenColor(0, 0, 255);
		}
		// 2. set the pen width to 10
		rob.setPenWidth(10);
		// 1. make the Robot draw a shape
		rob.penDown();
		rob.setSpeed(10);
		for (int i = 0; i <= 3; i++) {
			rob.move(200);
			rob.turn(90);
		}
	}

}