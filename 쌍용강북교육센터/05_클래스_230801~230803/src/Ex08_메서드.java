import java.util.Scanner;

// 230801
class Student{
	String name;
	int kor,eng,math;
	
	int sum(){
		return kor+eng+math;
	}
}

public class Ex08_메서드 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student s = new Student();
		
		System.out.print("이름1: ");
		s.name = sc.next();
		System.out.print("국어1: ");
		s.kor = sc.nextInt();
		System.out.print("영어1: ");
		s.eng = sc.nextInt();
		System.out.print("수학1: ");
		s.math = sc.nextInt();
		
		int result = s.sum();
		System.out.println("result:" +result);
		System.out.println("result:" +s.sum());
		
		System.out.println("----------------------");
		Student s2 = new Student();
		
		System.out.print("이름2: ");
		s2.name = sc.next();
		System.out.print("국어2: ");
		s2.kor = sc.nextInt();
		System.out.print("영어2: ");
		s2.eng = sc.nextInt();
		System.out.print("수학2: ");
		s2.math = sc.nextInt();
		
		result = s2.sum();
		System.out.println("result:" +result);
		System.out.println("result:" +s2.sum());
	}

}
