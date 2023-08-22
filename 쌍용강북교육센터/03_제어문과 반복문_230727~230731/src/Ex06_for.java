// 230727
import java.util.Scanner;

public class Ex06_for {

	public static void main(String[] args) {
		int dan, i;
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.print("단을 입력하시오. : ");
		dan = sc.nextInt();
		
		for(i=1; i<=9; ++i) {
			System.out.printf("%d * %d = %d\n",dan,i,dan*i);
		}
		
		System.out.println("--------------------------");
		
		for(ch='A'; ch<='Z'; ++ch) {
			System.out.println(ch);
		}
		sc.close();
	}
}
