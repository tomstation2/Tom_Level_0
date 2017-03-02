import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {

		// 1. Watch the first 2 minutes of this movie: http://vimeo.com/2485018
		// 2. On paper, write all the numbers that get printed when you run this
		// class
		// 0,1,2

		// 3. Use the randomNumber to give the user a random compliment.
		for (int i = 0; i < 5; i++) {
			int r = new Random().nextInt(3);
			if (r == 0) {
				JOptionPane.showMessageDialog(null, "You are so cool");
			} else if (r == 1) {
				JOptionPane.showMessageDialog(null, "You are awesome");
			} else {
				JOptionPane.showMessageDialog(null, "You can do it");
			}
		}
		// 4. Repeat all the code above 10 times

		// 5. Find someone to test out your program. They will like it :)
	}
}
