
public class Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Math.random()   : 0.0000000 ~ 0.99999999
		// Math.random() * 3 : 0.0000000 ~ 2.99999999
		// (int)(Math.random() * 3) : 0, 1, 2
		// (int)(Math.random() * 3) + 1 : 0+1 = 1, 1+1 = 2, 2+1=3 
		int num = (int)(Math.random() *3 ) +1;
		if (num == 1) {
			System.out.println("1�Դϴ�.");
		}else if(num==2) {
			System.out.println("2�Դϴ�.");
		}else if(num == 3) {
			System.out.println("3�Դϴ�.");
		}
		System.out.println("======= switch ========");
		switch(num) {
		case 1:System.out.println("1�Դϴ�.");break;
		case 2:System.out.println("2�Դϴ�.");break;
		case 3:System.out.println("3�Դϴ�.");break;
		}
	}

}
