// 230818
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Ex10_sub extends Frame{
	public Ex10_sub() {
		addWindowListener(new MyWindow()); // 이벤트가 발생하면 이벤트를 처리할 객체를 보내줌
		
		setSize(300,300);
		setVisible(true);
	}
	
	class MyWindow extends WindowAdapter{
		public void windowClosing(WindowEvent e) {
			System.out.println("windowClosing");
			System.exit(0);
		}
		public void windowActivated(WindowEvent e) {
			System.out.println("windowActivated");
		}
	}
}
public class Ex10_WindowAdapter {

	public static void main(String[] args) {
		Ex10_sub ex = new Ex10_sub();
	}

}
