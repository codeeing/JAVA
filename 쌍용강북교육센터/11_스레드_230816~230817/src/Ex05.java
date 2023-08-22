import javax.swing.JOptionPane;

// 230816
class Test extends Thread {

	@Override
	public void run() {
		for(int i=10;i>0;i--) {
			System.out.println(i);
			
			try {
				sleep(1000); // 1초후 실행
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}

public class Ex05 {

	public static void main(String[] args) {
		
		Test t1 = new Test();
		t1.start();
		
		String input = JOptionPane.showInputDialog("아무값이나 입력하세요");
		System.out.println("입력한 값은 "+input+"입니다.");
		

	}

}
