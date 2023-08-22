// 230821
package JTable성적처리;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JTable;

public class FilePrint implements ActionListener{
	JTable table;
	public FilePrint(JTable table) {
		this.table = table;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		BufferedWriter out = null;
		String colName;
		int i, j;
		try {
			out = new BufferedWriter(new FileWriter("src\\Jtable성적처리\\table.txt"));
			
			int rowCnt = table.getRowCount();
			int columnCnt = table.getColumnCount();
			System.out.println(rowCnt+"/"+columnCnt);
			
			// table의 0행 0열에 있는 값을 가져오는 getValueAt() 메서드
			Object obj = table.getValueAt(0, 0);
			System.out.println(obj);
			for(i=0;i<columnCnt;++i) {
				colName = table.getColumnName(i);
				System.out.print(colName+"\t");
				
				out.write(colName);
				if(i != columnCnt-1)
					out.write("/");
				else
					out.newLine();
			}
			
			for(i=0; i<rowCnt; ++i) {
				for(j=0; j<columnCnt; ++j) {
					out.write((String)table.getValueAt(i, j));
					if(j != columnCnt-1)
						out.write("/");
					else
						out.newLine();
				}
			}
			
		} catch (IOException e1) {
			e1.printStackTrace();
		} finally {
			try {
				out.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}

}
