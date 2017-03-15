// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;

public class SpiralMaker {

	public static void main(String[] args) {
		
		// 3. Make a variable to hold the number of sides and set it to 0
		int x=0;
		// 4. Ask the user which spiral they would like (square, triangle, or pentagon)
		for (int l = 0; l <=6; l++) {
		String y=JOptionPane.showInputDialog("What spiral would you like?");
		// 5. Set the number of sides depending on what the user entered (multiple lines of code)
		Tortoise.setSpeed(10);
		if(y.equals("Square")){
			for (int i = 0; i <= 80; i++) {
				Tortoise.move(3*i);
				Tortoise.turn(x+90);
			}
		}
		else if (y.equals("Triangle")) {
			for (int j = 0; j <= 80; j++) {
				Tortoise.move(4*j);
				Tortoise.turn(x+120);
			}
		}
		else if (y.equals("Pentagon")) {
			for (int k = 0; k <=80; k++) {
				Tortoise.move(2*k);
				Tortoise.turn(x+360/5);
			}
		}
		else{
			JOptionPane.showMessageDialog(null, "Sorry I don't know how to draw a "+y);
		}
		}
		// 6. If the user enters something else, say "Sorry, I don't know how to draw a ..."
	
		
		// 1. Make the Tortoise draw a square spiral shape. If you get stuck, use these instructions: http://bit.ly/YJUOkn

		
		
		// 2. Change your code to turn the square spiral into a triangle spiral
		
	}

}


