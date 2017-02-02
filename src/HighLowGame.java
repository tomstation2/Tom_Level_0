import java.util.Random;

import javax.swing.JOptionPane;

// Copyright Wintriss Technical Schools 2013
public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100.
		int random = new Random().nextInt(100) + 1;
		int winner = 0;
		// 2. Print out the random variable above
		System.out.println(random);
		// 11. do the following 10 times
		for (int i = 0; i < 10; i++) {
			// 1. ask the user for a guess using a pop-up window, and save their response
			String x = JOptionPane.showInputDialog("Guess a number between 1-100.");
			// 4. convert the users’ answer to an int (Integer.parseInt(string))
			int y = Integer.parseInt(x);
			// 5. if the guess is correct
			if (y == random) {
				JOptionPane.showMessageDialog(null, "You win!");
				winner=1;
				break;
			}
			// 6. win
			// 7. if the guess is high
			// 8. tell them it's too high
			else if (y > random) {
				JOptionPane.showMessageDialog(null, "Your answer is too high.");
			}
			// 9. if the guess is low
			else {
				JOptionPane.showMessageDialog(null, "Your answer is too low.");
			}
			// 10. tell them it's too low
		}
		// 12. tell them they lose
		if(winner==0){
		JOptionPane.showMessageDialog(null, "You lose.");
		}
		
	}

}
