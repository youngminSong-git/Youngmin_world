package package2;

import java.util.Scanner;

public class Ex10Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Ex10 ex = new Ex10();
		while(true) {
			try {
				ex.gugu();
			}catch(NumberFormatException e) {
				System.out.println("���ڸ� �Է� �� �� �ֽ��ϴ�.");
			}finally {
				System.out.println("�ٽ� �����Ϸ��� �ƹ�Ű��, �����Ϸ���  exit");
				String stop = sc.nextLine();
				if(stop.equals("exit")) {
					System.out.println("���α׷��� ���� �մϴ�.");
					sc.close();
					ex.sc.close();
					break;
				}
			}
		}		
	}
// API : http://docs.oracle.com/javase/8/docs/api/
}
