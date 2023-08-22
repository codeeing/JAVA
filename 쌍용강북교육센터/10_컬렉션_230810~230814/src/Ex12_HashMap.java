import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// 230814
class Movie{
	private String title;
	private int age;
	
	// cons.
	public Movie(String title, int age) {
		this.title = title;
		this.age = age;
	}
	// setter, getter
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	// toString()
	public String toString() {
		return title+"/"+age+"세";
	}
}
public class Ex12_HashMap {

	public static void main(String[] args) {
		
		Map<String, Movie> movie = new HashMap<String, Movie>();
		Scanner sc = new Scanner(System.in);
		
		Movie m1 = new Movie("오펜하이머",19);
		Movie m2 = new Movie("밀수",12);
		Movie m3 = new Movie("비공식작전",15);
		
		movie.put("CGV", m1);
		movie.put("롯데시네마", m2);
		movie.put("메가박스", m3);
		System.out.println("movie:"+movie);
		
		System.out.print("영화관 입력 : ");
		String theater = sc.next().toUpperCase();
		
		// 방식1
		if(movie.containsKey(theater)) {
			System.out.println(movie.get(theater));
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}
		// 방식2
		if(movie.get(theater) != null) {
			System.out.println(movie.get(theater));
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}
		
		System.out.print("삭제할 영화관 이름: ");
		theater = sc.next().toUpperCase();
		if(movie.remove(theater) != null) {
			System.out.println("삭제 성공");
		}else {
			System.out.println("삭제 실패");
		}
		System.out.println("movie:"+movie);
	}

}
