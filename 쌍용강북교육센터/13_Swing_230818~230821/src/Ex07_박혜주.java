import java.awt.Choice;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
class Ex07_sub extends Frame implements ItemListener{
	
	String[] 대륙 = {"아시아","유럽","아프리카"};
	String[][] 나라 = {
			{"한국","일본","중국"},
			{"영국","스위스","프랑스"},
			{"이집트","콩고","우간다"}
	};
	Panel P1;
	Label L1, L2;
	Choice C1, C2;
	
	public Ex07_sub(String title) {
		super(title);
		
		// Panel
		P1 = new Panel();
		P1.setBackground(Color.pink);
		
		// Label
		L1 = new Label("대륙과 나라를 선택하세요");
		L2 = new Label("");
		L1.setBackground(Color.cyan);
		L2.setBackground(Color.yellow);
		L2.setAlignment(Label.CENTER);
		
		// Choice
		C1 = new Choice();
		C2 = new Choice();
		C1.addItemListener(this);
		C2.addItemListener(this);
		for(int i=0;i<대륙.length;++i) {
			C1.add(대륙[i]);
		}
		C2.add("          ");
		
		// Window
		addWindowListener(
				new WindowAdapter() {
					public void windowClosing(WindowEvent e) {
						System.exit(0);
					}
				}
			);
		
		// 배치
		P1.add(C1);
		P1.add(C2);
		add(P1,"Center");
		add(L1,"North");
		add(L2,"South");
		
		setSize(400, 200);
		setVisible(true);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		Object obj = e.getSource();
		if(obj == C1) {
			C2.removeAll();
			int i = C1.getSelectedIndex();
			for(int j=0;j<나라[i].length;++j) {
				C2.add(나라[i][j]);
			}
		} else {
			L2.setText("선택한 대륙과 나라는 : "+C1.getSelectedItem()+","+C2.getSelectedItem());
		}
		
	}
}
public class Ex07_박혜주 {

	public static void main(String[] args) {
		Ex07_sub ex7 = new Ex07_sub("초이스 이벤트");
	}

}
