import org.teachingextensions.logo.Tortoise;

public class Test {
public static void main(String[] args) {
	drawShape();
	sideNumbers(9);
}
private static void drawShape(){
	System.out.println("Draw a shape.");
}
private static void sideNumbers(int x){
	System.out.println("The number of sides is "+x);
	for (int i = 0; i<x; i++) {
	Tortoise.move(20);
	Tortoise.turn(360/x);
	}
}
}
