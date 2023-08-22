import java.io.File;

// 230817
public class Ex01_파일생성 {

	public static void main(String[] args) {
		File f1 = new File("c:\\sun\\abc.txt"); // File(String pathname)
		 // 역슬래시 쓸거면 2개 쓰고, 슬래시 쓸거면 1개 쓴다.
		File f2 = new File("c:/sun","abc.txt"); // File(String parent, String child)

		// File.separator: 현재 운영체제에 맞는 폴더 구분자를 써준다.
		File f3 = new File("c:"+File.separator+"sun"+File.separator+"abc.txt");
		
		File dir = new File("c:\\sun"); // 확장자가 있으면 파일, 없으면 폴더
		File f4 = new File(dir, "abc.text"); // File(File parent, String child)
		
		System.out.println(f1.length()); // hello(5글자) + \n(2글자)
		System.out.println(f2.length());
		System.out.println(f3.length());
		System.out.println(f4.length());
	}

}
