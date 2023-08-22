import java.util.Scanner;
//class Scanner{
//	int nextInt() {
//		
//	}
//}
public class Ex13_풀이 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자a: ");
		int su1 = sc.nextInt();
		System.out.print("숫자b: ");
		int su2 = sc.nextInt();
		System.out.println(recursive(su1,su2)); // 호출
	}
	static int recursive(int su1, int su2){
		if (su2==0)
			return 1;
		else
			return su1 * recursive(su1, su2-1);
	}
}
