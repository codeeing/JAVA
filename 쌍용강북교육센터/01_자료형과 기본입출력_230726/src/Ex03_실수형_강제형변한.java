// 230726
public class Ex03_실수형_강제형변한 {
	public static void main(String[] args) {
		System.out.println("실수형");
		
		/*
		 실수 자료형:
		 float(4byte, -3.4E38 ~ +3.4E38)
		 double(8byte, -1.7E308 ~ +1.7E308)
		*/
		
		float f1, f2, f3;
		f1 = 1.23F; // 실수형 상수의 기본형은 double형임. 따라서 F(f) 접미사를 붙여야.
		f2 = 0.56000F;
		f3 = 1.123456789012345F;
		
		double d1, d2;
		d1 = 1.23;
		d2 = 1.1234567890123456789;
				
		System.out.println("f1:" + f1);
		System.out.println("f2:" + f2);
		System.out.println("f3:" + f3); // f3:1.1234568, 소숫점 아래 7번째까지만 출력
		
		System.out.println("d1:" + d1);
		System.out.println("d2:" + d2); // d2:1.123456789012345, 소숫점 아래 16번째자리까지만 출력
		
		float f4 = 10;
		// int i = 1.2f; // error!
		int i = (int)1.2f; // 강제형변환
		System.out.println("f4:" + f4);
		System.out.println("i:" + i);
		
		int a = 100;
		char b = 'A';
		float c = 72.346f;
		String d = "아이유"; // String은 기본자료형이 아님.
		// 서식문자(%d, %c, %s, ...)
		System.out.println("a = " + a + "입니다"); // a = 100입니다
		System.out.printf("a = %d입니다\n", a); // a = 100입니다
		System.out.printf("a = %5d입니다\n", a); // a =   100입니다
		
		System.out.printf("b = %c입니다\n", b); // b = A입니다
		System.out.printf("b = %3c입니다\n", b); // b =   A입니다
		// System.out.printf("b = %3d입니다\n", b); // error!
		System.out.printf("b = %3d입니다\n", (int)b); // b =  65입니다
		
		System.out.printf("c = %f입니다\n", c); // c = 72.346001입니다
		System.out.printf("c = %.2f입니다\n", c); // c = 72.35입니다
		System.out.printf("c = %7.2f입니다\n", c); // c =   72.35입니다, 7칸 잡고 오른쪽 정렬
		System.out.printf("c = %-7.2f입니다\n", c); // c = 72.35  입니다, 7칸 잡고 왼쪽 정렬
		
		System.out.printf("d = %s입니다\n",d); // d = 아이유입니다
		System.out.printf("d = %10s입니다\n",d); // d =        아이유입니다, 10칸 잡고 오른쪽 정렬
		System.out.printf("d = %-10s입니다\n",d); // d = 아이유       입니다, 10칸 잡고 왼쪽 정렬
	}
}
