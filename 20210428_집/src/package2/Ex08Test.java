package package2;

public class Ex08Test {

	public static void main(String[] args) {
		Ex08 ex08 = new Ex08();
		System.out.println("�������� ����ϰڽ��ϴ�.");
		try {
			/// ���ܰ� �߻��ϸ� �ݺ����� �ʴ´�.
			/// �ݺ��ǰ� �Ϸ��� Ex09�� �������.
			ex08.gugu();
		}catch(NumberFormatException e) {
			System.out.println("���ڸ� �Է��� �ּ���.");
		}finally {
			System.out.println("�ٽ� �����մϴ�.");
		}
	}

}
