package package1;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("���α׷��� �����ϸ� exit �Է�");
			
			System.out.println("���ڸ� ���ڷ� �Է��ϼ���.");
			String data1 = sc.nextLine();
			
			System.out.println("�и� ���ڷ� �Է��ϼ���.");
			String data2 = sc.nextLine();
			
			System.out.println("���ڸ� �Է��ϼ���.");
			String data3 = sc.nextLine();
			
			int idx = Integer.parseInt(data3);
			int num[] = new int[2];
			Exception ex = new ArithmeticException();
			ex = new ArrayIndexOutOfBoundsException();
			//num[2] = Integer.parseInt(data3); //parsing
			
			try {
				num[0] = Integer.parseInt(data1); //parsing
				num[idx] = Integer.parseInt(data2); //parsing
				System.out.println(num[0] / num[idx]);
			} catch(ArithmeticException e) {
				System.out.println("�и� 0�̸� �ȵ˴ϴ�.");
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("�迭�� ũ��� 1�̿��� �մϴ�. ");
			} catch(Exception e) {
				e.printStackTrace();
			}
			//Exception -> ������ �ֻ��� �θ�, ���� �ؿ� �ξ�� �ϴ� ������ �ڹٴ� ������ ������ �������� �����̱� ������
			//�������� ��� �߻��Ҽ��� �б�ó���� �� �־�� �Ѵ�.
		}
	}
}
