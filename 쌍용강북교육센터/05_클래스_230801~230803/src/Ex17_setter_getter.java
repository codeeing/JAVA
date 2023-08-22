// 230802
class Book2{
	private String title; // 제목
	private int price; // 가격
	private String author; // 저자
	
	// setter
	void setTitle(String title) {
		this.title = title;
	}
	void setPrice(int price) {
		this.price = price;
	}
	void setAuthor(String author) {
		this.author = author;
	}
	
	// getter
	String getTitle() {
		return this.title;
	}
	int getPrice() {
		return this.price;
	}
	String getAuthor() {
		return this.author;
	}
}

public class Ex17_setter_getter {

	public static void main(String[] args) {
		Book2 b = new Book2();
		
		b.setTitle("자바");
		b.setPrice(10000);
		b.setAuthor("아무개");
		
		System.out.println(b.getTitle());
		System.out.println(b.getPrice());
		System.out.println(b.getAuthor());
	}

}
