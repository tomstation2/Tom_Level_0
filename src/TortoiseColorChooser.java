
// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;
import java.awt.Color;

import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.Tortoise;

public class TortoiseColorChooser {
	public static void main(String[] args) {

		// 3. ask the user what color they would like the tortoise to draw
		// 4. use an if/else statement to set the pen color that the user
		// requested
		for (int i = 1; i < 10; i++) {
			String x = JOptionPane.showInputDialog("What color would you like the tortoise to draw?");
			if (x.equals("green")) {
				Tortoise.setPenColor(Color.GREEN);
			} else if (x.equals("blue")) {
				Tortoise.setPenColor(Color.BLUE);
			} else if (x.equals("yellow")) {
				Tortoise.setPenColor(Color.YELLOW);
			} else {
				Tortoise.setPenColor(PenColors.getRandomColor());
			}

			// 5. if the user doesn’t enter anything, choose a random color

			// 6. put a loop around your code so that you keep asking the user
			// for
			// more colors & drawing them

			// 2. set the pen width to 10
			Tortoise.setPenWidth(10);
			// 1. make the tortoise draw a shape (this will take more than one
			// line
			// of code)
			for (int y = 0; y < 4; y++) {
				Tortoise.move(50);
				Tortoise.turn(90);
			}
		}
	}
}
