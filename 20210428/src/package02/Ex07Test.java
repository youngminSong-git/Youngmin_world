package package02;

public class Ex07Test {

	public static void main(String[] args) {
		Ex07 ex = new Ex07();
		try {
			ex.div();
		}catch(NumberFormatException e) {
			System.out.println("���ڸ� �Է� �����մϴ�.");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("idx�� 1�� �ʰ��� �� �����ϴ�.");
		}catch(ArithmeticException e) {
			System.out.println("�и� 0�̸� �ȵ˴ϴ�.");
		}catch(Exception e) {
			e.printStackTrace();// ����ó���� �Ǿ��� �� � �������� �������.
		}finally {
			System.out.println("�ٽ� �����մϴ�.");
		}
	}
}
