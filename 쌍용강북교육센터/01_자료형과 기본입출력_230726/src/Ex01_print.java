// 230726
public class Ex01_print { //파일이름과 클래스이름이 같아야한다.
	public static void main(String[] args) {
		System.out.println("안녕하세요"); // 주석: 맨 뒤에는 꼭 세미콜론을 찍어야한다.
		System.out.println("가"); // ln은 줄바꿈을 하는 역할. print만 쓰면 줄바꿈 안함.
		System.out.println('나'); // 문자
		System.out.println("가"); // ln은 줄바꿈을 하는 역할. print만 쓰면 줄바꿈 안함.
		System.out.println('나');
		System.out.println("123");
		System.out.println(123); // 숫자는 따옴표로 묶어도 되고 안 묶어도 된다.
		System.out.println("안녕하세요");
		System.out.println();
		System.out.println("안녕하세요");
		System.out.println("재미있는" + "자바" + "수업");
		System.out.println(10+20); // 덧셈
		System.out.println("10"+"20"); // 문자열 이어붙히기
		System.out.println(""); // 널스트링
		//System.out.println(''); // error! 작은따옴표 안에는 적어도 한글자가 들어가야함. 공백도 가능.
		
	}
}

//단축키
//주석 : ctrl + /
//복붙 한번에 : ctrl + alt + 아래방향키 (한줄은 아무데나 커서놓기)
//라인 이동 : alt + 방향키
//라인 삭제 : ctrl + d
//실행 : ctrl + f11