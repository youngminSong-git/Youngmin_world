package package1;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ���α׷� ����");
		while(true) {
			System.out.println("���α׷��� �����Ϸ��� exit�� �Է��ϼ���.");
			
			System.out.println("���ڸ� �Է��ؿ�. ");
			String data1 = sc.nextLine();
		
			System.out.println("�и� �Է��ϼ���. ");
			String data2 = sc.nextLine();
			
			System.out.println("idx ��ȣ�� �Է��ϼ���. ");
			String data3 = sc.nextLine();
			int idx = Integer.parseInt(data3); //parsing, num �迭���� ����ؾ� �ϴµ�, idx�� �������߸� ����̰����ϱ⶧���� ������ �Ľ��ؼ� �޾ƿ´�.  
			
			
			if(data1.equals("exit") || data2.contentEquals("exit") || data3.contentEquals("exit")) {
				System.out.println("���α׷��� ����Ǿ����ϴ�.");
				break;
			}
			
			int num[] = new int[2];
			try {
				num[0] = Integer.parseInt(data1);
				num[idx] = Integer.parseInt(data2);	
				System.out.println(num[0] / num[idx]);
			} catch(ArithmeticException e) {
				System.out.println("�и�� 0�̸� �ȵ˴ϴ�.");
			} catch(NumberFormatException e) {
				System.out.println("���ڸ� �Է��ϼ���");
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("idx�� 1�̻��̸� �ȵ˴ϴ�.");
			} finally {
				System.out.println("�ٽý���");
			}
		}		
	}
}
