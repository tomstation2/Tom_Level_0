import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {
		for (int i = 0; i <= 5; i++) {
			// 1. Get 2 numbers from the user and convert them to integer.
			String x = JOptionPane.showInputDialog("Enter a number");
			String y = JOptionPane.showInputDialog("Enter a number");
			int num = Integer.parseInt(x);
			int numb = Integer.parseInt(y);
			// 2. Customize pop-up to support add/subtract/multiply/divide
			// operations.
			int operation = JOptionPane.showOptionDialog(null, "The question", "Calculator", 0,
					JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Add", "Subtract", "Multiply", "Divide" },
					null);

			// 5. Call the methods created in steps 3 and 4 to perform the
			// appropriate operation
			// based on user request.
			if (operation == 0) {
				add(num, numb);
			} else if (operation == 1) {
				subtract(num, numb);
			} else if (operation == 2) {
				multiply(num, numb);
			} else {
				divide(num, numb);
			}
			// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator
			// operations.
		}
	}

	// 3. Create method for addition operation.
	// Method should create pop-up that shows equation and solution, eg. 45 + 25
	// = 70.
	// HINT: use 'static void add(int num1, int num2) { ... }
	static void add(int x, int y) {
		JOptionPane.showMessageDialog(null, ((x + y)));
	}

	static void subtract(int x, int y) {
		JOptionPane.showMessageDialog(null, ((x - y)));
	}

	static void multiply(int x, int y) {
		JOptionPane.showMessageDialog(null, ((x * y)));
	}

	static void divide(int x, int y) {
		JOptionPane.showMessageDialog(null, ((x / y)));
	}
	// 4. Create similar methods for subtraction, multiplication and division.
}