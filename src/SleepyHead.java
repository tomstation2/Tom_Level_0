
import javax.swing.JOptionPane;

public class SleepyHead {

	public static void main(String[] args) {

		boolean isWeekday, isVacation;

		/*
		 * Ask the user for these values using
		 * JOptionPane.showConfirmDialog(null, "is it a weekday?", "",
		 * JOptionPane.YES_NO_OPTION);
		 */
		String x = JOptionPane.showInputDialog("Is it a weekday?");
		if (x.equals("Yes")) {
			String y = JOptionPane.showInputDialog("Are you on vacation?");
			if (y.equals("Yes")) {
				JOptionPane.showMessageDialog(null, "Sleep in!");
			} else if (y.equals("No")) {
				JOptionPane.showMessageDialog(null, "Get up lazy bones!");
			}
		} else if (x.equals("No")) {
			JOptionPane.showMessageDialog(null, "Sleep in!");
		}

		/*
		 * Print “sleep in” if it is a vacation or a weekend. If it’s a weekday,
		 * print “get up lazybones!” If it is a weekday, and we are on vacation,
		 * print “sleep in”.
		 */
	}
}
