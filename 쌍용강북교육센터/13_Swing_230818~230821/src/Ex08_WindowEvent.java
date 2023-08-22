import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

// 230818
class Ex08_sub extends Frame implements WindowListener{
	public Ex08_sub() {
		
		addWindowListener(this);
		setSize(300,300);
		setVisible(true);
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	// 윈도우의 닫기 버튼을 누를때
	public void windowClosing(WindowEvent e) {
		System.out.println("windowClosing");
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	// 윈도우 켜질때
	public void windowActivated(WindowEvent e) {
		System.out.println("windowActivated");
	}

	@Override
	// 윈도우 꺼질때
	public void windowDeactivated(WindowEvent e) {
		System.out.println("windowDeactivated");
	}
}
public class Ex08_WindowEvent {

	public static void main(String[] args) {
		Ex08_sub ex = new Ex08_sub();
	}

}
