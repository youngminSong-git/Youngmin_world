package package3;

public abstract class Ex06 { // �ϼ����� ���� Ŭ����
	int num1; // 0���� �ʱ�ȭ�� �Ǿ� ����
	int num2;
	public abstract void add(); // ���ǰ� ���� ���� �޼��� : �߻� �޼���
	public abstract void sub(); // ���ǰ� ���� ���� �޼��� : �߻� �޼���
	public abstract void mul(); // ���ǰ� ���� ���� �޼��� : �߻� �޼���
	public void div() { // ���ǰ� �� �޼���
		System.out.println(num1 / num2);
	}
}
