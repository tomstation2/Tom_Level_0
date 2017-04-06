import javax.swing.JOptionPane;

public class HappyPet {
	// 2. Create a happinessLevel variable to store the pet's happiness number.
	// Initialize to zero.
	static int PetHappy = 0;

	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store in variable
		String x = JOptionPane.showInputDialog("What type of pet do you want to buy?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		for (int i = 0; i < 8; i++) {
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			// (eg: cuddle, food, water, take a walk, groom, clean up poop).
			// Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "What do you want to do to make it happy?", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Feed it", "Play with it", "Leave it alone to contemplate its meaningless existence" }, null);

			// 5. Use user input to call the appropriate method created in step 4.
			if (task == (0)) {
				B1(x);
			} else if (task == (1)) {
				B2(x);
			} else {
				B3(x);
			}
			// 6. If you determine the happiness level is large enough, tell the
			// user that he loves his pet and use break; to exit for loop.
			if (PetHappy >= (420)) {
				break;
			}
		}
	}

	// 4. Create methods to handle each of your user selections.
	// Each method should create a pop-up with the pet's response (eg. cat might purr when pet),
	// and INCREMENT the pet's happiness Level.
	static void B1(String S) {
		JOptionPane.showMessageDialog(null, S + " might purr or chirp when fed.");
		System.out.println((PetHappy + 5));
		PetHappy += 5;
	}

	static void B2(String Q) {
		JOptionPane.showMessageDialog(null, Q + " might meow or bark or chirp when playful.");
		System.out.println((PetHappy + 10));
		PetHappy += 10;
	}

	static void B3(String Y) {
		JOptionPane.showMessageDialog(null, Y + " might be supreme when contemplating existence.");
		System.out.println((PetHappy + 100));
		PetHappy += 100;
	}
}
