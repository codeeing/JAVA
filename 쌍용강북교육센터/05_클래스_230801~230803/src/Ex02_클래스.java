// 230801
class Book{
	String title; // 제목
	int price; // 가격
	String author; // 저자
	static String publisher; // 출판사
}
public class Ex02_클래스 {

	public static void main(String[] args) {
		
		Book.publisher = "땡땡출판사";
		Book b1 = new Book();
		b1.title = "자바";
		b1.price = 2000;
		b1.author = "윤아";
		
		Book b2 = new Book();
		b2.title = "자바2";
		b2.price = 10000;
		b2.author = "아무개";
		
		System.out.println("제목: "+b1.title);
		System.out.println("가격: "+b1.price);
		System.out.println("저자: "+b1.author);
		System.out.println();
		System.out.println("제목: "+b2.title);
		System.out.println("가격: "+b2.price);
		System.out.println("저자: "+b2.author);
		System.out.println();
		System.out.println("출판사 공통: "+Book.publisher);
	}

}

/*
제목:
가격:
저자:

제목:
가격:
저자:

출판사 공통
*/