import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Ex13_RemoveAction implements ActionListener{
	JTable table;
	public Ex13_RemoveAction(JTable table) {
		this.table = table;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			int row = table.getSelectedRow(); // 선택하지 않을 경우, row 변수에 -1이 저장됨
			DefaultTableModel model = (DefaultTableModel)table.getModel();
			model.removeRow(row);
		} catch(Exception e5) {
			JOptionPane.showMessageDialog(null, "에러", "메시지", JOptionPane.ERROR_MESSAGE);
		}
	}

}
