package package1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("���α׷� ���� -> exit");
			System.out.print("�����Է��ϼ��� : ");
			//nextLine > Ű���尪�� ��δ� ���ڷ�,
			//nextInt > ������ ���ڸ� ���ڷ� �޾ƿ�.
			String data1 = sc.nextLine();
			
			System.out.print("�и� �Է� �ϼ��� : ");
			String data2 = sc.nextLine();
			
			System.out.print("�迭 ��ȣ �Է��ϼ���.");
			String data3 = sc.nextLine();
			int idx = Integer.parseInt(data3); 
			
			if(data1.equals("exit") || data2.contentEquals("exit")) {
				System.out.println("���α׷��� ����Ǿ����ϴ�.");
				break;
			}
			
			int num[] = new int[2];
			
			
			try {
				num[0] = Integer.parseInt(data1);
				num[idx] = Integer.parseInt(data2);
				System.out.println(num[0] / num[idx]);
			} catch(NumberFormatException e) {
				System.out.println("���ڸ� �Է��ϼ���.");
			} catch(ArithmeticException e) {
				System.out.println("�и� 0�̸� �ȵ˴ϴ�.");
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("�迭�� ũ�Ⱑ �Ѿ����ϴ�.");
			} finally { //try�� catch�� ����� �� ������ ����Ǵ� ��
				System.out.println("�ٽ� ����");
			}
		}
	}
}
