import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;

public class ObedientTortoise {
	public static void main(String[] args) {
		Tortoise.show();
		Tortoise.penDown();
		Tortoise.setSpeed(9);
		String x = JOptionPane.showInputDialog("What shape do you want?");
		if (x.equals("Square")) {
			drawSquare();
		} else if (x.equals("Triangle")) {
			drawTriangle();
		} else if (x.equals("Circle")) {
			drawCircle();
		} else {
			JOptionPane.showMessageDialog(null, "I do not comprehend");
		}

	}

	static void drawSquare() {
		for (int i = 0; i < 4; i++) {
			Tortoise.move(100);
			Tortoise.turn(90);
		}
	}

	static void drawTriangle() {
		for (int i = 0; i < 3; i++) {
			Tortoise.move(100);
			Tortoise.turn(120);
		}
	}

	static void drawCircle() {
		for (int i = 0; i < 360; i++) {
			Tortoise.move(1);
			Tortoise.turn(1);
		}
	}
}
