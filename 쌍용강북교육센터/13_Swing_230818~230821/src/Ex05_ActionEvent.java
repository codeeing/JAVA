import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Ex05_Sub extends Frame implements ActionListener {

	Button yellow;
	Button red;
	Button blue;

	public Ex05_Sub(String title) {
		super(title);
		
		setLayout(new FlowLayout());
		// 버튼 생성만 함.
		yellow = new Button("노란색");
		red = new Button("빨간색");
		blue = new Button("파란색");

		// 버튼색상 입히기
		yellow.setBackground(Color.YELLOW);
		red.setBackground(Color.RED);
		blue.setBackground(Color.BLUE);
		// 글씨색상 입히기
		yellow.setForeground(Color.MAGENTA);
		blue.setForeground(Color.WHITE);

		// Button => actionEvent 발생 => 이를 듣기위한 actionListener가 필요
		// 버튼에 리스너 붙이기
		yellow.addActionListener(this); // 버튼 누르면, new ActionEvent() 객체 생성, 자동으로 actionPerformed() 호출
		red.addActionListener(this);
		blue.addActionListener(this);
		// this를 쓴 이유:
		
		// 프레임에 버튼 올리기
		add(yellow);
		add(red);
		add(blue);

		addWindowListener(
				new WindowAdapter() {
					public void windowClosing(WindowEvent e) {
						System.exit(0);
					}
				}//.windowClosing(WindowEvent e)가 생략되어 있을것
		);
		setSize(400, 300);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("button click");
		Object obj = e.getSource(); // 이벤트가 발생한 컴포넌트를 리턴
		if (obj == yellow)
			setBackground(Color.yellow);
		else if (obj == red)
			setBackground(Color.red);
		else
			setBackground(Color.blue);
	}
}

public class Ex05_ActionEvent {

	public static void main(String[] args) {
		Ex05_Sub ex = new Ex05_Sub("Ex05 예제");
	}

}
/*
 * Event Source: 이벤트가 발생되는 Component를 말함. Ex) Button, CheckBox, Frame...
 */