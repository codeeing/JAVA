import java.util.Scanner;

// 230731
public class Ex04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] jumsu = new int[3];
		int i, sum = 0;
		
		String[] arr = {"자바:", "JSP:", "Spring:"};
		for(i=0; i<arr.length; ++i) {
			System.out.print(arr[i]+" ");
			jumsu[i] = sc.nextInt();
			sum += jumsu[i];
		}
		System.out.println();
		for(i=0; i<jumsu.length; ++i) {
			System.out.println(arr[i]+jumsu[i]);
		}
		System.out.println("세 과목의 합계:"+sum);
		System.out.println("arr:"+arr); // 주소, 참조값이라고도 한다.
		sc.close();
	}
}
