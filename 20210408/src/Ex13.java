
public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int money = 2000;
		if (money >= 3000) { // ���� ����� �;� ����
			System.out.println("�ýø� Ÿ�� ���ÿ�.");
		}else { // if���� �ִ� ������ ����� false�� ���� ����
			System.out.println("�ɾ�ÿ�.");
		}
		
		int score = 78; // 60�� �̻� �հ�, 60�� �̸��̸� ���հ�
		if(score>=60) {
			System.out.println("�հ�");
		}else {
			System.out.println("���հ�");
		}
		
		char gender = 'M';
		if (gender == 'F') {
			System.out.println("�����Դϴ�.");
		}else {
			System.out.println("�����Դϴ�.");
		}
		String str = gender == 'F' ? "�����Դϴ�." : "�����Դϴ�.";
		System.out.println(str);
		
		/* if(���ǽ�){
		 * 		�����ɹ�1
		 * 		�����ɹ�2
		 * 		�����ɹ�3
		 * 		...
		 * }else{
		 * 		�����ɹ�a
		 * 		�����ɹ�b
		 * 		�����ɹ�c
		 * 		...
		 * } 
		 */
	}

}
