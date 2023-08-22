// 230808

public class Ex03_throw {

	public static void main(String[] args) {
		try {
			call();
			System.out.println("정상처리됨");
		}catch(Exception e) {
			System.out.println("call()에서 예외 발생");
		}
	}
	public static void call() {
		try {
			int i = 3/0;			
		}catch(Exception e) {
			System.out.println("call()에서 에러 발생");
			throw e;
		}
	}
}
