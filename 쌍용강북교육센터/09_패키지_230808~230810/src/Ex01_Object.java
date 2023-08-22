// 230808
// 230809
/*
class Object{
	public String toString() {
		주소 문자열을 리턴하는 기능
	}
	public boolean equals(this s1, Object obj){
		주소가 같으면 true 리턴
	}
}
*/
class Student extends Object{
	private String name;
	private int hakbun;
	
	// cons.
	public Student() {
		super();
	}
	public Student(String name, int hakbun) {
		super();
		this.name = name;
		this.hakbun = hakbun;
	}
	// setter, getter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHakbun() {
		return hakbun;
	}
	public void setHakbun(int hakbun) {
		this.hakbun = hakbun;
	}
	// toString()
	public String toString() {
		return name+","+hakbun;
	}
	// equals()를 오버라이딩하여, 주소비교가 아닌 문자열 비교가 가능해졌다.
	public boolean equals(Object obj) { // 업캐스팅
		// 다운캐스팅을 할 수 있다면,
		if(obj instanceof Student) {
			// 다운캐스팅, String의 equals메소드 호출
			if(this.name.equals(((Student)obj).name)){// == this.name.equals(s.name.toString())
				return true;
			}
			return false;
		}
		// 다운캐스팅을 할 수 없다면,
		return false;
	}
}
public class Ex01_Object {

	public static void main(String[] args) {
//		String s = new String("현빈");
//		String s0 = "현빈";
		Student s1 = new Student(new String("현빈"),2000);
		Student s2 = new Student(new String("현빈"),2000);
		
		System.out.println(s1.getName()+"/"+s1.getHakbun());
		System.out.println(s2.getName()+"/"+s2.getHakbun());
	
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println(s1.getHakbun());
		System.out.println(s2.getHakbun());
		System.out.println(s1.getHakbun() == s2.getHakbun());
		// 주소 비교
		System.out.println(s1.getName() == s2.getName()); // 주소가 다르므로 false
		// 문자열 비교
		System.out.println("result:"+s1.equals(s2)); // 오버라이딩한 equals메소드 호출
	}

}
