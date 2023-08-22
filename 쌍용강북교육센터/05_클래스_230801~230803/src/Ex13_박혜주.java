// 230802
import java.util.Scanner;

public class Ex13_박혜주 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자a: ");
		int a = sc.nextInt();
		System.out.print("숫자b: ");
		int b = sc.nextInt();
		// 재귀호출로 a의 b승 구하기
		System.out.println("a의 b승: "+ exponent(a,b));
		sc.close();
		}

	static int exponent(int a, int b) {
		if(b==1) return a;
		return a*exponent(a, b-1);
	}
}
