package package1;

public class Ex02 extends Ex01{
	public Ex02() {
		super(); // �θ� Ŭ������ default �����ڸ� ���� 
	}
	public Ex02(int num1) {
		super(num1);
		num2 = 20;
	}
	public Ex02(int num1, int num2) {
		super(num1, num2);
	}
	public int add() {
		return  num1 + num2;
	}
	public int sub() {
		return num1 - num2;
	}
	public int div() { // �θ�� ���� ���� �޼��带 ������ : �޼��� �������̵�
		if( num2 == 0) {// �޼��� �����Ǹ� �ϸ� �θ� �޼��带 ����� �� ����.
			return 0;
		}else {
			return num1 / num2;
		}
	}
}
