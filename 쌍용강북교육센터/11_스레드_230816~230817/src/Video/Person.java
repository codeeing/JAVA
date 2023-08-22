// 230817
package Video;

public class Person extends Thread{

	public Person(String name) {
		// 부모(Thread)의 생성자에 name을 넘겨주면서,
		// 스레드의 이름이 사나, 모모, 웬디, 정연으로 설정됨.
		super(name);
	}
	// vshop static 참조변수로 접근하는 것이 공유자원에 접근하는 것.
	public void run() { // 얘가 스레드
		try {
			String v = Main.vshop.lendVideo();  // 공유자원 접근
			System.out.println(getName()+":"+v+" 빌린다.");
			System.out.println(getName()+":"+v+" 보는중.");
			
			sleep(3000); // 비디오 보는시간: 3초
			System.out.println(getName()+":"+v+" 반납");
			Main.vshop.returnVideo(v);  // 공유자원 접근
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
