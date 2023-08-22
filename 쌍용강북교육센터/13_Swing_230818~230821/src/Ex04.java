import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
// 프레임에 올라가는 모든 요소들을 Component라고 한다.
class Ex04_Sub extends Frame{
	public Ex04_Sub(String title) {
		super(title);
		
		Button east = new Button("동쪽");
		Button west = new Button("서쪽");
		Button south = new Button("남쪽");
		Button north = new Button("북쪽");
		Button center = new Button("중앙");
		
		//setLayout(new BorderLayout()); // 기본이라 굳이 안써도 됨
		//setLayout(new FlowLayout());
		//setLayout(new GridLayout(2,3));
		
		super.add(east,"East");
		this.add("West",west); // 위치를 앞에다 써도 무방.
		add(south,"South");
		add(north,BorderLayout.NORTH);
		add(center,"Center");
		
		setSize(400,300);
		setVisible(true); // 할꺼다하고 마지막에 넣는게 좋다.
	}
}
public class Ex04 {

	public static void main(String[] args) {
		Ex04_Sub ex = new Ex04_Sub("Ex04 예제");
	}

}
