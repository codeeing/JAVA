// 230821
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

class Ex11_sub extends JFrame{
	Container contentPane; // 작업영역을 Container라고 함.
	JPanel radioPanel;
	
	String[] text = {"사과", "배", "체리"};
	// ImageIcon은 Icon의 자식
	ImageIcon[] image = {
						new ImageIcon("images/apple.jpg"),
						new ImageIcon("images/pear.jpg"),
						new ImageIcon("images/cherry.jpg")
						};
	JLabel imageLabel = new JLabel();
	JRadioButton[] radio = new JRadioButton[3];
	
	public Ex11_sub(){
		setTitle("라디오 버튼 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 창닫기하면 프로그램 종료까지 함.
		
		contentPane = getContentPane(); // 작업영역에 대한 정보를 가져와서, contentPane에 저장
		//contentPane.setLayout(new BorderLayout()); // default라서 설정 안해도 ok
		
		radioPanel = new JPanel();
		radioPanel.setBackground(Color.gray);
		
		// 작업영역에 radioPanel을 북쪽에, imageLabel을 중앙에 배치하기
		contentPane.add(radioPanel,"North");
		contentPane.add(imageLabel,"Center");
		
		// JRadioButton, 버튼 다 만들고 JPanel에 올리는 작업
		Font font = new Font("궁서",Font.BOLD,30);
		
		ButtonGroup group = new ButtonGroup(); // 과일버튼들을 묶는 group 변수
		for(int i=0;i<radio.length;++i) {
			radio[i] = new JRadioButton(text[i]); // radio[0] 참조변수는 사과버튼을 참조
			radio[i].setFont(font); // 폰트설정
			
			// 버튼 만들거 다 만든 후, group변수에 추가
			group.add(radio[i]); // 이렇게 하지 않으면 체크가 활성이 안되고, 모두 까만색으로 선택될것.
			radioPanel.add(radio[i]); // 패널에 라디오버튼 올리기
			radio[i].addItemListener(new MyItemEvent()); // 라디오버튼에 ItemListener 붙이기
		}
		imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
		setSize(350,400);
		setVisible(true);
	}
	
	class MyItemEvent implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent e) {
			// 버튼이 선택되면 그제서야 이미지를 올린다
			if(radio[0].isSelected()) {
				imageLabel.setIcon(image[0]); // add()를 사용안함!
			} else if(radio[1].isSelected()) {
				imageLabel.setIcon(image[1]);
			} else {
				imageLabel.setIcon(image[2]);
			}
		}
		
	}
}
public class Ex11_ImageIcon {

	public static void main(String[] args) {
		new Ex11_sub();
	}

}
