package homework;

import java.util.Scanner;

public class question3 {

	public static void main(String[] args) {
		float radius;
		final double PI = 3.14;
		System.out.println("원의 넓이 구하기");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("원의 반지름을 입력하세요.");
		radius = sc.nextFloat();
		System.out.printf("원의 넓이는 %.2f 입니다.", radius * radius * PI);

	}

}
