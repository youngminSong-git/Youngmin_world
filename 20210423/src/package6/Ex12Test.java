package package6;

public class Ex12Test {

	public static void main(String[] args) {
		// �͸� ��ü
		Ex12 ex = new Ex12() { // �޼��带 ������ �ؼ� ��ü ���� : �͸� ��ü : ��ȸ��
			@Override          // �ݺ��ؼ� ��� ���ϰ� �ʿ��� ������ �����ؾ� �Ѵ�.
			public void add(int num1, int num2) {
				System.out.println(num1 + num2);
			}
			@Override
			public void sub(int num1, int num2) {
				System.out.println(num1 - num2);				
			}
			@Override
			public void mul(int num1, int num2) {
				System.out.println(num1 * num2);				
			}
			@Override
			public void div(int num1, int num2) {
				System.out.println(num1 / num2);
			}
		};
		ex.add(20,10);
		ex.div(20, 10);
		ex.sub(20, 10);
		ex.mul(20, 2);
		Ex12 ex1 = new Ex13();
		Ex13 ex2 = new Ex13(); // ��� �޾Ƽ� �������� Ŭ������ ������ �� ����� �����ϴ�.
		ex2.add(20, 10);
		ex2.div(20, 2);
		
		
	}
}
