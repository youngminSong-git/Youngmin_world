package package1;

public class Ex03Test {

	public static void main(String[] args) {
		Ex03 ex = new Ex03();
		ex.method1(); // Ex02�� ���� ��� ���� �޼���
		ex.method2(); //
		ex.method3(); // Ex03�� �޼���
		ex.field1 = "�θ� �ʵ�"; // Ex02�� ���� ��� �ʵ�
		System.out.println(ex.field1);
		ex.field2 = "�ڽ� �ʵ�";
		System.out.println(ex.field2); // �ڽ��� �ʵ�
		
		Ex02 ex1 = new Ex02();
	}

}
