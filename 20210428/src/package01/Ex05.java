package package01;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("���α׷��� ���� �Ϸ��� exit");
			System.out.print("���ڸ� �Է����ּ��� : ");
			String data1 = sc.nextLine();
			System.out.print("�и� �Է����ּ��� : ");
			String data2 = sc.nextLine();
			System.out.print("�迭 ��ȣ�� �Է��Ͻÿ�.");
			
			String data3 = sc.nextLine();
			int idx = Integer.parseInt(data3);
			
			if(data1.equals("exit") || data2.equals("exit")) {
				System.out.println("���α׷��� ����Ǿ����ϴ�.");
				break;
			}
			int [] num = new int[2];
			try {
				num[0]  = Integer.parseInt(data1);
				num[idx] = Integer.parseInt(data2);
				System.out.println(num[0] / num[idx]);
			}catch(NumberFormatException e) {
				System.out.println("���ڸ� �Է��� �ּ���.");
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("�迭�� ũ�⸦ �Ѿ����ϴ�.");
			}catch(ArithmeticException e) {
				System.out.println("�и� 0�̸� �ȵ˴ϴ�.");
			}finally { // try�� catch�� ����ǰ� ���� ������ ����Ǵ� ��ɾ�
				System.out.println("�ٽ� �����մϴ�.");
			}
		}
	}
}
