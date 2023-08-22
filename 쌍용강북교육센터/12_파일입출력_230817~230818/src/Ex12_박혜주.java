import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class Ex12_박혜주 {

	public static void main(String[] args) throws IOException {
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		BufferedReader in = new BufferedReader(new FileReader("lyrics.txt"));
		String line; // 읽어들인 한 줄을 저장
		String[] parts; // 구분자로 나뉜 단어 저장
		int lineCnt = 0; // 읽어들인 줄의 개수
		int totalCnt = 0; // 전체 단어수
		
		do {
			line = in.readLine();
			if(line == null) break;
			++lineCnt;
			parts = line.split(" |,|'");
			for(String s : parts) {
				if(s.equals("")) continue;
				++totalCnt;
				if(hm.containsKey(s)) // 중복된 키라면
					hm.replace(s, hm.get(s)+1);
				else // 중복되지 않은 키라면
					hm.put(s,1);
			}
		}while(true);

		System.out.println("lineCount: "+lineCnt);
		System.out.println("전체 단어수: "+totalCnt+" / "+"중복제거한 단어수: "+hm.size());
		for(String key : hm.keySet()) {
			System.out.println(key+":"+hm.get(key));
		}
		
		in.close();
	}

}
