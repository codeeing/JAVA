// 230804
//import java.lang.System;
//import java.lang.String;
// 자바 lang패키지 안에 있는 클래스들은 굳이 임포트 안해도 됨
//import java.util.Date;
//import java.util.Scanner;// ctrl + shift + o
import java.util.*;
public class Ex09 {

	public static void main(String[] args) {
		java.lang.System.out.println(1);
		String s = "가나다";
		
		Scanner sc = new Scanner(System.in);
		int result = Math.max(10,20);
		// Date 클래스는 java.util 패키지와 java.sql 패키지에 각각 들어있다.
		Date today = new Date();
		System.out.println(today);
	}
	

}
// 접근제어자
// public, protected, default, private
// public: 동일패키지 뿐만아니라, 다른 모든 패키지에서 접근 가능
// protected: 동일패키지내에서 접근 가능, 다른 패키지의 자식클래스만이 접근가능
// default: 동일패키지내에서만 접근 가능
// private: 동일패키지의 다른 클래스에서도 접근 불가능. 해당 클래스에서만 접근 가능하다.