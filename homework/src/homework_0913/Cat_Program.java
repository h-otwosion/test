package project.java;


class Cat {
	String breed;
	String color;
	int age;
	
	public Cat(String breed, String color, int age) {
		this.breed = breed;
		this.color = color;
		this.age = age;
	}
	
	public void CatInfo() {
		System.out.printf("나의 고양이는 %s %s입니다.", color, breed);
	}
	
	public void eat(String time) {
		System.out.printf("%s에 사료를 먹습니다.", time);
	}
	
	public void meow() {
		System.out.println(" 야용~~~~ ");
	}
	
	public void scratch() {
		System.out.println("스크래치를 긁습니다.");
	}
	
	
}

public class Cat_Program {
	public static void main(String[] args) {
		Cat myCat = new Cat("노랑", "코숏", 2);
		myCat.CatInfo();
		myCat.meow();
		myCat.meow();
		myCat.eat("아침");
		myCat.eat("저녘");
		myCat.meow();
	}
}