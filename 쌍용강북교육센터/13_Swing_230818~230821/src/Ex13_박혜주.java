// 230821
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Ex13_박혜주 extends JFrame implements ActionListener{
	
	Container contentPane;
	JTable table;
	JScrollPane scrollPane;
	JLabel lbName, lbAge, lbGender;
	JTextField tfName, tfAge, tfGender;
	JButton btAdd, btDel;
	
	Vector<String> col;
	Vector<Vector<String>> row;
	
	public Ex13_박혜주(String title) {
		super(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		compose(); // 화면구성
		setSize(450, 300);
		setVisible(true);
		
	}

	public void compose() {
		
		// Container, 작업영역
		contentPane = getContentPane();
		contentPane.setLayout(null);
		
		// JTable
		col = new Vector<String>();
		col.add("이름");
		col.add("나이");
		col.add("성별");
		table = new JTable(row, col);
		scrollPane = new JScrollPane(table);
		scrollPane.setBounds(0, 0, 435, 225);
		contentPane.add(scrollPane);
		
		// JLabel & JTextField
		lbName = new JLabel("이름");
		lbName.setBounds(10, 232, 35, 20);
		contentPane.add(lbName);
		tfName = new JTextField();
		tfName.setBounds(40, 233, 70, 19);
		contentPane.add(tfName);
		
		lbAge = new JLabel("나이");
		lbAge.setBounds(115, 232, 35, 20);
		contentPane.add(lbAge);
		tfAge = new JTextField();
		tfAge.setBounds(145, 233, 50, 19);
		contentPane.add(tfAge);
		
		lbGender = new JLabel("성별");
		lbGender.setBounds(200, 232, 35, 20);
		contentPane.add(lbGender);
		tfGender = new JTextField();
		tfGender.setBounds(230, 233, 40, 19);
		contentPane.add(tfGender);
		
		// JButton
		btAdd = new JButton("추가");
		btAdd.addActionListener(this);
		btAdd.setBounds(280, 230, 70, 25);
		contentPane.add(btAdd);
		
		btDel = new JButton("삭제");
		btDel.addActionListener(this);
		btDel.setBounds(355, 230, 70, 25);
		contentPane.add(btDel);
		
	}

	public static void main(String[] args) {
		Ex13_박혜주 ex = new Ex13_박혜주("참가자 명단 프로그램");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String[] str = new String[3];
		DefaultTableModel model = (DefaultTableModel)table.getModel();
		if(e.getSource() == btAdd) { // 추가버튼에서 이벤트 발생
			str[0] = tfName.getText();
			str[1] = tfAge.getText();
			str[2] = tfGender.getText();
			model.addRow(str);
			
			tfName.setText("");
			tfAge.setText("");
			tfGender.setText("");
		} else { // 삭제버튼에서 이벤트 발생
			try {
				int row = table.getSelectedRow(); // 선택하지 않을 경우, row 변수에 -1이 저장됨
				model.removeRow(row);	
			} catch(Exception excep) {;}
		}
	}

}
