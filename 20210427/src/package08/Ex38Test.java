package package08;

import java.util.Scanner;

public class Ex38Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("���α׷��� ���� �Ͻ÷��� exit");
			
			System.out.print("�и��� �Է��Ͻÿ� : ");
			String data1 = sc.nextLine(); // Ű���� ���� �� ������ ���
			System.out.print("���ڰ��� �Է��Ͻÿ� : ");
			String data2 = sc.nextLine();
			if(data1.equals("exit") || data2.equals("exit")) {
				System.out.println("���α׷��� �����ϰڽ��ϴ�");
				break;
			}
			try {
				int num1 = Integer.parseInt(data1);
				int num2 = Integer.parseInt(data2);
				System.out.println(num2 / num1);
			}catch(NumberFormatException e) {
				System.out.println("���ڷ� �Է����ּ���.");
			}catch(ArithmeticException e) {
				System.out.println("�и��� 0�̸� �ȵ˴ϴ�.");
			}
		}

	}

}
