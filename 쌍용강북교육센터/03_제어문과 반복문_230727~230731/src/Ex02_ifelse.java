// 230727
import java.util.Scanner;

public class Ex02_ifelse {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요.:");
		n = sc.nextInt();
		
		System.out.println("n: "+n);
		if(n>=1 && n<=10) 
			System.out.println("1 ~ 10사이의 수입니다.");
		else if(n>=11 && n<=20)
			System.out.println("11 ~ 20사이의 수입니다.");
		else
			System.out.println("1보다 작거나 20보다 큰 수입니다.");
		System.out.println("if ~ else 공부중");
		
		if(n%5 == 0) {
			System.out.println("5의 배수입니다.");
		}
		if(n%10 == 0) {
			System.out.println("10의 배수입니다.");
		}
		sc.close(); // 더이상 입력 받을 수 없다.
	}

}
