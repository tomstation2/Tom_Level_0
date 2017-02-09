
// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

public class BananaQuiz {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			// 1. ask the user if they like bananas
			String X = JOptionPane.showInputDialog("Do you like bananas?");
			// 2. if they say no,
			// tell them they are crazy
			// and end quiz
			if (X.equals("No")) {
				JOptionPane.showMessageDialog(null, "You are crazy.");
				System.exit(0);
			}
			// 3. if they say yes
			// ask them what is their favorite hobby
			// show a pop up that says "<your hobby> is much better with
			// bananas!"
			else if (X.equals("Yes")) {
				String Y = JOptionPane.showInputDialog("What is your favorite hobby");
				JOptionPane.showMessageDialog(null, Y + " is much better with bananas!");
			} else {
				JOptionPane.showMessageDialog(null, "You are bananas!");
			}
		}
		// 4. OPTIONAL: if they say something other than “yes” or “no”
		// show a pop up that says “You are bananas!”

	}

}
