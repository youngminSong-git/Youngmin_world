package package01;

import java.util.Scanner;

public class Ex06 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ���α׷��� �����մϴ�.");
		while(true) {
			System.out.println("���α׷��� �����Ϸ��� exit�� �����ּ���. ");
			System.out.print("���ڸ� �Է����ּ���. ");
			String data1 = sc.nextLine();
			System.out.print("�и� �Է����ּ���. ");
			String data2 = sc.nextLine();
			
			System.out.print("idx ��ȣ�� �Է��ϼ���. ");
			String data3 = sc.nextLine();
			int idx = Integer.parseInt(data3);
			
			int [] num = new int[2];
			
			try {
				num[0] = Integer.parseInt(data1);
				num[idx] = Integer.parseInt(data2);
				System.out.println(num[0] / num[idx]);
				//System.out.println("�ٽ� �����մϴ�.");
			}catch(ArithmeticException e) {
				System.out.println("�и�� 0�̸� �ȵ˴ϴ�.");
				//System.out.println("�ٽ� �����մϴ�.");
			}catch(NumberFormatException e) {
				System.out.println("���ڸ� �Է��ϼ���.");
				//System.out.println("�ٽ� �����մϴ�.");
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("idx�� 1�̻��̸� �ȵ˴ϴ�.");
				//System.out.println("�ٽ� �����մϴ�.");
			}finally {
				System.out.println("�ٽ� �����մϴ�.");
			}
		}
	}
}
