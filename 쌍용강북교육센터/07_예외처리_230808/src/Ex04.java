import java.util.Scanner;

// 230808
public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자1 :");
		int num1 = sc.nextInt();
		System.out.print("숫자1 :");
		int num2 = sc.nextInt();
		
		boolean div = divider(num1, num2);
		if(div)
			System.out.println("연산 성공");
		else
			System.out.println("연산 실패");
		
		System.out.println("프로그램 종료");
	}
	private static boolean divider(int num1, int num2) {
		try {
			int result = num1/num2;
			System.out.println("result: "+result);
			return true;
		}catch(ArithmeticException e) {
			System.out.println(e);
			System.out.println(e.toString());
			System.out.println(e.getMessage());
			return false;
		}finally {
			System.out.println("finally 영역");
		}
	}
}
