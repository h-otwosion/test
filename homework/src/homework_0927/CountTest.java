interface Countable {
	abstract void count();
}

class Bird implements Countable {
	String name;
	int num;
	
	public Bird(String name, int num) {
		this.name = name;
		this.num = num;
	}
	
	@Override
	public void count() {
		System.out.printf("%s가 %d마리 있다.\n", name, num);
	}
	public void fly() {
		System.out.printf("%d마리 %s가 날아간다.\n", num, name);
	}
}

class Tree implements Countable {
	String name;
	int num;
	
	public Tree(String name, int num) {
		this.name = name;
		this.num = num;
	}
	
	@Override
	public void count() {
		System.out.printf("%s가 %d그루 있다.\n", name, num);
	}
	public void ripen() {
		System.out.printf("%d그루 %s에 열매가 잘 익었다.\n", num, name);
	}
}


public class CountTest {
	public static void main(String[] args) {
		 Countable[] objs = { new Bird("뻐꾸기", 5), new Bird("독수리", 2), new Tree("사과나무", 10), new Tree("밤나무", 7) };
		 
		 for (Countable obj : objs) {
				obj.count();
			}

			
		 for (Countable obj : objs) {
			 if (obj instanceof Bird) {
				 ((Bird)obj).fly();
			 } else if (obj instanceof Tree){
				((Tree)obj).ripen();
			}
		}
	}
	
	
}
