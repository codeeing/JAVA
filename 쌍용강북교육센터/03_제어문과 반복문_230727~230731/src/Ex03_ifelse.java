// 230727
import java.util.Scanner;

public class Ex03_ifelse {

	public static void main(String[] args) {
		/*
		 * 이름, 국어, 영어, 수학 입력받아
		 * 입력받은 값 출력하고
		 * 합계, 평균(소수 아래 2자리 반올림) 출력
		 */
		String name, hakjum = null;
		int kor, eng, math, sum;
		double avg;
		
		Scanner sc = new Scanner(System.in); // System.in은 키보드를 의미.
		System.out.print("이름 입력=>"); // System.out은 콘솔창을 의미.
		name = sc.next();
		System.out.print("국어 점수=>");
		kor = sc.nextInt();
		System.out.print("영어 점수=>");
		eng = sc.nextInt();
		System.out.print("수학 점수=>");
		math = sc.nextInt();
		sum = kor + eng + math;
		avg = sum / 3.0;
		
		System.out.println("----------------------------");
		System.out.println("이름\t국어\t영어\t수학\t");
		System.out.println("----------------------------");
		System.out.printf("%s\t%d\t%d\t%d\n",name,kor,eng,math);
		System.out.printf("총점: %d\n",sum);
		System.out.printf("평균: %.2f\n",avg);

//		별로 좋지 않은 방식
//		if(avg>=90) hakjum = "A학점";
//		if(avg>=80 && avg<=89) hakjum = "B학점";
//		if(avg>=70 && avg<=79) hakjum = "C학점";
//		if(avg>=60 && avg<=69) hakjum = "D학점";
//		if(avg<60) hakjum = "F학점";
//		System.out.println("학점: "+hakjum);
		if(avg>=90) hakjum = "A학점";
		else if(avg>=80) hakjum = "B학점";
		else if(avg>=70) hakjum = "C학점";
		else if(avg>=60) hakjum = "D학점";
		else hakjum = "F학점";
		System.out.println("학점: "+hakjum);
		
		// 모르겠다!!
		switch((int)avg/10) { // ****
			case 10:
			case 9: hakjum = "A학점"; break;
			case 8: hakjum = "B학점"; break;
			case 7: hakjum = "C학점"; break;
			case 6: hakjum = "D학점"; break;
			default: hakjum = "F학점";
		}
		System.out.println("학점: "+hakjum);
		System.out.println("----------------------------");
		
		sc.close();
	}

}
