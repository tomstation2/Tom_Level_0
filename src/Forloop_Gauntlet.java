
public class Forloop_Gauntlet {
	public static void main(String[] args) {
		for (int i = 0; i <= 100; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		for (int i = 100; i >= 0; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
		for (int i = 2; i <= 100; i += 2) {
			System.out.print(i + " ");
		}
		System.out.println();
		for (int i = 1; i <= 99; i += 2) {
			System.out.print(i + " ");
		}
		System.out.println();
		for (int i = 0; i <= 500; i++) {
			if ((i % 2) == 0) {
				System.out.print(i + "even ");
			} else
				System.out.print(i + "odd ");
			if ((i % 25) == 0) {
				System.out.println();
			}
		}
		for (int i = 0; i <= 777; i += 7) {
			System.out.print(i + " ");
		}
		System.out.println();
		for (int i = 2002; i <= 2017; i++) {
			System.out.print(i + "i was " + (i - 2002) + " years old ");

		}
		System.out.println();
		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 2; j++) {
				System.out.println(i + " " + j);
			}
		}
		for (int i = 1; i <= 9; i++) {
			System.out.print(i + " ");
			if ((i % 3) == 0) {
				System.out.println();
			}
		}
	}
}
