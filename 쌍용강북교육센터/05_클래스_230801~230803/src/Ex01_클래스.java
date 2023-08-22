// 230801
class Person{
	// 필드 == 변수
	String name; // null, 인스턴스 변수, 객체를 만들면 생성되는 인스턴스 변수.
	int age; // 0, 인스턴스 변수
	double height; // 0.0, 인스턴스 변수
	static String nation; // static을 붙이면, 공통으로 사용하는 변수가 되는 것. static 변수(혹은 클래스 변수)라고 한다.
}
public class Ex01_클래스 {

	public static void main(String[] args) {
//		String name = "웬디";
//		int age = 20;
//		double height = 163.2;
		
		Person.nation = "한국"; // 객체 생성 전임에도 불구하고, 스태틱변수는 생성가능하다.
		System.out.println(Person.nation);
		
		Person p1 = new Person(); // 객체를 만들었다. 인스턴스를 만들었다. (객체랑 인스턴스는 유사하나 다른 용어)
		p1.name = "아이유";
		p1.age = 30;
		p1.height = 172.8;
		Person.nation = "대한민국";
		
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p1.height);
		System.out.println(Person.nation); // static 방식으로 접근하는 것.(클래스로 접근하는 것.)
		
		Person p2 = new Person();
		System.out.println(p2.age);
		System.out.println("p2:"+p2);
		p2.name = "박보검";
		p2.age = 40;
		p2.height=158.3;
		
		System.out.println(p2.name);
		System.out.println(p2.age);
		System.out.println(p2.height);
		System.out.println(Person.nation);
		
	}

}

/*
클래스란 무엇인가? 사용자 정의 자료형. 각종 자료형들을 캡슐화한것.
메모리 확보는 언제하나? Person 영역을 가리키는 참조변수를 선언 및 new 명령어를 사용하여 초기화할때. 이게 인스턴스
Person p2 = new Person(); => 그림으로 그릴 수 있나? yes
인스턴스 변수? 
static 변수? 공통으로 사용하는 변수..? 클래스 이름으로 접근한다. 왤까?
생성시점? 메모리 확보와 생성시점이랑 다른건가
어떻게 접근할 수 있나? . 을 이용해서 접근
*/
