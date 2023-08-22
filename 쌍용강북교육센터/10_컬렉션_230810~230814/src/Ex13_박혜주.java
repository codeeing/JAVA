// 230814
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Student{
	private String addr;
	private double height;
	private int kor;
	
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

public class Ex13_박혜주 {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Map<String, Student> dic= new HashMap<String, Student>();
		boolean flag = false;
		
		while(true) {
			if(add(dic)) {
				System.out.println(dic+"\n");
				while(true) {
					if(find(dic)) {
						System.out.println();
						while(true) {
							if(delete(dic)) {
								System.out.println();
								flag = true;
								break;
							}else {
								System.out.println();
								continue;
							}
						}
						if(flag) break;
					}else {
						System.out.println();
						continue;
					}
				}
				if(flag) break;
			}else {
				System.out.println();
				continue;
			}
		}
		System.out.println("프로그램을 종료합니다.");
	}
	// 추가하기
	public static boolean add(Map<String, Student> dic) {
		String name;
		Student stud = new Student();
		
		System.out.print("이름 : ");
		name = sc.next();
		System.out.print("주소 : ");
		stud.setAddr(sc.next());
		System.out.print("키 : ");
		stud.setHeight(sc.nextDouble());
		System.out.print("국어 : ");
		stud.setKor(sc.nextInt());
		dic.put(name, stud);
		
		return keepgoing();
	}
	// 검색하기
	public static boolean find(Map<String, Student> dic) {
		String fName;
		
		System.out.print("찾는 이름 : ");
		fName = sc.next();
		if(dic.containsKey(fName))
			System.out.println(dic.get(fName));
		else
			System.out.println("찾는 이름 없음");
		
		return keepgoing();
	}
	// 삭제하기
	public static boolean delete(Map<String, Student> dic) {
		String dName;
		
		System.out.print("삭제할 이름 : ");
		dName = sc.next();
		if(dic.containsKey(dName)) {
			dic.remove(dName);
			System.out.println(dic);
		}
		else
			System.out.println("찾는 이름 없음");
		
		return keepgoing();
	}
	// 계속?
	public static boolean keepgoing() {
		String ans;
		
		System.out.print("계속? ");
		ans = sc.next();
		if(ans.equals("n")) return true;
		else return false;
	}

}
	
