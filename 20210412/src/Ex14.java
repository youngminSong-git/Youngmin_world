
public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/// while
		System.out.println("1�����Դϴ�.");
		System.out.println("2�����Դϴ�.");
		System.out.println("3�����Դϴ�.");
		System.out.println("4�����Դϴ�.");
		System.out.println("5�����Դϴ�.");
		System.out.println("6�����Դϴ�.");
		System.out.println("7�����Դϴ�.");
		System.out.println("8�����Դϴ�.");
		System.out.println("9�����Դϴ�.");
		System.out.println("10�����Դϴ�.");
		for (int i = 1; i <= 10; i++) {
			// 1 2 4
			System.out.println(i + "��°�Դϴ�.");// 3
		}
		int i = 1; // 1
		while (i <= 10) { // 2 // ���ǿ� �������� ������ �ݺ��� ���߰� �ȴ�.
			System.out.println(i + "��°�Դϴ�."); // 3
			i++; // 4
		}
		/// 1234234234234234...2342;

		/// 5�����
		System.out.println("5 * 1 = 5");
		System.out.println("5 * 2 = 10");
		System.out.println("5 * 3 = 15");
		System.out.println("5 * 4 = 20");
		System.out.println("5 * 5 = 25");
		System.out.println("5 * 6 = 30");
		System.out.println("5 * 7 = 35");
		System.out.println("5 * 8 = 40");
		System.out.println("5 * 9 = 45");

		for (i = 1; i <= 9; i++) {
			System.out.println("5 * " + i + " = " + 5 * i);
		}

		i = 1;
		while (i <= 9) {
			System.out.println("5 * " + i + " = " + 5 * i);
			i++;
		}

		/// 3�� 3�� 7�������� ���
		System.out.println("3 * 3 = 9");
		System.out.println("3 * 4 = 12");
		System.out.println("3 * 5 = 15");
		System.out.println("3 * 6 = 18");
		System.out.println("3 * 7 = 21");
		
		for(i = 3; i <= 7; i ++) {
			System.out.println("3 * " + i + " = " + 3 * i);
		}
		
	}
}
