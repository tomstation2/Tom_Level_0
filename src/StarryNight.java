import java.util.Random;

import org.jointheleague.graphical.robot.Robot;
import org.teachingextensions.logo.PenColors;

public class StarryNight {
	// 1. Create a new Robot.
	Robot bender = new Robot();

	public StarryNight() {
		// 2. Using your robot name, print the window width and height to the
		// console
		// robotname.getWindow().getWidth(), robotname.getWindow().getHeight()

		// 3. Set the robot's speed to draw FAST!
		bender.setSpeed(10);
		// 10. Do steps 7, 8 and 9 100 times.

		// 7. Move your robot to a random position using the method created
		// in step 5. Use the random method to get the new X and Y positions.
		// The syso in step 2 should help you determine how big your canvas is.
		for (int i = 0; i <= 100; i++) {
			setXY();
			// 8. Set your robot pen color to be random, using the method
			// created in step 6.
			bender.setRandomPenColor();
			// bender.penDown();
			// 9. Draw a star by calling your method created in step 4.
			// Use the random method to make the size of your star random.
			int length = new Random().nextInt(50);

			drawStar(length);
			// bender.penUp();
		}
		// 11. Hide your robot so that you can see your beautiful starry sky!!
	}

	// 4. Create a method that draws a star. It should have an int parameter
	// that determines the size of the star.
	// Hint: 144 degrees
	void drawStar(int length) {
		for (int i = 0; i < 5; i++) {
			bender.turn(144);
			bender.move(length);
		}
	}

	// 5. Create a method that moves the robot using setX and setY.
	// The method should have 2 int parameters for the X and Y position.
	void setXY() {
		int x = new Random().nextInt(1780);
		int y = new Random().nextInt(950);
		bender.penUp();
		bender.moveTo(x, y);
		bender.penDown();
	}
	// 6. Create a method that RETURNS a random number.
	// The method should have 2 int parameters for the minimum and maximum
	// values
	// of the random number.

	public static void main(String[] args) {
		new StarryNight();
	}
}
