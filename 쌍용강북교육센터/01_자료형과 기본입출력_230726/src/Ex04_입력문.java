// 230726
import java.util.Scanner;

public class Ex04_입력문 {
	public static void main(String[] args) {
//		int a = 10;
//		System.out.println(a);
		
		// 입력
		Scanner sc = new Scanner(System.in);
//		System.out.print("a변수에 들어갈 값을 입력하세요 : ");
//		int a = sc.nextInt();
//		System.out.println("a:" + a);
		
		System.out.print("이름 => ");
		String name = sc.next();
		
		System.out.print("국어 점수 => ");
		int kor = sc.nextInt();
		
		System.out.print("영어 점수 => ");
		int eng = sc.nextInt();
		
		System.out.print("수학 점수 => ");
		int math = sc.nextInt();
		
//		System.out.println("국어점수: " + kor);
//		System.out.println("영어점수: " + eng);
//		System.out.println("수학점수: " + math);
		
		System.out.println("-------------------");
		System.out.println("이름\t국어\t영어\t수학\t");
		System.out.println(name + "\t" + kor + "\t" + eng + "\t" + math);
		System.out.println("-------------------");
		int sum = kor + eng + math;
		System.out.println("합계 : " + sum);
		System.out.println("평균1 : " + sum/3); // 43.3333 => 43(정수/정수=정수)
		// 소수점 아래 2자리 나오게 출력
		System.out.printf("평균2 : %.2f\n",sum/3.0); // 130(4B)/3.0(8B) = 43.33(8B)
		System.out.printf("평균3 : %.2f\n",(double)sum/3); // 130.0(8B)/3(4B) = 43.33(8B)
		System.out.printf("평균4 : %.2f\n",(double)(sum/3));  // 130(4B)/3(4B) = 43(4B) => 43.0
	}
}