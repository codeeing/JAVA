// 230726
public class Ex02_정수형_문자형_논리형 {
	public static void main(String[] args) {
		/*
		'A' : 문자
		"hello" : 문자열
		10 : 정수
		1.234 : 실수
		
		정수 자료형 : 
		byte(1byte, -128 ~ 127)
		short(2byte, -3만 ~ 3만)
		int(4byte, -21억 ~ 21억)
		long(8byte, -9백경 ~ 9백경)
		
		문자 자료형 :
		char(2byte, 0 ~ 6만 5천)
		
		논리 자료형 :
		boolean(1bit, true or false)
		*/
		
		int a; // 정수를 넣겠다고 a변수 선언
		int b; // 정수를 넣겠다고 b변수 선언
		// a = 10.4 // 에러!!
		a = 10; // 초기화
		b = 20;
		a = 30; // 다시 덮어쓰기
		int c = 50; // 선언과 동시에 초기화
		
		System.out.println("a:" + a); // a:30
		System.out.println("b:" + b); // b:20
		System.out.println("c:" + c); // c:50
		a = 40;
		System.out.println("a:" + a); // a:40
		
		System.out.println("--------------------");
		
		//long 2x; // 변수이름은 숫자로 시작하면 안됨.
		long x = 10000000000L; // 정수형 상수의 기본형은 int형이기때문에, L(l)을 붙여야함.
		System.out.println("x:" + x);
		
		byte b1 = 10;
		byte b2 = 20;
		// byte b3 = 128; // 범위를 벗어났기에 에러
		System.out.println(b1+b2);
		System.out.println("b1+b2=" + (b1+b2) + "입니다."); 
		// 문자열 뒤에 있는 +는 덧셈의 기능을 못함. 연결의 기능을 가짐.
		// 따라서 소괄호 연산자를 사용해서 연산자 우선순위 고려해야.
		byte b3;
		// b3 = b1 + b2; 
		// error! byte변수끼리 연산 시, 묵시적 형변환(자동 형변환, 작 -> 큰)으로 인해 int형이 되기때문에 
		// byte형 기억공간 b3에 대입하기위해서는 강제형변환(큰 -> 작) 필요.
		b3 = (byte) (b1 + b2);
		System.out.println("b3은" + b3 + "입니다.");
		System.out.println("b3은" + (b1+b2) + "입니다.");
		
		System.out.println("--------------------");
		
		char ch1 = 'A';
		char ch2 = 'B';
		System.out.println("A"+"B");
		System.out.println('A'+'B'); 
		System.out.println(ch1+ch2);
		// int형보다 작은 char형끼리의 연산. 
		// 따라서 int형으로 자동 형변환되어 int형 131이 출력되는 것.
		
		// char ch3 = "A"; // error! 문자열을 char형 변수에 대입 불가.
		String ch3 = "A";
		String ch4 = "B";
		System.out.println(ch3+ch4); // 문자열들의 덧셈연산 -> 그냥 연결.
		/*
		  아스키코드 값
		  A : 65, B : 66, ...
		*/
		
		int i = 65;
		System.out.println("i:" + i); // i:65
		char j = 'A';
		System.out.println("j:" + j); // j:A
		
		int i2 = 'A'; 
		System.out.println("i2:" + i2); // i2:65
		char j2 = 65;
		System.out.println("j2:" + j2); // j2:A
		
		int q = 1000000; // 백만
		int w = 2000000; // 이백만
		long result = (long)q * w; // 2조, 강제 형변환
		// w변수는 long형 q변수와의 연산으로 인해, long형으로 자동 형변환 된다.
		System.out.println("result:" + result);
		
		System.out.println("--------------------");
		
		System.out.println("10 > 5 :" + (10>5));
		System.out.println("10 < 5 :" + (10<5));
		
		boolean result2 = 10>5;
		System.out.println("result2 :" + result2);
	}
}
//단축키
//주석 : ctrl + /
//복붙 한번에 : ctrl + alt + 아래방향키 (한줄은 아무데나 커서놓기)
//라인 이동 : alt + 방향키
//라인 삭제 : ctrl + d
//실행 : ctrl + f11
//syso치고 : ctrl + space + enter