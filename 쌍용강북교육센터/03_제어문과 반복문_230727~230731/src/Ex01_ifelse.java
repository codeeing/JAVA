// 230727
import java.util.Scanner;

public class Ex01_ifelse {

	public static void main(String[] args) {
		int a, b;
		// 숫자 2개 실행할 때 입력받아 a, b변수에 넣기
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 1 :");
		a = sc.nextInt();
		System.out.print("숫자 2 :");
		b = sc.nextInt();
		System.out.println("입력한 숫자 : " + a + "/" + b);
		
		// 실행문이 한 줄일 경우 중괄호 생략가능
		if(a>b)
			System.out.println("a가 b보다 크다");
		
		else if(a<b)
			System.out.println("b가 a보다 크다");
		
		else
			System.out.println("a와 b는 같다");
		
		System.out.println("if 공부중..");
		sc.close();
	}

}
/*
형식
if(조건1) {
	조건1이 참일때 실행
}
else if(조건2) {
	조건1이 거짓이고 조건2가 참일때 실행
}
else {
	조건1도 조건2도 거짓일때 실행
}
*/