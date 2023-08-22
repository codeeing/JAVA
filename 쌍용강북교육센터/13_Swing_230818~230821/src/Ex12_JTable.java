// 230821
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

// JTable: 엑셀화면처럼 만들수 있는 Component
public class Ex12_JTable extends JFrame{

	Container contentPane;
	JScrollPane scrollPane;
	
	String[] colName = {"이름","직업","나이"};
	Object[][] data = {
						{"양세찬","개그맨",30},
						{"김연아","운동선수",40},
						{"송혜교","배우",20},
						{"아이유","가수",50}
					};
	JTable table;
	
	public Ex12_JTable() {
		table = new JTable(data, colName);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		scrollPane = new JScrollPane(table);
		contentPane.add(scrollPane); // 작업영역에 스크롤바를 갖는 패널을 올려라.
	}
	public static void main(String[] args) {
		Ex12_JTable ex = new Ex12_JTable();
		
		ex.setSize(500,200);
		ex.setVisible(true);
	}

}
