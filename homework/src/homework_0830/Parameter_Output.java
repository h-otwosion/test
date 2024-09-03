package practice01;

import java.util.Scanner;
import java.util.Arrays;

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
		
		System.out.println("getSum : 1, getMax : 2, getExc : 3, getRev : 4");
		System.out.print("사용할 메서드 번호를 입력해주세요 : ");
		
		int methnum = sc.nextInt();
		
		switch (methnum) {
		case 1 -> getSum(ary); 
		case 2 -> getMax(ary); 
		case 3 -> getExc(ary); 
		case 4 -> getRev(ary, array_size);
		default -> System.out.print("잘못된 값을 입력하였습니다.");
		}
		

	}
	
	private static void getSum(int[] ary) {
		int sum = 0;
		for (int i = 0; i < ary.length; i++) {
			sum += ary[i];
		}
		System.out.printf("배열에 저장된 모든 값 더한 값 : %d", sum);
	}
	
	private static void getMax(int[] ary) {
		int Bignum = ary[0];
		for (int i = 1; i < ary.length; i++) {
			if (Bignum < ary[i]) {
				Bignum = ary[i];
			}
		}
		System.out.printf("배열에 저장된 숫자 중 가장 큰 숫자 : %d", Bignum);
		
	}
	
	private static void getExc(int[] ary) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		int count = 0;
		for (int i = 0; i < ary.length; i++) {
			if (num < ary[i]) {
				count += 1;
			}
		}
		System.out.printf("배열에 저장된 숫자 중, 입력된 숫자보다 큰 수의 갯수 : %d", count);
	}
	
	private static void getRev(int[] ary, int array_size) {
		int temp = 0;
		for (int i = 0; i < array_size / 2; i++) {
			temp = ary[i];
			ary[i] = ary[array_size - i - 1];
			ary[array_size - i - 1] = temp;
		}
		
		System.out.println(Arrays.toString(ary));
	}
}
