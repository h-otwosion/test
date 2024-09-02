package practice01;

public class Star05 {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= 3 - i; j++) {
				System.out.print(" ");
			}
			for (int a = 0; a <= 2 * i; a++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
