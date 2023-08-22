// 230801
class Calc{ // 자료형 개념의 class
	static void add(int a, int b) { // static 메서드
		int sum = a+b;
		System.out.println("sum: "+sum);
	}
	void sub(int a, int b) { // 인스턴스 메서드
		int result = a-b;
		System.out.println("result: "+result);
	}
}
public class Ex05_메서드 { // 가장 먼저 실행되는 main메서드를 가지는 실행class

	public static void main(String[] args) {
		Calc c = new Calc(); // Calc 타입 인스턴스 생성
		c.add(10,20);
		Calc.add(50, 20);
		
		c.sub(3, 5);
		//Calc.sub(3, 5);
	}
	
}
