package package2;

// �߻� Ŭ������ ��� �޾����Ƿ� �޼��带   �������ؼ� ����ؾ� �Ѵ�.
public class Ex05 extends Ex04{
	/// �ڽ� Ŭ�������� ��� ���� �޼������ ������ �Ѵٸ� ���� ��� ���� ������ �������? 
	/// �޼������ �� Ŭ���������� ����ϴ� ���� �ƴ϶� ���� Ŭ���� ������ �̸��� �޼��带 ����ϰ� �ʹ�.
	@Override
	public void add() {  
		System.out.println(num2 - num1);
	}
	@Override
	public void sub() {
		System.out.println(num2 - num1);
	}
	public void mul() {
		System.out.println(num2 * num1);
	}
	public void div() {
		System.out.println(num2 / num1);
	}
}
