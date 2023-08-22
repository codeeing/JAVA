import java.util.HashMap;
import java.util.Scanner;

// 230816
class Student2{
	private String addr;
	private double height;
	private int kor;
	
	public Student2(String addr, double height, int kor) {
		super();
		this.addr = addr;
		this.height = height;
		this.kor = kor;
	}
	// setter, getter
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	// toString()
	public String toString() {
		return addr+"/"+height+"/"+kor;
	}
	
}
public class Ex13_풀이 {

	public static void main(String[] args) {
		
		HashMap<String, Student2> map = new HashMap<String, Student2>();
		Scanner sc = new Scanner(System.in);
		String name, retry, find;
		double height;
		int kor;
		
		while(true) {
			System.out.print("이름 : ");
			name = sc.next();
			System.out.print("주소 : ");
			String addr = sc.next();
			while(true) {
				try {
					System.out.print("키 : ");
					height = sc.nextDouble(); // new InputMismatchException(), 예외 발생시 예외 객체 생성
					break;
				}catch(Exception e) {
					System.out.println("키는 실수로 입력하시오.");
					sc.next();
					// 굳이 continue를 쓰지 않아도 됨.
				}
			}
			System.out.print("국어 : ");
			kor = sc.nextInt();
			Student2 stud = new Student2(addr, height, kor);
			map.put(name, stud);
			System.out.print("계속?");
			retry = sc.next();
			
			if(retry.equals("n")) break;
		}
		System.out.println(map); // key와 value에 각각 toString이 리턴
		
		while(true) {
			System.out.print("찾는 이름 : ");
			find = sc.next();
			if(map.get(find) == null) {
				System.out.println("찾는 이름 없음");
			}else {
				Student2 v = map.get(find);
				System.err.println(v);
			}
			System.out.print("계속?");
			retry = sc.next();
			
			if(retry.equals("n")) break;
		}
		
		while(true) {
			System.out.print("삭제할 이름: ");
			name = sc.next();
			
			if(map.containsKey(name)) {
				map.remove(name);
				System.out.println(map);
			}else {
				System.out.println("찾는 이름 없음");
				
			}
			System.out.print("계속?");
			retry = sc.next();
			
			if(retry.equals("n")) break;
		}
		System.out.println("프로그램을 종료합니다.");
	}

}		
