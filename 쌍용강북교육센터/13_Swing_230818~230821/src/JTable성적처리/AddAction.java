// 230821
package JTable성적처리;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class AddAction implements ActionListener{
	JTable table;
	JTextField[] tf = new JTextField[4];
	String[] str = new String[4];
	
	public AddAction(JTable table, JTextField[] tf) {
		this.table = table;
		this.tf = tf;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		for(int i=0;i<tf.length;++i) {
			str[i] = tf[i].getText();
		}
		DefaultTableModel model = (DefaultTableModel)table.getModel();
		model.addRow(str);
		
		for(int i=0; i<tf.length; ++i) {
			tf[i].setText("");
		}
		
	}


}
