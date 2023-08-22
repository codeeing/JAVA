// 230816
class Data2{
	int i; // 공유자원
	
}
class AA2 extends Thread{
	// run()메서드 까지는 동시에 들어올 수 있으나,
	// 싱크로나이즈드 블록처리된 부분은 동시에 실행 불가능하다.
	public void run() {
		for(int i=0;i<100000;++i) {
			// 임계영역의 자원을 한쪽에서 사용하고 있으면
			// 다른쪽에서는 접근 불가능하도록!!
			// 싱크로나이즈드 블록처리라고 한다.
			synchronized (Ex09_Sync.d) { // 공유자원이 있는 영역
				Ex09_Sync.d.i++; // static 변수가 있는 클래스의 이름으로 접근해야만 한다.
			}
		}
		System.out.println("AA:"+Ex09_Sync.d.i);
	}
}
class BB2 extends Thread{
	public void run() {
		for(int i=0;i<100000;++i) {
			
			synchronized (Ex09_Sync.d) { // 공유자원이 있는 영역
				Ex09_Sync.d.i++; // static 변수가 있는 클래스의 이름으로 접근해야만 한다.
			}
		}
		System.out.println("BB:"+Ex09_Sync.d.i);
	}
}
public class Ex09_Sync {

	static Data2 d = new Data2(); // 공유자원
	public static void main(String[] args) {
		System.out.println("main 시작");
		AA2 a = new AA2();
		a.start();
		
		BB2 b = new BB2();
		b.start();
		System.out.println("main 끝");
	}

}
