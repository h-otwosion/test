interface Soundable {
	String sound();
}

class Cat implements Soundable {
	public String sound() { return "具克"; }
}

class Dog implements Soundable {
	public String sound() { return "港港"; }
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
