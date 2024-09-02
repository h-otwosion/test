package practice01;

public class Star06 {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int a = 0; a <= 8 - 2 * i; a++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
