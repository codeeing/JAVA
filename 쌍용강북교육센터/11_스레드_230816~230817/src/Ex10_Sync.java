// 230816
class Data3{
	int i; // 공유자원
	
	// 이 메소드로 동시 접근조차 안된다.
	public synchronized void aa() {
		for(int i=0;i<100000;++i) {
			this.i++; // static 변수가 있는 클래스의 이름으로 접근해야만 한다.
		}
		System.out.println("AA:"+this.i);
	}
	
	public synchronized void bb() {
		for(int i=0;i<100000;++i) {
			this.i++; // this없으면 루프변수 i를 증가시킨다.
		}
		System.out.println("BB:"+this.i);
	}
}
class AA3 extends Thread{
	public void run() {
		Ex10_Sync.d.aa(); // 공유자원 접근
	}
}
class BB3 extends Thread{
	public void run() {
		Ex10_Sync.d.bb(); // 공유자원 접근
	}
}
public class Ex10_Sync {
	static Data3 d = new Data3(); // 공유자원
	public static void main(String[] args) {
		System.out.println("main 시작");
		AA3 a = new AA3();
		a.start();
		
		BB3 b = new BB3();
		b.start();
		System.out.println("main 끝");
	}

}
