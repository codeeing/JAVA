// 230821
package JTable성적처리;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class RemoveAction implements ActionListener{

	JTable table;
	
	public RemoveAction(JTable table) {
		this.table = table;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		int row = table.getSelectedRow();
		System.out.println(row);
		DefaultTableModel model = (DefaultTableModel)table.getModel(); // TableModel의 자식이 DefaultTableModel
		model.removeRow(row);
	}

}
