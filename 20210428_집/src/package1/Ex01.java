package package1;

import java.util.Scanner; //java�ؿ� util�ؿ� scanner��� Ŭ�������� ����, scanner ��� �� �ڵ����� import��

public class Ex01 {
	public static void main(String[] args) {
		/*
		����ó�� : ������ �� �߻��ϴ� ������ �����Ѵ�.
		���� : �����Ͻ� �߻��ϴ� ���� -> �ڵ���� : javac���� ����Ȯ�ΰ���
		���α׷� ����� �߻��ϴ� ���� -> ������� : java -> jvm���� ���� Ȯ�� ����
		*/
		
		Scanner sc = new Scanner(System.in);//Ű���尪�� �޾ƿ� �� �ִ� api
		
		while(true) {
			System.out.println("���ڸ� ���ڷ� �Է��ϼ���.");
			String Data1 = sc.nextLine();
			
			System.out.println("�и� ���ڷ� �Է��ϼ���.");
			String Data2 = sc.nextLine();
			
			int num1 = Integer.parseInt(Data1);
			int num2 = Integer.parseInt(Data2);
			try {
				//���� �߻��� ������� ����. => �������
				System.out.println(num1 / num2);
			} catch(ArithmeticException e) {
				System.out.println(0);
				System.out.println("�и�� 0�� �ü� �����ϴ�");
				e.printStackTrace();//���ᰡ ���� ���� ���¿��� �����޽��� Ȯ��
				//���� ������ �߻��Ҷ� ����Ǵ� ��
			} 
		}
	}
}
