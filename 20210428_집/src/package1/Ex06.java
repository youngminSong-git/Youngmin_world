package package1;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("나눗셈 프로그램 실행");
		while(true) {
			System.out.println("프로그램을 종료하려면 exit를 입력하세요.");
			
			System.out.println("분자를 입력해요. ");
			String data1 = sc.nextLine();
		
			System.out.println("분모를 입력하세요. ");
			String data2 = sc.nextLine();
			
			System.out.println("idx 번호를 입력하세요. ");
			String data3 = sc.nextLine();
			int idx = Integer.parseInt(data3); //parsing, num 배열에서 사용해야 하는데, idx가 정수여야만 사용이가능하기때문에 변수에 파싱해서 받아온다.  
			
			
			if(data1.equals("exit") || data2.contentEquals("exit") || data3.contentEquals("exit")) {
				System.out.println("프로그램이 종료되었습니다.");
				break;
			}
			
			int num[] = new int[2];
			try {
				num[0] = Integer.parseInt(data1);
				num[idx] = Integer.parseInt(data2);	
				System.out.println(num[0] / num[idx]);
			} catch(ArithmeticException e) {
				System.out.println("분모는 0이면 안됩니다.");
			} catch(NumberFormatException e) {
				System.out.println("숫자만 입력하세요");
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("idx는 1이상이면 안됩니다.");
			} finally {
				System.out.println("다시시작");
			}
		}		
	}
}
