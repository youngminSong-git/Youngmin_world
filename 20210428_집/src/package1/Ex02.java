package package1;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("프로그램을 종료하면 exit 입력");
			
			System.out.println("분자를 숫자로 입력하세요.");
			String data1 = sc.nextLine();
			
			System.out.println("분모를 숫자로 입력하세요.");
			String data2 = sc.nextLine();
			
			System.out.println("숫자를 입력하세요.");
			String data3 = sc.nextLine();
			
			int idx = Integer.parseInt(data3);
			int num[] = new int[2];
			Exception ex = new ArithmeticException();
			ex = new ArrayIndexOutOfBoundsException();
			//num[2] = Integer.parseInt(data3); //parsing
			
			try {
				num[0] = Integer.parseInt(data1); //parsing
				num[idx] = Integer.parseInt(data2); //parsing
				System.out.println(num[0] / num[idx]);
			} catch(ArithmeticException e) {
				System.out.println("분모가 0이면 안됩니다.");
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("배열의 크기는 1이여야 합니다. ");
			} catch(Exception e) {
				e.printStackTrace();
			}
			//Exception -> 오류중 최상위 부모, 가장 밑에 두어야 하는 이유는 자바는 위에서 밑으로 내려오는 구조이기 때문에
			//오류들이 계속 발생할수록 분기처리를 해 주어야 한다.
		}
	}
}
