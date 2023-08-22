// 230801
public class Ex03_메소드 {

	public static void main(String[] args) { 
		System.out.println("main 메서드 시작");
		
		abcd(); // abcd 메서드 호출
		System.out.println(123);
		
		abcd();
		System.out.println("가나다라");
		
		abcd();
		System.out.println("main 메서드 끝");
	} // main 메서드 정의부
	
	static void abcd() { // abcd 메서드 정의, 괄호안은 비어있을수도 있다.
		System.out.println("*****");
		System.out.println("#####");
		System.out.println("@@@@@");
	}

}
/*
메소드:
특정한 작업을 수행하도록 독립적으로 작성된 작은 프로그램 코드
반복 호출해서 사용할 수 있다.

형식:
리턴타입 메서드이름(타입 변수명, 타입 변수명,...) { // 선언부
	// 메서드 호출시 수행될 코드
}

호출:
메서드이름();

메서드 정의 하는 이유:
반복적으로 어떤 기능을 수행해야할 때 쓰려고
*/