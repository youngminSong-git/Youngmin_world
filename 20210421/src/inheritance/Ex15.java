package inheritance;

public class Ex15 {
	// private ����� �ȵȴ�.
	int num1; // ��� �ʵ��� ���� �����ڴ� protected�� �ȴ�.
	protected int num2;
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public int add() {
		return num1 + num2;
	}
	int sub() {
		return num1 - num2;
	}
}