
public class Ex6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/// 90���̻� 'A', 80 �� �̻� 'B', 70�̻��̸� 'C'
		/// 60�� �̻��̸� 'D', �ƴϸ� 'F'
		int score = 78;
		if(score >= 90) {
			System.out.println("A");
		}else  if(score >= 80){
			System.out.println("B");
		}else if(score >= 70){
			System.out.println("C");
		}else if(score >= 60){
			System.out.println("D");
		}else {
			System.out.println("F");
		}
		System.out.println("========if ~ else if========");
		int num = (int)(Math.random() * 6 ) + 1; // 1~6 
		// (Math.random() * 6 )   : 0, 1, 2, 3, 4, 5
        //		               +1 : 1  1  1  1  1  1
		//                        : 1  2  3  4  5  6
		System.out.println(num);
		/// num�� 1:1�Դϴ�. 2:2�Դϴ�. ,..., 6:6�Դϴ�.
		if (num == 1) {
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
		}
		
		System.out.println("===== switch ======");
		
		switch(num) { 
		case 1 : // if(num == 1)
			System.out.println("1�Դϴ�.");
			break;
		case 4 : // if(num==4)
			System.out.println("4�Դϴ�.");
			break;
		case 2 : // if(num == 2)
			System.out.println("2�Դϴ�.");
			break;
		case 5 : // if(num == 5)
			System.out.println("5�Դϴ�.");
			break;
		case 3 : // if(num == 3)
			System.out.println("3�Դϴ�.");
			break;
		case 6 : // if(num==6)
			System.out.println("6�Դϴ�.");
			break;
		}
	}
}
