import java.util.ArrayList;
import java.util.Scanner;

class Music{
	private String title;
	private String singer;
	private int price;
	public Music(String title, String singer, int price) {
		super();
		this.title = title;
		this.singer = singer;
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return title + "/" + singer + "/" + price ;
	}
	
}
public class Ex05_ArrayList {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String title, singer,retry, search_title;
		int price,i;
		ArrayList<Music> list = new ArrayList<Music>();
		
		while(true) {
			System.out.print("제목: ");
			title = sc.next();

			System.out.print("가수: ");
			singer = sc.next();

			System.out.print("가격: ");
			price = sc.nextInt();
			Music m = new Music(title,singer,price);
			list.add(m);
			
			System.out.print("계속?");
			retry = sc.next();
			if(retry.equals("n"))
				break;
		}
		
		System.out.println(list);
		boolean flag = false;
		while(true) {
			flag = false;
			System.out.print("찾는 제목 입력:");
			search_title = sc.next();
			for(i=0;i<list.size();i++) {
				if(list.get(i).getTitle().equals(search_title)) {
					System.out.println(search_title+"의 가수명은 " + list.get(i).getSinger());
					flag = true;
					break;
				}
			}
			
			if(flag == false) {
				System.out.println("찾는 제목이 없습니다.");
			}
			
			System.out.print("계속?");
			retry = sc.next();
			if(retry.equals("n"))
				break;
		}//while
		System.out.println("프로그램을 종료합니다.");
		
	}
}

/*
제목:단발머리
가수:조용필
가격:1000
계속?y
제목:DNA
가수:방탄
가격:2000
계속?n
[단발머리/조용필/1000, DNA/방탄/2000]
찾는 제목 입력:DNA
DNA의 가수명은 방탄
계속?y
찾는 제목 입력:단발머리
단발머리의 가수명은 조용필
계속?y
찾는 제목 입력:가나다
찾는 제목이 없습니다.
계속?n
프로그램을 종료합니다.
 */
