
public class Ex2 {

	public static void main(String[] args) {
		System.out.println("1��° �Դϴ�.");
		System.out.println("3��° �Դϴ�.");
		System.out.println("5��° �Դϴ�.");
		System.out.println("7��° �Դϴ�.");
		System.out.println("9��° �Դϴ�.");
		System.out.println("==================================");
		int i;
		for(i = 1; i <= 9; i+=2) {
			System.out.println(i + "��° �Դϴ�.");
		}
		System.out.println("==================================");
		// continue 
		// Ȧ���� ����Ͻÿ�. ¦���� ���
		for(i = 1; i<=9; i++) {
			if(i % 2 == 0 ) {
				continue;
			}
			System.out.println(i + "��° �Դϴ�.");
		}
		System.out.println("==================================");
		System.out.println("2��° �Դϴ�.");
		System.out.println("4��° �Դϴ�.");
		System.out.println("6��° �Դϴ�.");
		System.out.println("8��° �Դϴ�.");
		System.out.println("10��° �Դϴ�.");
		System.out.println("==================================");
		for(i = 2; i <= 10 ; i+=2) {
			System.out.println(i + "��° �Դϴ�.");
		}
		System.out.println("==================================");
		// continue // ¦���� ���
		for(i = 1; i <= 10; i++) {
			if(i % 2 != 0) { // i % 2 == 1
				continue;
			}
			System.out.println(i + "��° �Դϴ�.");
		}
		// continue���� if���� �̿�
		for(i = 1; i <= 10 ; i++) {
			if(i % 2 == 0) {
				System.out.println(i + "��° �Դϴ�.");
			}
		}
		
	}

}
