
public class Ex04 {
	public static void main(String [] args) {
		// 4��
		for(int i = 1; i<=9; i++) {
			System.out.println("4 * " + i + " = " + 4 * i);
		}
		// 5��
		for(int i = 1; i <= 9 ; i++) {
			System.out.println("5 * " + i + " = " + 5 * i);
		}
		// 6��
		for(int i = 1; i <= 9 ; i++) {
			System.out.println("6 * " + i + " = " + 6 * i);
		}	
		// 4 �� ~ 6��
		for(int dan = 4; dan <= 6; dan ++) {
			for(int i = 1; i <= 9 ; i++) {
				System.out.println(dan + " * " + i + " = " + dan * i);
			}
		}
		System.out.println("================================");
		// 2��
		for(int i = 1 ; i <= 9; i++) {
			System.out.println("2 * " + i + " = " + 2 * i);
		}
		// 5�� 
		for(int i = 1; i <= 9; i++) {
			System.out.println("5 * " + i + " = " + 5 * i);
		}
		// 9��
		for(int i = 1; i <= 9; i++) {
			System.out.println("9 * " + i + " = " + 9 * i);
		}
		System.out.println("===========================");
		gugu(2);
		gugu(5);
		gugu(9);
	}
	public static void gugu(int dan) {
		for(int i = 1; i <= 9; i++) {
			System.out.println(dan + " * " + i + " = " + dan * i);
		}
	}
}
