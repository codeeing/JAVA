import java.util.ArrayList;
import java.util.Scanner;

// 230810
// 230811
public class Ex02_ArrayList {
	public static void main(String[] args) {
		String s = new String("hello");
		System.out.println(s.toString()); // Object의 toString()을 오버라이딩함.
		//s가 관리하는 문자열을 리턴하는 기능으로 오버라이딩
		ArrayList<String> list = new ArrayList<String>();
		System.out.println("size: "+list.size()); // list의 크기를 리턴
		
		list.add("윤아"); // 요소 추가
		list.add("수영");
		list.add("효연");
		list.add("수영");
		list.add(1,"태연"); // 1번방에 태연 요소를 추가
		System.out.println("size: "+list.size());
		String obj = list.get(0);
		System.out.println(obj);
		System.out.println(list.get(1)); // 1번 인덱스에 해당하는 요소를 리턴
		System.out.println(list.toString()); // Object의 toString()을 오버라이딩함.
		//list가 관리하는 리스트의 요소들을 [와 ,을 사용하여 문자열로 리턴하는 기능으로 오버라이딩
		
//		String remove = list.remove(1);
//		System.out.println("remove:"+remove);
		list.remove(1);
		System.out.println(list); 
		list.remove("수영"); // 첫번째 수영만 삭제
		System.out.println("list:"+list); 
		
		ArrayList<String> add = new ArrayList<String>();
		add.add("하니");
		add.add("아이유");
		add.add("수영");
		System.out.println("add:"+add);
		list.addAll(add); // ArrayList와 같은 컬렉션을 매개변수로 받을 수 있다.
		System.out.println("list:"+list);
		
		ArrayList<String> del = new ArrayList<String>();
		del.add("수영");
		del.add("효연");
		System.out.println("del:"+del);
		
		list.removeAll(del); // 모든 수영이가 다 삭제됨
		System.out.println("list:"+list);
		
		int index = list.indexOf("하니"); // 찾는 데이터가 없으면 -1 출력
		System.out.println("index:"+index);
		
		boolean con = list.contains("아이유"); // 찾는 데이터가 있으면 true 출력, 없으면 false 출력
		System.out.println("con:"+con);
		
		list.set(1, "웬디"); // 하니를 웬디로 바꿈
		System.out.println("list:"+list);
		System.out.println("==========================");
		Scanner sc = new Scanner(System.in);
		System.out.print("이름:");
		String name = sc.next();
		
		// indexOf()를 사용하여 검색하는 법
		if(list.indexOf(name) == -1) {
			System.out.println("가입하지 않은 회원입니다.");
		}else {
			System.out.println("가입한 회원입니다.");
		}
		// contains()를 사용하여 검색하는 법
		if(list.contains(name)) {
			System.out.println("가입한 회원입니다.");
		}else {
			System.out.println("가입하지 않은 회원입니다.");			
		}
		boolean flag = false;
		// get()을 사용하여 검색하는 법
		for(int j=0;j<list.size();++j) {
			if(name.equals(list.get(j))) {
				System.out.println("가입한 회원입니다.");
				flag = true;
			}
		}
		if(flag == false)
			System.out.println("가입하지 않은 회원입니다.");
		System.out.println("==========================");
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(10); // 오토박싱
		list2.add(20);
		System.out.println(list2);
		Integer i = list2.get(1);
		System.out.println(i);
		

	}
}

/*
List : 순서가 있다. 중복을 허용한다.

length : 배열의 방의 개수
length() : 문자열의 길이
size: x
size() : 어레이리스트의 요소의 개수
*/