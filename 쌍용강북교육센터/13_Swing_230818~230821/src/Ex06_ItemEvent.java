// 230818
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
// 프레임의 기본 배치방식: BorderLayout
// 패널의 기본 배치방식: FlowLayout
class Ex06_Sub extends Frame implements ItemListener, ActionListener{

	Panel p1,p2;
	Label lb1, lb2;
	Choice ch;
	Button b1;
	String[] flower = {"cosmos", "rose", "lily", "daisy", "marigold"};
	
	public Ex06_Sub(String title) {
		super(title);
		// Panel
		p1 = new Panel();
		p2 = new Panel();
		p1.setLayout(new BorderLayout());
		// p2.setLayout(new FlowLayout()); 굳이 안써도 됨. 이게 기본이니까.
		p1.setBackground(Color.green);
		p2.setBackground(Color.pink);
		
		// Label
		lb1 = new Label("꽃을 선택하세요");
		lb2 = new Label("                      ");
		lb2.setBackground(Color.lightGray);
		lb2.setAlignment(Label.CENTER); // 라벨영역의 가운데에 정렬이 되도록.
		
		// Choice
		ch = new Choice();
		for(int i=0; i<flower.length; ++i) {
			ch.add(flower[i]); // 초이스에 꽃 배열 올리기
		}
		// Choice는 ItemEvent가 발생하며, 이를 알기 위해 addItemListner를 부착해야한다.
		ch.addItemListener(this); // 버튼이 눌리면 갑자기 new ItemEvent() 객체가 만들어짐.
		
		// Button
		b1 = new Button("버튼");
		b1.addActionListener(this);
		
		// Panel에 각종 컴포넌트 올리기
		p1.add(lb1,"Center");
		p1.add(ch,"South");
		p2.add(lb2);
		p2.add(b1);
		
		// Frame에 Panel 올리기
		add(p1,"North");
		add(p2,"Center");
		
		// Frame 크기 조정 및 보이게하기
		setSize(400, 300);
		setVisible(true);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		//System.out.println("itemStateChanged");
		System.out.print(ch.getSelectedIndex()+":"); // 선택된 것의 인덱스 리턴
		System.out.println(ch.getSelectedItem()); // 선택된 아이템 이름을 리턴
		lb2.setText(ch.getSelectedItem());
	}

	@Override
	public void actionPerformed(ActionEvent e) { // 버튼이 눌릴때 하고 싶은 일들
		//System.out.println("button click");
		ch.removeAll();
		//ch.remove(3); // 3번 아이템인 daisy 삭제
	}
	
}
public class Ex06_ItemEvent {

	public static void main(String[] args) {
		Ex06_Sub ex = new Ex06_Sub("Ex06 예제");
		
	}

}
