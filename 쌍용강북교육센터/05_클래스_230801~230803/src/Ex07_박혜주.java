// 230801
import java.util.Scanner;

class Test{
	
	Scanner sc = new Scanner(System.in);

	// 1. 단을 입력받아 해당 구구단을 출력하는 메서드 정의
	void gugudan() {
		int i;
		
		System.out.print("단을 입력하시오: ");
		int dan = sc.nextInt();
		System.out.println("<"+dan+"단>");
		for(i=1;i<=9;++i) {
			System.out.println(dan+"*"+i+"="+dan*i);
		}
		System.out.println();
	}
	
	// 2. 문자와 숫자를 입력받아 해당 문자를 숫자만큼 반복 출력하는 메서드 정의.
	void repeat() {
		int i;
		
		System.out.print("문자와 숫자를 입력하시오: ");
		String w = sc.next();
		int r = sc.nextInt();
		System.out.print("출력결과: ");
		for(i=0; i<r; ++i) {
			System.out.print(w);
		}
		System.out.println();
		System.out.println();
	}
	
	// 3. 두 실수를 입력받아 평균을 리턴하는 메서드 정의(리턴해서 출력하기).
	double avg() {
		System.out.print("두 실수를 입력하시오: ");
		double d1 = sc.nextDouble();
		double d2 = sc.nextDouble();
		return (d1+d2)/2;
	}
}
public class Ex07_박혜주 {

	public static void main(String[] args) {
		Test t = new Test();
		t.gugudan();
		t.repeat();
		System.out.println("두 실수의 평균: "+t.avg());
	}

}
