// 230801
class Fruit{
	void apple() {
		System.out.println("apple");
	}
	static void banana() {
		System.out.println("banana");
	}
}
public class Ex06_메서드 {

	public static void main(String[] args) {
		Fruit.banana(); // banana 메서드는 static 메서드니까.
		Fruit a = new Fruit();
		a.apple();
		
		//orange();
		
		Ex06_메서드 m = new Ex06_메서드();
		m.orange();
		melon();
		
	}
	
	void orange() {
		System.out.println("orange");
	}
	
	static void melon() {
		System.out.println("melon");
	}
}
