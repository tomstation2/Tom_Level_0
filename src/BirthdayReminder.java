import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {

		// 1. correct the birthdays for your family below
		String Dadbirthday = "1/22";
		String Mombirthday = "9/12";
		String myBirthday = "12/25";

		// 2. Find out which birthday the user wants and and store their
		// response in a variable
		String X = JOptionPane.showInputDialog("Whos birthday do you want to know");
		// 3. Print out what the user typed
		System.out.println(X);
		// 4. if user asked for "mom"
		// print mom's birthday
		if (X.equals("Mom")) {
			JOptionPane.showMessageDialog(null, "Mom's birthday is " + Mombirthday);
		}
		// 5. if user asked for "dad"
		// print dad's birthday
		if (X.equals("Dad")) {
			JOptionPane.showMessageDialog(null, "Dad's birthday is " + Dadbirthday);
		}
		// 6. if user asked for your name
		// print myBirthday
		if (X.equals("Tom") || X.equals("You")) {
			JOptionPane.showMessageDialog(null, "My birthday is " + myBirthday);
		}
		// 7. otherwise print "Sorry, i don't remember that person's birthday!"

	}
}
