import java.io.File;

// 230817

public class Ex02_isDirectory_isFile_list {

	public static void main(String[] args) {
		
		System.out.println("=========isDirectory()&isFile()=========");
		File win = new File("c:\\windows\\"); // 마지막에 역슬래시 추가해도 괜찮다.
		String result = win.isDirectory() ? "폴더" : "파일" ;
		System.out.println(result);
		result = win.isFile() ? "파일" : "폴더" ;
		System.out.println(result);
		
		
		System.out.println("=========list()=========");
		String[] lists = win.list();
		System.out.println(lists.length);
		for(int i=0;i<lists.length;++i) {
			File kind = new File(win,lists[i]);
			if(kind.isFile()) {
				System.out.println("파일: "+lists[i]);
			}else {
				System.out.println("폴더: "+lists[i]);
			}
		}
	}

}
