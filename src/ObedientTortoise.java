import org.teachingextensions.logo.Tortoise;

public class ObedientTortoise {
	public static void main(String[] args) {
		Tortoise.show();
		Tortoise.penDown();
		Tortoise.setSpeed(10);
drawSquare();
drawTriangle();
drawCircle();
	}

	static void drawSquare() {
		for (int i = 0; i < 4; i++) {
			Tortoise.move(100);
			Tortoise.turn(90);
		}
	}
	static void drawTriangle(){
		for (int i = 0; i < 3; i++) {
			Tortoise.move(100);
			Tortoise.turn(120);
		}
	}
	static void drawCircle(){
		for (int i = 0; i < 360; i++) {
			Tortoise.move(1);
			Tortoise.turn(1);
		}
	}
}
