
public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		// i�� 1, 4�϶� i�� 2, 5�϶�, i�� 3, 6�϶�
		if (i == 1 || i == 4) {
			System.out.println("1�̰ų� 4�Դϴ�.");
		}else if(i == 2 || i == 5) {
			System.out.println("2�̰ų� 5�Դϴ�.");
		}else if(i == 3|| i == 6) {
			System.out.println("3�̰ų� 6�Դϴ�.");
		}
		System.out.println("if ���� switch������ ���� ");
		switch(i) {
		case 1 :
		case 4 :
				System.out.println("1�̰ų� 4�Դϴ�.");
		        break;
		case 2 :
		case 5 :
				System.out.println("2�̰ų� 5�Դϴ�.");
				break;
		case 3 :
		case 6 :
				System.out.println("3�̰ų� 6�Դϴ�.");
		}
	}

}
