//230731
public class Ex10_while {

	public static void main(String[] args) {
		
		int i;
		for(i=1; i<=5; ++i) {
			System.out.println(i);
		}
		System.out.println("for문 밖:" + i);
		
		i = 1; // 초기식
		
		while(i<=5) { // 한번도 실행안하고 싶다면
			System.out.println(i);
			++i;
		}
		System.out.println("while문 밖:"+i);
		
		i = 1;
		do { // 적어도 한번은 실행시키고 싶다면
			System.out.println(i);
			++i;
		}while(i<=5);
		System.out.println("do~while문 밖:"+i);
	}

}
/* while(조건식){
 *    증감식;
 *    반복할문장;
 * }
 * 
 *  초기식;
 *  do{
 *  	증감식;
 *  	반복할문장;
 *  }while(조건식)
 */
 