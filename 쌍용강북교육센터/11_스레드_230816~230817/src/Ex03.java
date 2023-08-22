// 230816
class Small implements Runnable {

	// a~z출력
	@Override
	public void run() {
		char i;
		for (i = 'a'; i <= 'z'; ++i) {
			System.out.print(i + " ");
			try {
				Thread.sleep(100); // 100 = 0.1초, 동안 잠들어 있어라.
			} catch (InterruptedException e) {
				e.printStackTrace(); // 예외가 발생했을때, 어쩌다 예외가 발생했는지
				// 경로를 역추적함.
			}
		}
//		for (i = 0; i < 26; ++i) {
//			System.out.printf("%c ", 'a' + i);
//		}
		System.out.println();
	}

}

class Big extends Thread {

	// A~Z출력
	@Override
	public void run() {
		char i;
		for (i = 'A'; i <= 'Z'; ++i) {
			System.out.print(i + " ");
			try {
				sleep(500); // 부모의 sleep이니까, Thread 클래스명을 쓰지 않아도 된다.
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
//		for (i = 0; i < 26; ++i) {
//			System.out.printf("%c ", 'A' + i);
//		}
		System.out.println();
	}
}

public class Ex03 {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");

		Small s = new Small();
		Thread t1 = new Thread(s);

		Big b = new Big();
		t1.start();
		b.start();
		System.out.println("프로그램 끝");
	}

}

// InterruptedException: Runtime Exception은 상속 안 받음. 따라서 반드시 예외처리 해야함.
// Runtime Exception을 상속 받는 예외들은, 예외처리가 필수적이진 않음.