package package02;

import java.util.Scanner;

public class Ex09Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("프로그램 종료하려면 exit 입력");
			System.out.println("구구단 실행");
			
			System.out.println("시작단 입력");
			String data1 = sc.nextLine();

			System.out.println("끝단 입력");
			String data2 = sc.nextLine();
		
			if(data1.equals("exit") || data2.equals("exit")) { //data1이나 data2에 exit가 입력되었을 경우
				System.out.println("종료");
				sc.close();//이벤트 종료
				//break;  //반복중지
				System.exit(0); //프로그램 종료할때 사용
			}
			
			int StartDan = Integer.parseInt(data1);
			int endDan = Integer.parseInt(data2);
			
			for(int dan = StartDan; dan <= endDan; dan++) {
				for(int gop = 1; gop <= 9; gop++) {
					System.out.println(dan + " * " + gop + " = " + dan * gop);
				}
			}
		}
	}
}
