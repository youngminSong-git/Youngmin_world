package package2;

import java.util.Scanner;

public class Ex07 {
	Scanner sc = new Scanner(System.in);
	public void div() throws ArrayIndexOutOfBoundsException, NumberFormatException, ArithmeticException {
		//try로 적어도 되지만, 메서드 옆에 throws 오류명들을 적어주어도 된다.
		
		System.out.println("나눗셈 프로그램을 시작");
		
		while(true) {
			System.out.println("프로그램 종료 exit");
			
			System.out.println("분자값 숫자로 입력");
			String data1 = sc.nextLine();
			
			System.out.println("분모값을 숫자로 입력");
			String data2 = sc.nextLine();
			
			System.out.println("idx값을 입력하시오 : ");
			String data3 = sc.nextLine();
			
			if(data1.equals("exit") || data2.contentEquals("exit") || data3.contentEquals("exit")) {
				System.out.println("프로그램이 종료되었습니다.");
				break;
			}
			
			int idx = Integer.parseInt(data3);
			
			int num[] = new int[2];
			num[0] = Integer.parseInt(data1);
			num[idx] = Integer.parseInt(data2);
			System.out.println(num[0] / num[idx]);
		}
	}
}
