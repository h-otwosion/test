package Circle_com02;

import java.util.Scanner;

class Circle {
	final double PI = 3.14;
	double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	double getCircle() {
		return PI * radius * radius;
	}
	
	double getRadius() {
		return radius;
	}
	
	
}

public class Circle_com {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("원의 반지름을 입력하세요 : ");
		double radius = sc.nextDouble();
		
		Circle Circle = new Circle(radius);
		double area = Circle.getCircle();
		
		System.out.printf("반지름이 %.03f인 원의 넓이는 %.03f입니다.", radius, area);
		sc.close();
		
	}

}
