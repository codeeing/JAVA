// 230816
class Ex1 implements Runnable{ // 동시에 실행시키고 싶다면 Runnable 인터페이스 구현

	// main()과 동시에 실행시키고 싶은 메서드는 run()메서드로 만든다.
	// 정확히는 동시에는 아닌데, 편의상 동시에라고 표현함.
	@Override
	public void run() {
		for(int i=1;i<=50;++i) {
			System.out.print(i+" ");
		}
	}
}

public class Ex01_Runnable구현방식 {

	public static void main(String[] args) {
		// 실행중인 프로그램 하나하나를 프로세스라고 함.
		// 프로세스를 구성하는 작은 작업단위 하나하나를 스레드라고 함.
		// 스레드는 한번에 하나씩만 실행됨. 메소드가 스레드의 일종이라고 볼 수 있음.
		// 메서드는 한번에 하나만 실행됨.
		// 동시에 2개의 메서드가 실행되면 두개의 스레드가 동작한다. 멀티스레드라고 함.
		// 실제 동시에 돌아가는 것은 아니며, 할당받은 cpu시간이 매우 작기 때문에
		// 동시에 실행하는 것 처럼 보인다.
		
		// 멀티스레드로 동작! ! !
		Ex1 e = new Ex1();
		Thread t1 = new Thread(e); // Thread(Runnable target)
		
		System.out.println("프로그램 시작"); // 1
		t1.start(); // JVM에 의해서 run 메서드가 호출된다..! // 3
		// t1.run(); 그냥 일반 메서드랑 같다.
		System.out.println("프로그램 끝"); // 2
	}

}
