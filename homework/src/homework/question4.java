package homework;

import java.util.Scanner;

public class question4 {

	public static void main(String[] args) {
		int a, b;
		int tmp;
		Scanner sc = new Scanner(System.in);
		System.out.print("변수 a에 넣을 숫자 입력 :");
		a = sc.nextInt();
		System.out.print("변수 b에 넣을 숫자 입력 :");
		b = sc.nextInt();
		
		tmp = a;
		a = b;
		b = tmp;
		System.out.printf("변수 a의 값 = %d\n", a);
		System.out.printf("변수 b의 값 = %d", b);

	}

}
