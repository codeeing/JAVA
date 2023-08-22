// 230821
package JTable성적처리;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class Main extends JFrame implements ActionListener{
	BufferedReader in;
	Container contentPane;
	String[] caption = {"이름:","국어:","영어:","수학:"}; // 이 캡션을 라벨에 올릴것.
	JTextField[] tf = new JTextField[4]; // 텍스트 필드 각각을 관리하는 관리자
	JButton btnAdd, btnRemove, btnFout, btnExit;
	JTable table;
	JScrollPane scrollPane; // 스크롤바를 갖는 패널
	
	Vector<String> columnNames;
	Vector<Vector<String>> rowData; // 벡터안의 벡터, 중첩 벡터라고 한다.
	int cnt = 1;
	
	public Main(String title) throws IOException {
		super(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		columnNames = new Vector<String>();
		rowData = new Vector<Vector<String>>();
		
		getFile(); // 테이블에 올릴 내용 구성하기
		compose(); // 화면 구성하기
		
		setSize(700,300);
		setVisible(true);
	}
	
	public void getFile() throws IOException {
		in = new BufferedReader(new FileReader("src\\Jtable성적처리\\table.txt"));
		String line;
		while((line = in.readLine()) != null) {
			System.out.println(line);
			makeTable(line);
		}
		in.close();
	}
	public void makeTable(String line) {
		String[] item = line.split("/");
		
		if(cnt++ == 1) {
			for(int i=0;i<item.length;++i) {
				columnNames.add(item[i]);
			}	
		} else {
			Vector<String> one = new Vector<String>();
			for(int i=0;i<item.length;++i) {
				one.add(item[i]);
			}
			rowData.add(one);
		}
	}

	public void compose() {
		
		contentPane = getContentPane();
		contentPane.setLayout(null); // 어떠한 배치관리자도 사용하지 않겠다. 내가 놓고 싶은데로 놓겠다.
		
		// JTable
		table = new JTable(rowData, columnNames);
		scrollPane = new JScrollPane(table);
		scrollPane.setBounds(250, 30, 400, 200);
		contentPane.add(scrollPane);
		
		// JLabel
		for(int i=0; i<caption.length; ++i) {
			JLabel lb = new JLabel();
			lb.setText(caption[i]); // 라벨에 캡션 올리기
			lb.setBounds(10, (i+1)*30, 50, 20); // 앞에 두 개는 라벨이 왼쪽 위 꼭지점의 위치임
			contentPane.add(lb);
			
			tf[i] = new JTextField();
			tf[i].setBounds(70, (i+1)*30, 80, 20);
			contentPane.add(tf[i]);
		}
		
		// JButton
		btnAdd =  new JButton("추가");
		btnAdd.addActionListener(new AddAction(table, tf));
		btnAdd.setBounds(10, 170, 100, 20);
		contentPane.add(btnAdd);
		
		btnRemove = new JButton("삭제");
		btnRemove.addActionListener(new RemoveAction(table));
		btnRemove.setBounds(140, 170, 100, 20);
		contentPane.add(btnRemove);
		
		btnFout = new JButton("파일출력");
		btnFout.addActionListener(new FilePrint(table));
		btnFout.setBounds(10, 200, 100, 20);
		contentPane.add(btnFout);
		
		btnExit = new JButton("종료");
		btnExit.addActionListener(this);
		btnExit.setBounds(140, 200, 100, 20);
		contentPane.add(btnExit);
		
	}
	public static void main(String[] args) throws IOException {
		Main m = new Main("성적처리 프로그램");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}

}
