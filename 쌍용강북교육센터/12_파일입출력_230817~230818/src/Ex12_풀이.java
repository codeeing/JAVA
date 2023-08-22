import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

// 230821

public class Ex12_풀이 {

	public static void main(String[] args) throws IOException {
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		BufferedReader br = new BufferedReader(new FileReader("lyrics.txt"));
		String line;
		String[] word;
		int lineCount = 0;
		int wordCount = 0;
		while(true) {
			if((line = br.readLine())!=null) {
				++lineCount;
				word = line.split(" ");
				wordCount += word.length; // word배열의 길이를 계속 더해준다.
				for(int i=0;i<word.length;++i) {
					word[i] = word[i].replace(",", "");
					word[i] = word[i].replace("'", "");
					System.out.println(word[i]);
					
					if(hm.containsKey(word[i])) {
						hm.put(word[i], hm.get(word[i])+1);
					} else {
						hm.put(word[i], 1);
					}
				}
			} else {
				break;
			}
		}
		Set<String> s = hm.keySet();
		System.out.println("lineCount:"+lineCount);
		System.out.println("전체 단어수: "+wordCount+" / "+"중복제거한 단어수: "+s.size());
		
		for(String k : s) {
			System.out.println(k + ":" + hm.get(k));
		}
		
//		Iterator<String> iter = s.iterator();
//		while(iter.hasNext()) {
//			String k = iter.next();
//			System.out.println(k + ":" + hm.get(k));
//		}
		
		br.close();
	}

}
