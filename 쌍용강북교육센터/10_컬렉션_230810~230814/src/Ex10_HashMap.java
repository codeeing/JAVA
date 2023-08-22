import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

// 230814

public class Ex10_HashMap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, Integer> hm = new HashMap<String, Integer>();
		
		System.out.println("==============size()&put()&get()==============");
		System.out.println(hm.size());
		hm.put("모모", 20);
		hm.put("사나", 30);
		hm.put(new String("정연"), 20); // 값은 중복 허용.
		hm.put(new String("사나"), 10); // 30이 10살로 덮어쓰임. 따라서 10살로 출력.
		hm.put("미나", 50);
		System.out.println(hm.size()); // 중복된 키값이 존재하므로, 5가 아닌 4가 출력.
		System.out.println("hm:"+hm.toString());
		System.out.println(hm.get(1)); // 1이라는 키는 없으므로, null 출력
		System.out.println(hm.get("정연"));
		System.out.println(hm.get("현아")); // "현아"라는 키는 없으므로, null 출력
		
		System.out.println("==============containsKey()&containsValue()==============");
		System.out.println(hm.containsKey("모모"));
		
		System.out.print("이름 입력: ");
		String name = sc.next();
		
		// 방식1
		if(hm.containsKey(name))
			System.out.println("찾는 이름의 나이는 "+hm.get(name)+"살입니다.");
		else
			System.out.println("찾는 이름이 없습니다.");
		System.out.println("---------------");
		// 방식2
		if(hm.get(name) != null)
			System.out.println("찾는 이름의 나이는 "+hm.get(name)+"살입니다.");
		else
			System.out.println("찾는 이름이 없습니다.");
		
		System.out.println(hm.containsValue(50));
		
		System.out.println("==============keySet()==============");
		Set<String> s = hm.keySet(); // hm의 키값들만 모아서 Set으로 저장
		System.out.println(s);
		
		// 방식1
		for(String key : s) {
			System.out.println(key+":"+hm.get(key));
		}
		System.out.println("---------------");
		// 방식2
		Iterator<String> iter = s.iterator();
		String key;
		while(iter.hasNext()) {
			key = iter.next();
			System.out.println(key+":"+hm.get(key));
		}
		
		System.out.println("==============values()&remove()==============");
		hm.values();
		
		Collection<Integer> col = hm.values();
		System.out.println("col: "+col);
		
		System.out.println(hm.remove("정연")); // 키값 "정연"에 대한 밸류를 리턴, 삭제할 키값 없으면 null 리턴
		System.out.println("hm:"+hm);
		System.out.println("==============isEmpty()&clear()==============");
		System.out.println(hm.isEmpty());
		hm.clear();
		System.out.println("hm:"+hm);
		System.out.println(hm.isEmpty());
	}

}

/*
List<E>: 순서가 있고, 중복 허용
Set<E> 순서가 없고, 중복 허용 안함
Map<K,V>: 순서가 없고, K(키)는 중복 허용 안함, V(값)은 중복 허용, 검색을 가능하게 함.
*/