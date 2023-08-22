// 230801
// break문 => 반복문과 switch case문, if문 안 됨
// continue문 => 반복문 ONLY ! ! !, if문 안 됨
import java.util.Scanner;

public class Ex10_박혜주 {
	public static void main(String[] args) {
		
		int menuNum = 0, stdCnt = 0, sum = 0, temp, i, j;
		boolean flag = false;
		int[] scores = null;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("==================================");
			System.out.println("1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료");
			System.out.println("==================================");
			System.out.print("선택> ");
			menuNum = sc.nextInt(); // 메뉴번호 입력받기
			switch(menuNum) {
				case 1:
					// 학생수 입력받기 및 배열 할당하기
					System.out.print("학생수> ");
					stdCnt = sc.nextInt();
					scores = new int[stdCnt]; break;
					
				case 2:
					if(scores==null) { 
						System.out.println("1학생수, 2점수입력부터 진행하세요."); 
						break;
					}
					// 할당한 배열의 방에 점수 입력받기
					for(i=0; i<scores.length; ++i) {
						System.out.print("scores["+i+"]> ");
						scores[i] = sc.nextInt();
					}
					break;
					
				case 3:
					if(scores==null) { 
						System.out.println("1학생수, 2점수입력부터 진행하세요.");
						break;
					}
					// scores 배열 출력하기
					for(i=0;i<scores.length;++i) {
						System.out.println("scores["+i+"]:"+scores[i]);
					}
					break;
					
				case 4:
					if(scores==null) { 
						System.out.println("1학생수, 2점수입력부터 진행하세요."); 
						break;
					}
					// scores배열 선택정렬
					for(i=0; i<scores.length-1; ++i) {
						for(j=i+1; j<scores.length;++j) {
							if(scores[i]>scores[j]) {
								temp = scores[j];
								scores[j] = scores[i];
								scores[i] = temp;
							}
						}
						sum += scores[i];
					}
					sum += scores[scores.length-1];
					// 결과출력
					System.out.println("최고점수: "+scores[scores.length-1]);
					System.out.println("최하점수: "+scores[0]);
					System.out.println("평균: "+sum/scores.length);
					System.out.println();
					System.out.println();
					System.out.println("정렬한 결과");
					for(int x:scores) {
						System.out.print(x+" ");
					}
					break;
				case 5: 
					System.out.println("프로그램 종료"); 
					flag = true;
					break;
				default:
					System.out.println("1~5만 입력 가능합니다.");
			}
			if(flag==true) break;
			System.out.println();
		}
	}
}
// 1 3 => 가능, stdCnt가 0도 아니고, 따라서 scores 배열도 만들수 있으니까.
// 2 3 => 불가능, stdCnt가 0이라서.
// 3 => 불가능, stdCnt가 0이라서.
// 4
/*
==================================
1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료
==================================
선택>3
1학생수,2점수입력부터 진행하세요.
==================================
1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료
==================================
선택>2
1학생수,2점수입력부터 진행하세요.
==================================
1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료
==================================
선택>1
학생수>3
==================================
1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료
==================================
선택>3
scores[0]:0
scores[1]:0
scores[2]:0
==================================
1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료
==================================
선택>2
scores[0]>76
scores[1]>89
scores[2]>65
==================================
1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료
==================================
선택>3
scores[0]:76
scores[1]:89
scores[2]:65
==================================
1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료
==================================
선택>4
최고점수:89
최하점수:65
평균:76


정렬한 결과
65 76 89 
==================================
1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료
==================================
선택>5
프로그램 종료
*/
