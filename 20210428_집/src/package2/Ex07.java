package package2;

import java.util.Scanner;

public class Ex07 {
	Scanner sc = new Scanner(System.in);
	public void div() throws ArrayIndexOutOfBoundsException, NumberFormatException, ArithmeticException {
		//try�� ��� ������, �޼��� ���� throws ��������� �����־ �ȴ�.
		
		System.out.println("������ ���α׷��� ����");
		
		while(true) {
			System.out.println("���α׷� ���� exit");
			
			System.out.println("���ڰ� ���ڷ� �Է�");
			String data1 = sc.nextLine();
			
			System.out.println("�и��� ���ڷ� �Է�");
			String data2 = sc.nextLine();
			
			System.out.println("idx���� �Է��Ͻÿ� : ");
			String data3 = sc.nextLine();
			
			if(data1.equals("exit") || data2.contentEquals("exit") || data3.contentEquals("exit")) {
				System.out.println("���α׷��� ����Ǿ����ϴ�.");
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
