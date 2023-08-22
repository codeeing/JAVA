import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Ex09_sub extends Frame{
	public Ex09_sub() {
		
		addWindowListener(
				new WindowAdapter() {
					public void windowClosing(WindowEvent e) {
						System.out.println("windowClosing");
						System.exit(0);
					}
					public void windowActivated(WindowEvent e) {
						System.out.println("windowActivated");
					}
				}
		);
		setSize(300,300);
		setVisible(true);
	}
}
public class Ex09_WindowAdapter {

	public static void main(String[] args) {
		Ex09_sub ex = new Ex09_sub();
	}

}
