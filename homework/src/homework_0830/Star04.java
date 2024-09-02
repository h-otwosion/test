package practice01;

public class Star04 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (int y = 0; y < 6 - i; y++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
