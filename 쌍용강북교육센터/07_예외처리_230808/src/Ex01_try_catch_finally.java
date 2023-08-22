// 230808
class AA{
	String name;
	int age;
}
public class Ex01_try_catch_finally {

	public static void main(String[] args) {
		String name = "hello";
		int age = 0;
		int[] arr = {10,20,30};
		
		AA a = new AA();
		System.out.println(a.name);
		System.out.println(a.age);
		
		System.out.println(name);
		System.out.println(age);
		
		try { // 에러가 발생될 것으로 예상되는 코드
			// 에러마다 이름이 있음
			System.out.println(arr[3]);
			int len = name.length(); // new NullPointerException(), 에러발생시 객체 생성
			System.out.println("len: "+len);	
			
			int b = 3/0; // new ArithmeticException()
		}catch(Exception e) { // 얘가 맨앞에 있으면 다 잡는다
			// Exception e = new ArithmeticException();
			System.out.println("Exception");
		}finally { // 오류가 발생하든 말든 반드시 수행
			System.out.println("finally 영역");
		}
		System.out.println("프로그램 종료");
		
	}

}
// 처음 발생한 에러만 처리한다.
// java.lang.String
// java.lang.System
// java.lang.Math
// java.lang.NullPointerException
// java.lang.ArithmeticException
// java.util.Scanner
// java.util.Date
// ctrl shift O => 필요한 패키지 임포트