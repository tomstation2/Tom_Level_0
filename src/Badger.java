
public class Badger {
	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			b();
			System.out.println();
			for (int k = 0; k < 2; k++) {
				System.out.print("Mushroom ");
			}
			System.out.println();
		}
		b();
		System.out.println();
		System.out.print("Argh! A snake!");
	}

	private static void b() {
		for (int j = 0; j < 10; j++) {
			System.out.print("Badger ");
		}
	}
}
