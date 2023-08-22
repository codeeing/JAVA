// 230816
// 우선순위가 높을수록 먼저 실행될 가능성이 높다
class Horizontal extends Thread{
	public void run() { // Thread-0 <= 별칭
		for(int i=1;i<=300;++i) {
			System.out.print("-");
			if(i%50==0) {
				System.out.println();
			}
		}
	}
}
class Vertical implements Runnable{

	@Override
	public void run() { // Thread-1
		for(int i=1;i<=300;++i) {
			System.out.print("|");
			if(i%50==0) {
				System.out.println();
			}
		}
	}
	
}
public class Ex06_우선순위 {
	// main에서 호출하는 메서드들 모두 똑같은 5순위이다.
	public static void main(String[] args) {
		Horizontal h = new Horizontal();
		h.setPriority(2);
		h.start();
		
		Thread t = new Thread(new Vertical());
		t.setPriority(8); // 우선순위가 더 높으므로, 세로가 먼저 호출될 가능성이 높다. 절대적인 건 아님.
		t.start();
		
		System.out.println(h.getPriority());
		System.out.println(t.getPriority());
		System.out.println(h.getName()); // 별칭 출력
		System.out.println(t.getName());
		h.setName("웬디"); // 맘에 안들어서 다른 이름으로 set
		t.setName("윤아");
		System.out.println(h.getName());
		System.out.println(t.getName());
	}

}
