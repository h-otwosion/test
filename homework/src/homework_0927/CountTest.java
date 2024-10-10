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
		System.out.printf("%s�� %d���� �ִ�.\n", name, num);
	}
	public void fly() {
		System.out.printf("%d���� %s�� ���ư���.\n", num, name);
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
		System.out.printf("%s�� %d�׷� �ִ�.\n", name, num);
	}
	public void ripen() {
		System.out.printf("%d�׷� %s�� ���Ű� �� �;���.\n", num, name);
	}
}


public class CountTest {
	public static void main(String[] args) {
		 Countable[] objs = { new Bird("���ٱ�", 5), new Bird("������", 2), new Tree("�������", 10), new Tree("�㳪��", 7) };
		 
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
