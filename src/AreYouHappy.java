import javax.swing.JOptionPane;

public class AreYouHappy {
	public static void main(String[] args) {
		String x = JOptionPane.showInputDialog("Are you happy?");
		if (x.equals("Yes")) {
			JOptionPane.showMessageDialog(null, "Keep whatever you're doing.");
		} else if (x.equals("No")) {
			String y = JOptionPane.showInputDialog("Do you want to be happy?");
			if (y.equals("Yes")) {
				JOptionPane.showMessageDialog(null, "Change something.");
			} else if (y.equals("No")) {
				JOptionPane.showMessageDialog(null, "Keep doing whatever you are doing.");
			} else {

			}
		} else {

		}
	}
}
