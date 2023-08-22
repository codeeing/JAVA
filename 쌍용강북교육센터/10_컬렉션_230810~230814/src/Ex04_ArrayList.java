import java.util.ArrayList;
import java.util.Iterator;

class Book{
	private String title;
	private String author;
	private int price;
	public Book(String title, String author, int price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String toString() {
		return title+"/"+author+"/"+price;
	}
}
public class Ex04_ArrayList {
	public static void main(String[] args) {
		//		Book 객체 3개를 배열로 만들고
		//		그 배열을 ArrayList에 넣기
		//		ArrayList 안의 모든 요소 출력하기

		Book arr [] = {
						new Book("해리포터", "조엔케이롤링", 8000),
						new Book("겜바바", "정윤강", 10000),
						new Book("화산귀환", "비가", 9000)
				};
		int i;
		ArrayList<Book> list = new ArrayList<Book>();
		for(i=0; i<arr.length; i++) {
			list.add(arr[i]);
		}
		System.out.println(list);
		
		for (Book x : list) {
			System.out.println(x);
		}
		System.out.println();
		for(i=0;i<list.size();i++) {
			Book c = list.get(i);
			System.out.println(c.toString());
		}
		System.out.println();
		
		Iterator<Book> iter = list.iterator();
		while (iter.hasNext()) {
			Book b = iter.next();
			System.out.println(b.getTitle() + ":" + b.getAuthor() + ":" + b.getPrice());
		}
	}
}







