package package1;

import java.util.Scanner; //java밑에 util밑에 scanner라는 클래스파일 존재, scanner 사용 시 자동으로 import됨

public class Ex01 {
	public static void main(String[] args) {
		/*
		예외처리 : 실행할 때 발생하는 오류를 제거한다.
		오류 : 컴파일시 발생하는 오류 -> 코드오류 : javac에서 오류확인가능
		프로그램 실행시 발생하는 오류 -> 실행오류 : java -> jvm에서 오류 확인 가능
		*/
		
		Scanner sc = new Scanner(System.in);//키보드값을 받아올 수 있는 api
		
		while(true) {
			System.out.println("분자를 숫자로 입력하세요.");
			String Data1 = sc.nextLine();
			
			System.out.println("분모를 숫자로 입력하세요.");
			String Data2 = sc.nextLine();
			
			int num1 = Integer.parseInt(Data1);
			int num2 = Integer.parseInt(Data2);
			try {
				//오류 발생시 실행되지 않음. => 실행오류
				System.out.println(num1 / num2);
			} catch(ArithmeticException e) {
				System.out.println(0);
				System.out.println("분모는 0이 올수 없습니다");
				e.printStackTrace();//종료가 되지 않은 상태에서 오류메시지 확인
				//실행 오류가 발생할때 실행되는 블럭
			} 
		}
	}
}
