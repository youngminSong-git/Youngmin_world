public class Ex8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = (int)(Math.random() * 6) + 1;
		// 1, 4 :1�� 4�Դϴ�
		// 2, 5 : 2�� 5�Դϴ�.
		// 3, 6 : 3�� 6�Դϴ�.
		if(num ==1 || num==4) {
			
			System.out.println("1 �Ǵ� 4�Դϴ�.");
		}else if(num == 2 || num == 5) {
			System.out.println("2 �Ǵ� 5�Դϴ�.");
		}else if(num == 3 || num == 6) {
			System.out.println("3 �Ǵ� 6�Դϴ�.");
		}
		System.out.println("===== switch ======");
		switch(num) {
		case 1 : 
		case 4 : System.out.println("1�Ǵ� 4�Դϴ�.");
				break;
		case 2 : 
		case 5 : System.out.println("2�Ǵ� 5�Դϴ�.");	 
				break;
		case 3 : 
		case 6 : System.out.println("3�Ǵ� 6�Դϴ�.");	
				break;
		}
	}
}
