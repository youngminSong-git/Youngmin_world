package package1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("프로그램 종료 -> exit");
			System.out.print("분자입력하세요 : ");
			//nextLine > 키보드값을 모두다 문자로,
			//nextInt > 숫자인 문자를 숫자로 받아옴.
			String data1 = sc.nextLine();
			
			System.out.print("분모 입력 하세요 : ");
			String data2 = sc.nextLine();
			
			System.out.print("배열 번호 입력하세요.");
			String data3 = sc.nextLine();
			int idx = Integer.parseInt(data3); 
			
			if(data1.equals("exit") || data2.contentEquals("exit")) {
				System.out.println("프로그램이 종료되었습니다.");
				break;
			}
			
			int num[] = new int[2];
			
			
			try {
				num[0] = Integer.parseInt(data1);
				num[idx] = Integer.parseInt(data2);
				System.out.println(num[0] / num[idx]);
			} catch(NumberFormatException e) {
				System.out.println("숫자만 입력하세요.");
			} catch(ArithmeticException e) {
				System.out.println("분모가 0이면 안됩니다.");
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("배열의 크기가 넘었습니다.");
			} finally { //try나 catch가 실행된 후 무조건 실행되는 블럭
				System.out.println("다시 시작");
			}
		}
	}
}
