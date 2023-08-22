// 230818
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

// 프레임속 작은 프레임들을 패널이라고 한다.
class ExPanel extends Frame{
	Panel p1, p2, p3;
	Button b1, b2, b3;
	
	public ExPanel(String title) {
		super(title);
		
		setSize(400,300);
		setVisible(true);
		
		// BorderLayout 배치관리자가 기본값이기 때문에, 굳이 호출하지 않아도 됨.
		//setLayout(new BorderLayout()); 
		//setLayout(new FlowLayout()); // 방향없음

		// 패널 생성만 했을뿐, 프레임에 올린건 아님.
		p1 = new Panel();
		p2 = new Panel();
		p3 = new Panel();
		
		// 패널들 색깔입혀서 프레임에 올리기
		p1.setBackground(Color.GREEN);
		p2.setBackground(Color.PINK);
		p3.setBackground(Color.CYAN);
		
		// Borderlayout
		super.add(p1, "North"); // super = frame
		this.add(p2, "Center"); // this여도 상관없음
		add(p3, "South"); // this는 생략가능
		
		// 버튼 생성만 했을뿐, 프레임에 올린건 아님.
		b1 = new Button("버튼1");
		b2 = new Button("버튼2");
		b3 = new Button("버튼3");
		
		// 버튼들 세개의 패널에 올리기
		p1.add(b1);
		p2.add(b2);
		p3.add(b3);
	}
	
}
public class Ex03_패널과버튼 {

	public static void main(String[] args) {
		ExPanel ex = new ExPanel("Panel 예제");
	}

}
