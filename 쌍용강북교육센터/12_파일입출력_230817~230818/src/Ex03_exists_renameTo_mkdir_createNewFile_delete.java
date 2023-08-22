// 230817
import java.io.File;
import java.io.IOException;

public class Ex03_exists_renameTo_mkdir_createNewFile_delete {

	public static void main(String[] args) {
		
		//File f1 = new File("C:\\Java_phj\\12_파일입출력_230817~\\A"); // 9번 라인이랑 같은 문장
		File f1 = new File("A"); // A폴더, 12_파일입출력이 기본 위치
		File f2 = new File("B"); // B폴더
		File f3 = new File("C"); // C폴더
		File f4 = new File(f1,"ab.txt"); // C폴더
		
		System.out.println("============exists()&renameTo()&mkdir()============");
		if(f1.exists()) { // 존재하면
			f1.renameTo(f2);
		}else { // 존재안하면
			f1.mkdir(); // 폴더 생성
			System.out.println("폴더 생성함");
			
			try {
				f4.createNewFile(); // 파일 생성, 반드시 예외처리 해야함
				System.out.println("파일 생성함");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("============delete()============");
		if(f3.exists()) {
			boolean bool = f3.delete();
			// 폴더 아래 파일이 있으면 false리턴, 없으면 잘 삭제되므로 true리턴
			System.out.println("bool:" + bool);
		}
	}

}
