
public class Ex10 {

	public static void main(String[] args) {
		int num = 7;//(int)(Math.random() * 10) + 1;	
		switch(num) {
		case 1: System.out.println("1�Դϴ�."); break;
		case 2: System.out.println("2�Դϴ�."); break;
		case 3: System.out.println("3�Դϴ�."); break;
		case 4: System.out.println("4�Դϴ�."); break;
		case 5: System.out.println("5�Դϴ�."); break;
		case 6: System.out.println("6�Դϴ�."); break;
		default: System.out.println("7~10�Դϴ�.");
		}
		if(num == 1) {
			System.out.println("1�Դϴ�.");
		}else if(num == 2) {
			System.out.println("2�Դϴ�.");
		}else if(num == 3) {
			System.out.println("3�Դϴ�.");
		}else if(num == 4) {
			System.out.println("4�Դϴ�.");
		}else if(num == 5) {
			System.out.println("5�Դϴ�.");
		}else if(num == 6) {
			System.out.println("6�Դϴ�.");
		}else {
			System.out.println("7~10�Դϴ�.");
			System.out.println("�ڹٰ� ����־��.");
		}
	}

}
