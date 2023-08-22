import java.util.Scanner;

// 230803
class Person3{
	String name;
	int age;
	Person3(String name, int age){
		this.name = name;
		this.age = age;
	}
	// getter
	String getName() {
		return this.name;
	}
	int getAge() {
		return this.age;
	}
}
public class Ex22_객체배열 {

	public static void main(String[] args) {
		int i;
		String name;
		int age;
		Scanner sc = new Scanner(System.in);
		//Person3 객체 3개를 관리할 관리자 선언
		Person3[] p = new Person3[3];
		
//		// 입력, 객체생성
//		for(i=0; i<p.length; ++i) {
//			p[i] = new Person3(); // 객체 할당
//			System.out.print("이름: ");
//			p[i].name = sc.next();
//			System.out.print("나이: ");
//			p[i].age = sc.nextInt();
//		} // 내가 짠 코드
		
		// 입력, 객체생성
		for(i=0; i<p.length; ++i) {
			System.out.print("이름: ");
			name = sc.next();
			System.out.print("나이: ");
			age = sc.nextInt();
			p[i] = new Person3(name, age); // 객체 할당
		}
		System.out.println();
//		// 출력
//		for(i=0; i<p.length; ++i) {
//			System.out.println(p[i].name+": "+p[i].age);
//		} // 내가 짠 코드
		
		// 출력
		for(i=0; i<p.length; ++i) {
			System.out.println(p[i].getName()+": "+p[i].getAge());
		}
		
	}

}
