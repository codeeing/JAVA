// 230726
public class Ex02_복합대입 {
	public static void main(String[] args) {
		
		int a = 10, b = 20, c = 30; // 대입연산자
		String fruit = "apple";
		
		System.out.println("a:" + a);
		a += 3; // 복합대입연산자, a = a + 3;
		System.out.println("a:" + a);
		
		System.out.println("b:" + b);
		b -= 5;
		System.out.println("b:" + b);
		
		System.out.println("c:" + c);
		c *= 4;
		System.out.println("c:" + c);
		
		System.out.println("fruit:" + fruit);
		fruit += "banana";
		System.out.println("fruit:" + fruit);
	}
}
