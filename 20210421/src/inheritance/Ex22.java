package inheritance;

public class Ex22 extends Ex21{
	String subject;
	public Ex22(int num1 , int num2, String subject ) {
		super(num1, num2);
		this.subject = subject;
	}
	public int add() {
		return num1 + num2;
	}
	public int sub() {
		return num1 - num2;
	}
	/// �θ� Ŭ������ �ִ� div()�޼���� ����ϵ� �ڵ�� ����ϰ� ���� �ʴ�.
	// �ڽ� Ŭ�������� �θ� Ŭ������ ���� ��� ���� �޼��带 �����Ѵ�. : ������
	/// �޼��� �������̵�
	public int div() { // �θ� Ŭ������ �ִ� �޼��� �ǹ��Ѵ�.
		if (num2 == 0) {
			return 0;
		}else {
			return num1/ num2;
		}
	}
}
