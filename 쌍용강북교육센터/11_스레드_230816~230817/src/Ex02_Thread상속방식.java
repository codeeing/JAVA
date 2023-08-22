// 230816
class Ex2 extends Thread {
	public void run() {
		for (int i = 1; i <= 50; ++i) {
			System.out.print(i + " ");
		}
	}
}

public class Ex02_Thread상속방식 {

	public static void main(String[] args) {
		// 멀티스레드로 동작! ! !
		Ex2 e = new Ex2();

		System.out.println("프로그램 시작"); // 1
		e.start(); // JVM에 의해서 run 메서드가 호출된다..! // 3
		System.out.println("프로그램 끝"); // 2
	}

}
