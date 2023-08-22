// 230817
package Video;

import java.util.Vector;

public class VideoShop {
	
	private Vector<String> v = new Vector<String>();
	
	public VideoShop() {
		v.addElement("범죄도시"); // 0
		v.addElement("밀수"); // 1
		v.addElement("스파이더맨"); // 2
	}
	
	public synchronized String lendVideo() throws InterruptedException {
		Thread t = Thread.currentThread();
		if(v.size() == 0) {
			System.out.println(t.getName()+": 번호표 받음");
			wait(); // 계속 기다리는 상태
			System.out.println(t.getName()+": 다음 순서"); // 이게 출력된다면, 누가 흔들어 깨운것.
		}
		String str = v.remove(v.size() - 1); // 빌려주기
		return str;
	}
	
	public synchronized void returnVideo(String video) {
		v.addElement(video);
		notify(); // 기다리는 애가 깨어남
	}
}
