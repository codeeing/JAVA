// 230803
class Member{
	// private 접근지정자가 붙으면 해당 클래스의 생성자나 메소드에서는
	// 얼마든지 접근 가능하다.
	private String id;
	private String passwd;
	
//	Member(){ // 기본생성자(default cons.), 사용자가 어떠한 생성자도 추가하지 않을 경우, 컴파일러가 따로 추가
//		// 기능이 없음.
//	} 
	
	// 생성자(constructor), 클래스명과 같은 이름을 가진 메소드이다.
	Member(){ 
		System.out.println("Member() 생성자");
		id = "kim"; // 객체를 생성할때부터 바로 초기화
		passwd = "1234";
	}
	// 오버로딩 생성자, 생성자 역시 메서드이기에 오버로딩 가능하다.
	Member(String id, String passwd){
		System.out.println("Member(String a, String b) 생성자");
		this.id = id;
		this.passwd = passwd;
	}
	
	// setter
	void setId(String id) {
		this.id = id;
	}
	void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	
	// getter
	String getId() {
		return this.id;
	}
	String getPasswd() {
		return this.passwd;
	}
}

public class Ex19_생성자 {

	public static void main(String[] args) {
		Member m1 = new Member(); // 객체를 만들면 자동으로 생성자 호출! !
		m1.setId("park");
		m1.setPasswd("9876");
		System.out.println(m1.getId());
		System.out.println(m1.getPasswd());
		System.out.println();
		
		Member m2 = new Member(); // 생성자 호출! !
		System.out.println(m2.getId());
		System.out.println(m2.getPasswd());
		System.out.println();
		
		Member m3 = new Member("jung","3333"); // 생성자 호출! !
		m3.setId("choi");
		m3.setPasswd("4567");
		System.out.println(m3.getId());
		System.out.println(m3.getPasswd());
		System.out.println();
		
	}
}
// 생성자란 무엇인가?
// 생성자는 언제 호출되는가? 객체를 만들때.
// 생성자를 정의하지 않아도, 기능이 없는 기본생성자를 컴파일러가 추가한다.
// 생성자는 리턴타입이 없다. void도 쓰면 안 된다.
// 생성자도 오버로딩이 가능하다.
// 오버로디드 생성자를 정의할 경우, 기본생성자를 반드시 정의해줘야만 한다.
// 컴파일러가 만든 기본생성자의 경우, 아무런 생성자를 정의하지 않을 경우에만 만들어진다.