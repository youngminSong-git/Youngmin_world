package package1;

public class Ex03Test {
	static Ex03 ex; //null���� ������ ����.
	public static void main(String[] args) {
//		ex.num1 = 10;
//		ex.num2 = 20;
//		ex.add();
//����
		//�ذ���
		try {
			ex.num1 = 10;
			ex.num2 = 20;
		} catch(NullPointerException e) {
			ex = new Ex03(); //��ü�� �������� �ʾ��� �� nullPoint��� ��
			ex.num1 = 10;
			ex.num2 = 20;
		}
		
		ex.add();
	}
}
