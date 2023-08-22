// 230816
// 공유자원영역(임계영역)에 동시에 접근하는 일이 발생했을 때,
// 임계영역에 동시에 접근하지 않고 순서대로 접근할 수 있도록 동기화 한다.
// 공유자원이 있는 영역 => 임계영역
class Data1{
	int i; // 공유자원
	
}
class AA extends Thread{
	public void run() {
		for(int i=0;i<100000;++i) {
			Ex08_NotSync.d.i++; // static 변수가 있는 클래스의 이름으로 접근해야만 한다.
		}
		System.out.println("AA:"+Ex08_NotSync.d.i);
	}
}
class BB extends Thread{
	public void run() {
		for(int i=0;i<100000;++i) {
			Ex08_NotSync.d.i++;
		}
		System.out.println("BB:"+Ex08_NotSync.d.i);
	}
}
public class Ex08_NotSync {
	static Data1 d = new Data1(); // 공유자원
	public static void main(String[] args) {
		System.out.println("main 시작");
		AA a = new AA();
		a.start();
		
		BB b = new BB();
		b.start();
		System.out.println("main 끝");
	}

}
