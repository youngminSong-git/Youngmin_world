
public class Ex18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1���� 10���� ��� Ȧ���� ���
		System.out.println("1��°�Դϴ�.");
		System.out.println("3��°�Դϴ�.");
		System.out.println("5��°�Դϴ�.");
		System.out.println("7��°�Դϴ�.");
		System.out.println("9��°�Դϴ�.");
		for(int i = 1; i <= 10; i++) {
			if( i % 2 == 0) { // ¦���� �ǹ��Ѵ�.  
				continue;
			}
			System.out.println(i + "��°�Դϴ�.");
		}
		/* 0 % 2 = 0 // ¦��
		 * 1 % 2 = 1 // Ȧ��
		 * 2 % 2 = 0
		 * 3 % 2 = 1
		 * 4 % 2 = 0
		 */
		// ¦���� ���
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 1) {
				continue;
			}
			System.out.println(i + "��°�Դϴ�.");
		}
	}

}
