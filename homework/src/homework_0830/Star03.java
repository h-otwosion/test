package practice01;

public class Star03 {

	public static void main(String[] args) {
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j < 5 - i; j++) {
				System.out.print(" ");
			}
			for (int y = 0; y <= i; y++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
