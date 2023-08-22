import java.util.Scanner;

// 230803
class Book3{
	private String title;
	private String author;
	private int price;
	
	 Book3(String title, String author, int price) {
		 this.title = title;
		 this.author = author;
		 this.price = price;
	}
//	// setter
//	void setTitle(String title) {
//		this.title = title;
//	}
//	void setAuthor(String author) {
//		this.author = author;
//	}
//	void setPrice(int price) {
//		this.price = price;
//	}
//	
//	// getter
//	String getTitle() {
//		return this.title;
//	}
//	String getAuthor() {
//		return this.author;
//	}
//	int getPrice() {
//		return this.price;
//	}
	String display() {
		return title+"/"+author+"/"+price;
	}
}
public class Ex23_객체배열 {

	public static void main(String[] args) {
		int i;
		Scanner sc = new Scanner(System.in);
		Book3[] b = new Book3[3]; // 객체참조변수배열
		
		// 제목, 저자, 가격 입력받아 Book3 객체 생성을 3번하고 배열로 관리
		for(i=0; i<b.length; ++i) {
			System.out.print("제목: ");
			String t = sc.next();
			System.out.print("저자: ");
			String a = sc.next();
			System.out.print("가격: ");
			int p = sc.nextInt();
			b[i] = new Book3(t,a,p); // i번방에 Book3 객체 할당
			System.out.println();
		}
		// 출력도 하기
		for(i=0; i<b.length; ++i) {
			System.out.println(b[i].display());
		}
	}

}
// Ctrl + i => 줄맞춤 기능
