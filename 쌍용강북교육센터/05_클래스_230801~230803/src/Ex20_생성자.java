// 230803
class Music{
	private String title;
	private String singer;
	private String genre;
	private int price;
	
	// 기본생성자
	Music(){
		title = "아이엠";
		singer = "아이브";
		genre = "댄스";
		price = 10000;
	}
	
	// 오버로디드 생성자
	Music(String title, String singer, String genre, int price){
		this.title = title;
		this.singer = singer;
		this.genre = genre;
		this.price = price;
	}
	
	// setter
	void setTitle(String title) {
		this.title = title;
	}
	void setSinger(String singer) {
		this.singer = singer;
	}
	void setGenre(String genre) {
		this.genre = genre;
	}
	void setPrice(int price) {
		this.price = price;
	}
	
	// getter
	String getTitle() {
		return this.title;
	}
	String getSinger() {
		return this.singer;
	}
	String getGenre() {
		return this.genre;
	}
	int getPrice() {
		return this.price;
	}
	
	// 하나라도 문자열이 있다면, 모두 문자열이 된다
	String display() {
		return title+","+singer+","+genre+","+price;
	}
	void show() {
		System.out.println(title+","+singer+","+genre+","+price);
	}
}

public class Ex20_생성자 {

	public static void main(String[] args) {
		
		Music m1 = new Music(); // 생성자를 통한 초기화
		Music m2 = new Music("슈퍼샤이","뉴진스","댄스",3000); // 생성자를 통한 초기화
		Music m3 = new Music(); // setter 통한 초기화
		
		m3.setTitle("빨간맛");
		m3.setSinger("레드벨벳");
		m3.setGenre("댄스");
		m3.setPrice(7000);
		
		System.out.println(m1.getTitle());
		System.out.println(m1.getSinger());
		System.out.println(m1.getGenre());
		System.out.println(m1.getPrice());
		System.out.println();
		
		System.out.println(m2.getTitle());
		System.out.println(m2.getSinger());
		System.out.println(m2.getGenre());
		System.out.println(m2.getPrice());
		System.out.println();
		
		System.out.println(m3.getTitle());
		System.out.println(m3.getSinger());
		System.out.println(m3.getGenre());
		System.out.println(m3.getPrice());
		System.out.println();
		
		// display 메서드를 이용하여 한번에 출력
		System.out.println("------------------");
		System.out.println(m1.display());
		System.out.println(m2.display());
		System.out.println(m3.display());
		System.out.println("------------------");
		m1.show();
		m2.show();
		m3.show();
		
		System.out.println("==============");
		// Music형 배열 방 3개짜리
		Music[] m = new Music[3];
		m[0] = new Music();
		m[1] = new Music("슈퍼샤이","뉴진스","댄스",3000);
		m[2] = new Music("빨간맛", "레드벨벳", "댄스", 7000);
		
		for(int i=0;i<m.length;++i) {
			m[i].show();
		}
		
	}

}
