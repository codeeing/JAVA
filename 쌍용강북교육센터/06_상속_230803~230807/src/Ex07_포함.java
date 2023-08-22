// 230804
class Sports2{ // 부모(슈퍼)클래스
	private String name;
	private int inwon;
	Sports2(){
		
	}
	// 생성자
	Sports2(String name, int inwon){
		this.name = name;
		this.inwon = inwon;
	}
//	String getName() {
//		return name;
//	}
//	int getInwon() {
//		return inwon;
//	}
	public String toString() {
		return name+"/"+inwon;
	}
}
class Baseball2 extends Sports2{ // class 자식클래스 extends 부모클래스
	private double ta;
	Sports2 s;
	Baseball2(String name, int inwon, double ta) {
		s = new Sports2(name, inwon);
		this.ta = ta;
	}
//	void display() {
//		System.out.println(s.getName()+"/"+s.getInwon()+"/"+ta);
//	}
	public String toString() {
		return s.toString()+"/"+ta;
	}
}
public class Ex07_포함 {

	public static void main(String[] args) {
		Baseball2 b2 = new Baseball2("야구2",10,0.78);
		System.out.println(b2);
		
	}

}
