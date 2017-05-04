import javax.swing.JOptionPane;

public class NumberSorter {
	public static void main(String[] args) {
		String x = JOptionPane.showInputDialog("Enter a number");
		String y = JOptionPane.showInputDialog("Enter a number");
		String z = JOptionPane.showInputDialog("Enter a number");
		int a = Integer.parseInt(x);
		int b = Integer.parseInt(y);
		int c = Integer.parseInt(z);
		if (a < b) {
			if (a < c) {
				System.out.println(a);
			}
		} else {
			if (b < a) {
				if (b < c) {
					System.out.println(b);
				}
			} else {

			}
			if (c < a) {
				if (c < b) {
					System.out.println(c);
				}
			}
		}
		if (a > b) {
			if (a < c) {
				System.out.println(a);
			}
		} else {
			if (b > a) {
				if (b < c) {
					System.out.println(b);
				}
			} else {

			}
			if (c > a) {
				if (c < b) {
					System.out.println(c);
				}
			}
		}
		if (a > b) {
			if (a > c) {
				System.out.println(a);
			}
		} else {
			if (b > a) {
				if (b > c) {
					System.out.println(b);
				}
			} else {

			}
			if (c > a) {
				if (c > b) {
					System.out.println(c);
				}
			}
		}
	}
}
