package package08;

import java.util.Scanner;

public class Ex36Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // System.in : Ű���� ��
		while(true) {
			System.out.print("���ڰ��� �Է��Ͻÿ�. : "); // System.out : ȭ�鿡 ���
			int num1 = sc.nextInt(); // Ű���� ���� �Էµ� ������ ���
			System.out.print("�и��� �Է��Ͻÿ�. : ");
			int num2 = sc.nextInt();
			try {
				System.out.println(num1 / num2); 
			}catch(ArithmeticException e) {
				System.out.println("�и� 0�̸� �ȵ˴ϴ�.");
			}
		}
	}
}