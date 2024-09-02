package practice01;

import java.util.Scanner;

public class Parameter_Output {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력할 정수의 갯수를 입력하세요 : ");
		int array_size = sc.nextInt();
		int[] ary = new int[array_size];
		
		for (int i = 0; i < array_size; i++) {
			System.out.printf("%d 번째 정수를 입력하세요 : ", i + 1);
			ary[i] = sc.nextInt();
		}

	}

}
