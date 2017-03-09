import javax.swing.JOptionPane;

public class Pizza {
	public static void main(String[] args) {
		for (int i = 0; i <= 5; i++) {
			String x = JOptionPane.showInputDialog("Do you like pizza?");
			if (x.equals("Yes")) {
				String y = JOptionPane.showInputDialog("Do you like pepperoni?");
				if (y.equals("Yes")) {
					JOptionPane.showMessageDialog(null, "Enjoy your pepperoni pizza!");
				} else {
					JOptionPane.showMessageDialog(null, "Enjoy your cheese pizza!");
				}
			} else if (x.equals("No")) {
				String z = JOptionPane.showInputDialog("Do you like salad?");
				if (z.equals("Yes")) {
					JOptionPane.showMessageDialog(null, "Enjoy your pepperoni salad!");
				} else {
					JOptionPane.showMessageDialog(null, "You will be hungry!");
				}
			} else {
				JOptionPane.showMessageDialog(null, "Learn how to spell!");
			}
		}
	}
}
