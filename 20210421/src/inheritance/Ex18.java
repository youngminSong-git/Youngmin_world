package inheritance;

public class Ex18 extends Ex17 {
	// �θ� Ŭ������ �����ڸ� �����ϱ� ���� �ڽ� Ŭ������ ������ �߰�
	public Ex18() { 
		super(); // �θ� Ŭ������ default������ ȣ�� Ex17(){}
	}
	public Ex18(int num1) {
		super(num1);// Ex17(int num1){...}
	}
	public Ex18(int num1, int num2) {
		super(num1, num2); //Ex17(int num1, int num2) {...}
	}
	public int mul() {
		return num1 * num2;
	}
	public int div() {
		return num1 / num2;
	}
}
