
public class Ex16 {
	public static void main(String [] args) {
		/// 60�� �հ� �ƴϸ� ���հ� 
		/// 60�� �̻��̻��� ���� ������ ���
		int score = 78;
		if (score >= 60) {
			System.out.println("�հ��Դϴ�.");
			if(score >= 90) {
				System.out.println("A");
			}else if(score >= 80) {
				System.out.println("B");
			}else if(score >= 70) {
				System.out.println("C");
			}else if(score >= 60) {
				System.out.println("D");
			}
		}else {
			System.out.println("���հ��Դϴ�.");
		}
	}
}
