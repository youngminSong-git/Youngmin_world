
public class Ex02 {
	public static void main(String[] args) {
		// �޼��尡 �ʿ��� ����
		// 4��
		for(int gop = 1; gop <= 9; gop++) {
			System.out.println("4 * " + gop + " = " + 4 * gop);
		}
		// 5�� ���
		for(int gop = 1; gop <= 9; gop++) {
			System.out.println("5 * " + gop + " = " + 5 * gop);
		}
		// 6�� ���
		for(int gop = 1; gop <= 9; gop++) {
			System.out.println("6 * " + gop + " = " + 6 * gop);
		}
		System.out.println("================================");
		// 4�� ~ 6��
		for(int dan = 4 ; dan <= 6 ; dan++) {
			for(int gop = 1; gop <= 9; gop++) {
				System.out.println(
				dan + " * " + gop + " = " + dan * gop);
			}
		}
		System.out.println("=================================");
		System.out.println("=================================");
		// 2�� 5�� 7��
		// 2�� ��� 
		int dan = 2;
		for(int gop = 1; gop <= 9; gop++) {
			System.out.println(
					dan + " * " + gop + " = " + dan * gop);
		}
		dan = 5;
		for(int gop = 1; gop <= 9; gop++) {
			System.out.println(
					dan + " * " + gop + " = " + dan * gop);
		}
		dan = 7;
		for(int gop = 1; gop <= 9; gop++) {
			System.out.println(
					dan + " * " + gop + " = " + dan * gop);
		}
		// �ݺ������� �����ؼ� ����ϴ� �ڵ尡 �ִٸ� �ѹ��� �����ؼ� ���
		System.out.println("=================================");
		gugu(2);
		gugu(5);
		gugu(7);
	}
	// �޼���� �޼��� �ȿ� ������ �� ����.
	public static void gugu(int dan) { // ��ȣ�� �޼��� 
		// �ݺ����� �ڵ带 �޼��� �ȿ� ���� 
		for(int gop = 1; gop <= 9; gop++) {
			System.out.println(
					dan + " * " + gop + " = " + dan * gop);
		}
	}
	// �޼����� ���� 
	// 1. ���� �����Ѵ�.
	// 2. ���� �޾ƿ´�.
	// 3. �ݺ����� �ڵ带 �ѹ��� �����ؼ� ����� �� �ִ�.
}
