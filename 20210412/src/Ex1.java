
public class Ex1 {
	public static void main(String[] args) {
		int num = 1;
		if(num == 1){
			System.out.println("1�Դϴ�.");
		}else if(num == 2){
			System.out.println("2�Դϴ�.");
		}else if(num == 3) {
			System.out.println("3�Դϴ�.");
		}else {
			System.out.println("4�̻��Դϴ�.");
		}
		System.out.println("=====switch======");
		switch(num) {
		case 1 : System.out.println("1�Դϴ�.");
		         break;
		case 2 : System.out.println("2�Դϴ�.");
				 break;
		case 3 : System.out.println("3�Դϴ�.");
		         break;
		default : System.out.println("4�̻��Դϴ�.");
		}
	}
}
