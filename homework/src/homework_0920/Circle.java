package Circle_com02;

import java.util.Scanner;

public class Circle {
	protected final double PI = 3.14;
	protected double radius;
	double area;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		area = PI * radius * radius;
		return area;
	}
	public void setArea() {
		this.area = PI * radius * radius;
	}
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
}

class Circle_com {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("원의 반지름을 입력하세요 : ");
		double radius = sc.nextDouble();
		
		Circle Circle = new Circle(radius);
		double area = Circle.getArea();
		
		System.out.printf("반지름이 %.03f인 원의 넓이는 %.03f입니다.", radius, area);
		sc.close();
		
	}

}
