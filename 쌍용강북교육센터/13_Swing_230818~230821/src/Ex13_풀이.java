// 230822
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Ex13_풀이 {

	public static void main(String[] args) {
		
		
		JFrame frame = new JFrame("참가자 명단 프로그램");
		
		Container contentPane = frame.getContentPane();
		String[] colNames = {"이름", "나이", "성별"};
		
		DefaultTableModel model = new DefaultTableModel(colNames, 0); // addRow(), removeRow()
		JTable table = new JTable(model);
		contentPane.add(new JScrollPane(table));
		
		JPanel panel = new JPanel();
		JTextField text1 = new JTextField(6);
		JTextField text2 = new JTextField(3);
		JTextField text3 = new JTextField(3);
		
		JButton btn1 = new JButton("추가");
		JButton btn2 = new JButton("삭제");
		
		panel.add(new JLabel("이름"));
		panel.add(text1);
		panel.add(new JLabel("나이"));
		panel.add(text2);
		panel.add(new JLabel("성별"));
		panel.add(text3);
		panel.add(btn1);
		panel.add(btn2);
		
		contentPane.add(panel,"South");
		btn1.addActionListener(new Ex13_AddAction(table,text1,text2,text3));
		btn2.addActionListener(new Ex13_RemoveAction(table));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,300);
		frame.setVisible(true);
	}

}
