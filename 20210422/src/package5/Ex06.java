package package5;

public class Ex06 extends Ex05{
	Ex06(int num1, int num2){
		super(num1, num2);
	}
	public int mul() {
		return num1 * num2;
	}
	public double div() {
		return num1 / num2;
	}
	/* �θ� Ŭ������ �ִ� �޼��忡 final�̶�� �ָ� ������ �� �� ����.
	public int sub() { // �θ�� ��� ���� �޼��带 ������ 
		return num2 - num1;
	}
	*/
}
