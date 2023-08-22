import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// 230817

public class Ex08_1차문자스트림 {

	public static void main(String[] args) {
		int i;
		// FileWriter와 FileReader는 1차 문자 스트림
		FileWriter fw = null;
		FileReader fr = null;
		
		try {
			fw = new FileWriter("write.txt");
			fw.write("재미있는 자바공부~"); // 오직 쓰기만 가능
			fw.flush(); // finally에서 close하므로 flush()함수를 써줘야함.
			
			fr = new FileReader("write.txt");
			while((i = fr.read()) != -1) {
				System.out.print((char)i);
			}
			
		} catch(IOException e) { // BufferedOutputStream과는 달리 IOException이 발생
			e.printStackTrace();
		} finally{
			try {
				fw.close(); // BufferedOutputStream과는 달리 닫아야지만 write.txt에 내보내짐.
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
