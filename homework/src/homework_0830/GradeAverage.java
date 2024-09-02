package practice01;
import java.util.Scanner;

public class GradeAverage {

	public static void main(String[] args) {
		int numStudent = getNumberKeyboard("학생 수 : ");
		int[] scores = getScoresLine(numStudent);
		printSumAverage(scores);
	}
	
	
	private static void printSumAverage(int[] scores) {
		int haab = 0;
		
		for (int i = 0; i < scores.length; i++) {
			haab += scores[i];
		}
		System.out.println(">>합계 : " + haab);
		System.out.println(">>평균 : " + haab / scores.length);
	}
	
	private static int[] getScoresLine(int std) {
		Scanner sc = new Scanner(System.in);
		
		int[] scores = new int[std];
		System.out.printf("%d 명의 성적 : ", std);
		for (int i = 0; i < scores.length; i++) {
			scores[i] = sc.nextInt(); //띄어쓰기 하나당 점수 하나 받기
		}
		return scores;
	}
	
	private static int getNumberKeyboard(String str) {
		System.out.print(str);
		Scanner sc = new Scanner(System.in);
		int numStd = sc.nextInt();
		return numStd;
	}
}
