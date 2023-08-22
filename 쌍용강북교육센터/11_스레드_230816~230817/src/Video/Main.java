// 230817
package Video;

public class Main {
	static VideoShop vshop = new VideoShop(); // 공유자원
	
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		Person p1 = new Person("사나"); // 빌리려는 사람
		Person p2 = new Person("모모");
		Person p3 = new Person("웬디");
		Person p4 = new Person("정연");
		
		p1.start(); // 메인이랑 동시에 실행, 스레드의 이름은 사나
		p2.start(); // 메인이랑 동시에 실행, 스레드의 이름은 모모
		p3.start(); // 메인이랑 동시에 실행, 스레드의 이름은 웬디
		p4.start(); // 메인이랑 동시에 실행, 스레드의 이름은 정연
		
		System.out.println("프로그램 끝");
	}

}
