// 230808
public class Ex02_throws {

	public static void main(String[] args) {
		try {
			sub(); // 던져진 에러가 여기서 발생.
		}catch(ArithmeticException e) {
			System.out.println(e);
			System.out.println("main에서 예외 발생함");
		}
	}
	public static void sub() throws ArithmeticException{ // 호출한 쪽으로 예외를 던진다
		int result = 10/0;
		System.out.println(result);
	}
}
