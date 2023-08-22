import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// 230814

public class Ex08_HashSet {

	public static void main(String[] args) {
		Set<String> hs = new HashSet<String>(); // 다형성
		System.out.println("=======add()&size()&isEmpty()=======");
		System.out.println(hs.size());
		System.out.println(hs.isEmpty());
		hs.add("정연");
		hs.add("나연");
		hs.add("사나");
		hs.add("미나");
		hs.add("나연"); // 중복 허용 안함. 알아서 안 들어감.
		hs.add(new String("나연")); // 역시 안 들어감.
		System.out.println(hs.size()); // 5가 아닌 4가 출력
		// System.out.println(hs.get(1));
		System.out.println(hs.isEmpty());
		System.out.println("hs:"+hs);
		
		System.out.println("=======iterator()=======");
		Iterator<String> iter = hs.iterator();
		while(iter.hasNext())
			System.out.println(iter.next());
		
		for(String s:hs) {
			System.out.println(s);
		}
		
		// Enumeration : set에서는 사용 불가
		System.out.println("=======contains()&remove()=======");
		boolean b = hs.contains("사나");
		System.out.println("b:"+b);
		boolean r = hs.remove("사나");
		System.out.println("r:"+r);
		System.out.println("hs:"+hs);
		System.out.println("=======clear()=======");
		hs.clear();
		System.out.println("hs:"+hs);
		
		Set<Integer> hs2 = new HashSet<Integer>();
		hs2.add(10);
		hs2.add(new Integer(20));
		hs2.add(10);
		System.out.println("hs2:"+hs2);
	}

}

/*
Set:
	순서가 없다. 즉, 위치번호가 없다. 중복 허용 안함.
*/