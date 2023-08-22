// 230802
class Person2{
	// 필드 == 변수
	// 멤버변수들
	private String name; // null, 인스턴스 변수, 객체를 만들면 생성되는 인스턴스 변수.
	private int age; // 0, 인스턴스 변수
	private double height; // 0.0, 인스턴스 변수
	
	// setter 메소드
	public void setName(String name) { // 매개변수는 지역변수이다.
		this.name = name; // this 레퍼런스. p1의 주소값과 동일할 것으로 추정.
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	// getter 메소드
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	public double getHeight() {
		return this.height;
	}
}
public class Ex16_setter_getter {

	public static void main(String[] args) {
		Person2 p1 = new Person2();
//		p1.name = "윤아"; // private이 붙으면 외부에서 사용 불가.
//		p1.age = 30;
//		p1.height = 162.3;
//		
//		System.out.println(p1.name);
//		System.out.println(p1.age);
//		System.out.println(p1.height);
		p1.setName("윤아");
		p1.setAge(30);
		p1.setHeight(162.3);
		
		System.out.println(p1.getName()); // 이름 출력
		System.out.println(p1.getAge()); // 나이 출력
		System.out.println(p1.getHeight()); // 키 출력
	}

}
// 왜 setter, getter를 사용해야하는 걸까?
// 접근지정자 private로 인해 정보 은폐가 이루어졌기 때문이다.
// 사용자는 클래스의 멤버변수에 직접접근이 불가능하며,
// 인터페이스함수를 통해서만 멤버변수의 수정 및 출력이 가능하다.