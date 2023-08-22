// 230801
public class Ex04_메서드 {

	// static 메서드 안에서 다른 메서드를 호출 할 경우, 다른 메서드에 꼭 static 키워드를 붙여야 한다.
	public static void main(String[] args) { 
		System.out.println("main 메서드 시작");
		prn(); // prn 메서드 호출
		
		add(3,4); // add 메서드 호출, 괄호안의 것을 전달인자라고 한다.
		
		double d = sub(10,4.7,1); // sub 메서드 호출
		System.out.println("d: "+d);
		
		int result = max(10,3);
		System.out.println("result: "+result);
		System.out.println("main 메서드 끝");
	}
	
	static int max(int i, int j) {
		if(i>j) return i;
		return j;
	}

	// 반드시 static이 있어야함.
	static double sub(int x, double y, int z) { // 전달인자에 맞는 타입을 매개변수에 선언해야.
		double result = x - y - z;
		//return result; // return 4.3
		return x-y-z; // 이렇게 해도 된다!!
	}

	// 반드시 static이 있어야함.
	static void add(int a, int b) { // int a=3, int b=4, 이때 a와 b를 매개변수라고 한다.
		System.out.println("add 메서드 실행중");
		int c = a+b;
		System.out.println("c: "+c);
	}

	// 반드시 static이 있어야함.
	static void prn() {
		System.out.println("프린트 메서드 실행중");
		// return; 써도 되고 안 써도 되고
	}

}
// 호출하면 정의한 곳으로 간다.
// 리턴이 있을수도 있고 없을수도 있다.