package package2;

public class Ex07Test {
	public static void main(String[] args) {
		Ex07 ex = new Ex07();

		try {
			ex.div();
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("idx�� 2 �̻��̸� �ȵ˴ϴ�.");
		} catch(NumberFormatException e) {
			System.out.println("���ڸ� �Է� �����մϴ�.");
		} catch(ArithmeticException e) {
			System.out.println("969776");
		} catch(Exception e){
			e.printStackTrace(); //����ó�� �Ǿ��� �� ��� �������� ���
		} finally {
			System.out.println("�ٽý���");
			
		}
	}
}
