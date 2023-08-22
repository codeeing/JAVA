// 230802
public class Ex15_오버로딩 {

	public static void main(String[] args) {
		int res = plus(10, 20);
		System.out.println(res);
		
		res = plus(1,2,3);
		System.out.println(res);
		
		
		res = plus(1,2,3);
		System.out.println(res);
		
		float res2 = plus(10.1f,20.3f);
		System.out.println(res2);
		
		System.out.println(1);
		System.out.println(1.2);
		System.out.println(true);
		System.out.println("하니");
		System.out.println('d');
	

	}
	// plus메소드 오버로딩(오버라이딩이 아니다 ! ! !)
	static int plus(int a, int b) {
		return a+b;
	}
	static int plus(int a, int b, int c) {
		return a+b+c;
	}
	static float plus(float x, float y) {
		return x+y;
	}
}

/*
메서드 오버로딩:
매개변수가 서로 달라야한다. 함수명은 같아야한다.
*/