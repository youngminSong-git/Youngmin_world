package package02;

import java.util.Scanner;

public class Ex09Test {

	public static void main(String[] args) {
		Ex09 ex =  new Ex09();
		Scanner sc = new Scanner(System.in);
		while(true) {
			try {
				ex.gugu();
			}catch(NumberFormatException e) {
				System.out.println("���ڸ� �Է��� �� �ֽ��ϴ�.");
			}finally {
				System.out.println("�����Ϸ��� exit, ����Ϸ���  �ƹ�Ű��");
				String stop = sc.nextLine();
				if(stop.equals("exit")) {
					System.out.println("���α׷��� �����մϴ�.");
					ex.sc.close();
					break;
				}
			}
		}
	}

}
