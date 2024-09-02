package practice01;
import java.util.Scanner;

public class NumScanner {

	public static void main(String[] args) {
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("숫자를 입력하세요 : ");
			int num = sc.nextInt();
			String result = num % 2 == 0 ? "짝수" : "홀수";
			System.out.printf("%s 입니다.\n", result);
			System.out.print("계속하시겠습니까? ");
			int bool = sc.nextInt();
			if (bool == 0) {
				break;
			}else if(bool == 1){
				continue;
			}
		}
		
	}

}
