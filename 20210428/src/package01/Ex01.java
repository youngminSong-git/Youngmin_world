package package01;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// ����ó�� : ������ �� �߻��ϴ� ������ �����Ѵ�. (�������)
		// ���� : ������ �� �߻��ϴ� ���� : �ڵ���� : javac
		//      ���α׷� ����� �߻��� �� �ִ� ���� : ������� : java : jvm
		Scanner sc = new Scanner(System.in); // Ű���� ���� �޾ƿ��� API
		while(true) {
			System.out.print("���ڸ� ���ڷ� �Է��Ͻÿ�.");
			String data1 = sc.nextLine(); 
			System.out.print("�и� ���ڷ� �Է��Ͻÿ�.");
			String data2 = sc.nextLine();
			int num1 = Integer.parseInt(data1);
			int num2 = Integer.parseInt(data2);
			try {
				// ���� ���� �߻��ÿ��� ������� �ʴ´�.
				System.out.println(num1/num2);
			}catch(ArithmeticException e) {
				// ���� ������ �߻��� �� ����Ǵ� ��
				System.out.println(0);
				System.out.println("�и�� 0�� �� �� �����ϴ�.");
				//e.printStackTrace();				
			}
		}
	}
}