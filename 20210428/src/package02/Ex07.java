package package02;

import java.util.Scanner;

public class Ex07 {
	Scanner sc = new Scanner(System.in);
	// ���� �� �ѱ��
	public void div() throws ArrayIndexOutOfBoundsException, 
	NumberFormatException, ArithmeticException {
		System.out.println("������ ���α׷��� ����");
		while(true) {
			System.out.println("���α׷��� �����Ϸ��� exit");
			
			System.out.print("���ڰ��� ���ڷ� �Է��Ͻÿ�");
			String data1= sc.nextLine();
			System.out.print("�и��� ���ڷ� �Է��Ͻÿ�.");
			String data2 = sc.nextLine();
			
			System.out.print("idx ���� �Է��Ͻÿ�. : ");
			String data3 = sc.nextLine();
			
			if(data1.equals("exit") || data2.equals("exit") || 
					data3.equals("exit")) {
				System.out.println("���α׷��� �����մϴ�.");
				sc.close();
				break;
			}
			
			int idx = Integer.parseInt(data3);
			
			int [] num = new int[2];
			num[0] = Integer.parseInt(data1);
			num[idx] = Integer.parseInt(data2);
			System.out.println(num[0] / num[idx]);
		}
	}
}
