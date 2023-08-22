// 230816
// 데몬스레드: 주스레드의 작업을 돕는 보조적인 스레드. ex) 워드의 자동저장 기능

class DaemonTest extends Thread{
	public void run() { // main()과 동시에 돌릴 run 메서드
		while(true) {
			try {
				sleep(3000); // 3초 잠들었다가 깨고.
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if(Ex07_데몬스레드.autoSave) {
				autoSave();
			}
		}// while
	} // run
	
	public void autoSave() {
		System.out.println("작업파일이 자동저장 되었습니다.");
	}
}// DaemonTest
public class Ex07_데몬스레드 {
	
	static boolean autoSave;
	public static void main(String[] args) {
		DaemonTest t = new DaemonTest();
		t.setDaemon(true); // t가 관리하는 DaemonTest객체의 run메소드를 데몬스레드로 설정하겠다.
		t.start();
		
		for(int i=1;i<=20;++i) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
			
			if(i==5)
				autoSave = true;
		}
		System.out.println("프로그램을 종료합니다.");
		// 주스레드인 main()이 끝나면, 
		// 데몬스레드인 run()도 함께 끝나게 된다.
	}

}
