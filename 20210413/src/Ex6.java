
public class Ex6 {
	public static void main(String [] args) {
		// 4�� ���
		int dan = 4;
		int gop;
		for(gop = 1; gop <= 9; gop++) {
			System.out.println(dan + " * " + gop + " = " + dan * gop);
		}
		// 5�� ���
		dan = 5;
		for(gop = 1; gop <= 9; gop++) {
			System.out.println(dan + " * " + gop + " = " + dan * gop);
		}
		// 6�� ���
		dan = 6;
		for(gop = 1; gop <= 9; gop++) {
			System.out.println(dan + " * " + gop + " = " + dan * gop);
		}
		
		System.out.println("===================================");
		for(dan = 4; dan <= 6; dan++) {
			for(gop = 1; gop <= 9; gop++) {
				System.out.println(dan + " * " + gop + " = " + dan * gop);
			}
		}
		
		System.out.println("===================================");
				
		System.out.println("1�����Դϴ�.");
		System.out.println("2�����Դϴ�.");
		System.out.println("3�����Դϴ�.");
		System.out.println("4�����Դϴ�.");
		System.out.println("5�����Դϴ�.");
		for(int i = 1; i <= 5; i++) {
			System.out.println(i + "�����Դϴ�.");
		}
		
		
		
	}
}
