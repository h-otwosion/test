package homework;

import java.util.Scanner;

public class question2 {

	public static void main(String[] args) {
		int number;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요");
		number = sc.nextInt();
		String result = number % 2 != 0 ? "홀수":"짝수";
		System.out.println(result);
	}

}
