// 230807
// 인터페이스는 추상메소드만 있어야 함. 객체생성 불가.
// 인터페이스에는 생성자 정의 불가능.
interface Copymachine{
	void copy(); // public abstract을 생략할 수 있다.
	int age = 30; // public static final을 생략할 수 있다.
}
interface Printmachine{
	void print();
}
interface Faxmachine{
	void fax();
}

class Compound implements Copymachine, Printmachine, Faxmachine{ // 다중상속이 가능한 인터페이스.
	public void copy() {
		System.out.println("복사한다.");
	}
	public void print() {
		System.out.println("프린트한다.");
		
	}
	public void fax() {
		System.out.println("팩스보낸다.");	
	}

}
public class Ex16_인터페이스 {

	public static void main(String[] args) {
		Compound c = new Compound();
		c.copy();
		c.print();
		c.fax();
		System.out.println(c.age); // 경고!
		System.out.println(Copymachine.age); // age는 static 변수
		
		Printmachine p = new Compound();
		p.print();
		// p.fax();
		// p.copy();
		
		
	}

}

// 추상클래스 vs 인터페이스
// 추상클래스: 추상메소드를 적어도 한개는 가져야 한다. 추상클래스를 상속받는 자식클래스로 하여금
// 추상클래스의 추상메소드를 오버라이딩하도록 강제할 수 있다. 객체생성이 불가능하다.
// 인터페이스: 모든 메소드는 추상메소드여야 하고, final static 변수를 가져야 한다.
// 다중상속이 가능하며, 역시 객체생성이 불가능하다.