
public class Ex19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1���� 10���� �ݺ��ϴµ� Ȧ��
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 0) {
				continue;
			}
			System.out.println(i + "��°�Դϴ�.");
		}
		// 1���� 10���� �ݺ��ϴµ� ¦�� 2���
		for(int i = 1; i <= 10; i++) {
			if( i % 2 != 0) { // i % 2 == 1
				continue;
			}
			System.out.println(i + "��°�Դϴ�.");
		}

		// 3��� 
		int number = 6;
		if( number % 3 == 0) {
			System.out.println("3�� ����Դϴ�.");
		}else {
			System.out.println("3�� ����� �ƴմϴ�.");
		}
		// 3�� ����� �ƴ� ����
		number = 4; // 0,1,2
		if(number % 3 != 0) { // number % 3 == 1 || number % 3 == 2
			System.out.println("3�� ����� �ƴմϴ�.");
		}else {
			System.out.println("3�� ����Դϴ�.");
		}
		
		number = 4;
		if( number % 4 == 0) {
			System.out.println("4�� ����Դϴ�.");
		}else {
			System.out.println("4�� ����� �ƴմϴ�.");
		}
		// 4�ǹ���� �ƴ� ����
		number = 5;
		if(number % 4 != 0) {
			System.out.println("4�� ����� �ƴմϴ�.");
		}else {
			System.out.println("4�� ����Դϴ�.");
		}
		
		number = 5;
		if( number % 5 == 0) {
			System.out.println("5�� ����Դϴ�.");
		}else {
			System.out.println("5�� ����� �ƴմϴ�.");
		}
		// 5����� �ƴ� ����?
		number = 6;
		if(number % 5 != 0) {
			System.out.println("5�� ����� �ƴմϴ�.");
		}else {
			System.out.println("5�� ����Դϴ�.");
		}
	}
}
