
public class Ex24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� �ݺ���
		/*
		for(){
			for(){
			}
		}
		*/
		// 4�� ��� , 5�� ~ 8��
		for(int i = 5; i <= 8 ; i++) {
			System.out.println("4 * " + i + " = " + 4 * i);
		}
		// 5�� ��� , 5�� ~ 8��
		for(int i = 5; i <= 8 ; i++) {
			System.out.println("5 * " + i + " = " + 5 * i);
		}
		// 6�� ��� , 5�� ~ 8��
		for (int i = 5; i <= 8; i++) {
			System.out.println("6 * " + i + " = " + 6 * i);
		}
		System.out.println("================");
		
		for(int j = 4; j <= 6; j++) {
			for (int i = 5; i <= 8; i++) {
				System.out.println( j + " * " + i + " = " + j * i);
			}
		}
		
		
		System.out.println("1 ��°�Դϴ�.");
		System.out.println("2 ��°�Դϴ�.");
		System.out.println("3 ��°�Դϴ�.");
		System.out.println("4 ��°�Դϴ�.");
		
		for(int i = 1; i <= 4; i++) {
			System.out.println(i + " ��°�Դϴ�.");
		}
	}

}
