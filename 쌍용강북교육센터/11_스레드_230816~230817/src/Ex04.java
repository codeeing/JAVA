import javax.swing.JOptionPane;

// 230816
class NotThread{
	public void numberPrint() {
		for(int i=10;i>0;i--) {
			System.out.println(i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class Ex04 {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("아무값이나 입력하세요");
		System.out.println("입력한 값은 "+input+"입니다.");
		NotThread nt = new NotThread();
		nt.numberPrint();
	}

}
