interface Soundable {
	String sound();
}

class Cat implements Soundable {
	public String sound() { return "�߿�"; }
}

class Dog implements Soundable {
	public String sound() { return "�۸�"; }
}


public class SoundableExample {

	public static void main(String[] args) {
		printSound(new Cat());
		printSound(new Dog());
	}
	
	public static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}

}
