// 230802
class Count{
	static int a;
	int b; // 인스턴스, 기본적으로 제로초기화가 된다.
	void increment() {
		int c = 0; // 지역변수, 초기화하지 않으면 쓰레기값이 들어감.
		++a; ++b; ++c;
		System.out.println("static a:"+a);
		System.out.println("인스턴스 b:"+b);
		System.out.println("지역변수 c:"+c);
		System.out.println();	
	} // 지역변수 c가 메모리 반납하고 해제
}
public class Ex10_변수 {

	public static void main(String[] args) {
		System.out.println("객체1 생성");
		Count c1 = new Count(); // 객체, 인스턴스
		c1.increment();
		c1.increment();
		
		System.out.println("객체2 생성");
		Count c2 = new Count();
		c2.increment();
		c2.increment();
		
		System.out.println("객체3 생성");
		Count c3 = new Count();
		c3.increment();
		c3.increment();
		
	}

}

/*
클래스변수
인스턴스 변수
지역변수

생성시점/소멸시점?
클래스:
초기화 여부? 클래스변수, 인스턴스 변수는 초기화하지 않아도 0으로 초기화되어있다.
*/