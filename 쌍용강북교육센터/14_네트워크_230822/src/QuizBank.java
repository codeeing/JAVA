// 문제은행. 일종의 서버.
public class QuizBank {
	int waiting = 0; // 문제가 주어지기를 기다리는 상태
	int problem = 1;
	int answer = 2; // 답을 맞춰야하는 상태
	int numProblems = 3; // 문제의 개수
	int curProblems = 0; // 현재 풀어야하는 문제의 번호
	int state = waiting;
	
	private String[] problems = {"네트워크 처리 패키지는?",
								"서버가 사용하는 소켓 클래스는?",
								"인터넷에서 컴퓨터를 식별하는 주소는?"};
	private String[] answers = {"java.net", "ServerSocket", "IP주소"};
	
	public String process(String cinput) { // 클라이언트가 보내오는 문자열(y/n, 정/오답)
		String output = null;
		
		if(state == waiting) {
			output = "퀴즈를 시작합니다.(y/n)";
			state = problem;
		} else if(state == problem) {
			if(cinput.equals("y")) {
				output = problems[curProblems];
				state = answer;
			} else {
				output = "quit";
				state = waiting;
			}
		} else if(state == answer) {
			if(cinput.equals(answers[curProblems])) {
				output = "정답입니다. 계속하시겠습니까?(y/n)";
				state = problem;
			} else {
				output = "오답입니다. 계속하시겠습니까?(y/n)";
				state = problem;
			}
			curProblems = (curProblems+1) % numProblems; // 다음문제 설정. 012번,012번..
		} else {;}
		return output;
	}
	
}
