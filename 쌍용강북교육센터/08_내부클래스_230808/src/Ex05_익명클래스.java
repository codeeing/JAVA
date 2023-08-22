//230808
class AA{
	int x = 2;
	void display() {
		System.out.println(x);
	}
}

class BB extends AA{
	void display() {
		System.out.println(x*x);
	}
}
public class Ex05_익명클래스 {

	public static void main(String[] args) {
		AA a = new AA();
		a.display(); //2
		
		BB b = new BB();
		b.display(); //4
		
		// CC클래스를 만들지 않아도
		// AA클래스의 display()를 오버라이딩 할 수 있다.
		// 익명클래스
		new AA() {
			void display() {
				System.out.println(x*x*x);
			}
		}.display(); //8
		
		a.display(); //2
		
		new BB() {
			void display() {
				System.out.println("안녕");
			}
		}.display(); //안녕
		
		b.display(); //4
	}

}
