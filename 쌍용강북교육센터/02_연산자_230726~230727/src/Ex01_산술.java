// 230726
import java.util.Scanner;

public class Ex01_산술 {
	public static void main(String[] args) {
		int num1, num2;
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 1 입력 : ");
		num1 = sc.nextInt();
		System.out.print("숫자 2 입력 : ");
		num2 = sc.nextInt();
		
		System.out.println();
		System.out.printf("%d + %d = %d\n",num1,num2,num1+num2);
		System.out.printf("%d - %d = %d\n",num1,num2,num1-num2);
		System.out.printf("%d * %d = %d\n",num1,num2,num1*num2);
		System.out.printf("%d / %d = %d\n",num1,num2,num1/num2);
		System.out.printf("%d / %d = %.2f\n",num1,num2,(double)num1/num2);
		System.out.printf("%d %% %d = %d\n",num1,num2,num1%num2);
		
		
	}
}