import java.util.HashSet;
import java.util.Set;

// 230814
public class Ex09_HashSet {

	public static void main(String[] args) {
		/*
		1~10 정수 난수 5개 반복문으로 발생
		Set에 넣기
		발생한 난수를 출력
		*/
		
		int random;
		Set<Integer> hs = new HashSet<Integer>();
		
		while(true) {
			if(hs.size() < 5) {
				random = (int)(Math.random()*10)+1;
				hs.add(random);
			}else {
				break;
			}
		}
		System.out.println("hs:"+hs);
		
		while(true) {
			int num = (int)(Math.random()*10)+1;
			System.out.println("num="+num);
			hs.add(num);
			if(hs.size() == 5)
				break;
		}
	}

}

/*
LinkedHashSet : 작성한 순서대로 중복안되게 삽입
TreeSet: 알파벳 순으로 중복안되게 삽입
*/