
public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 90�̻� 'A', 80�̻� 'B', 70�̻� 'c', 60�̻� 'd' , 'F'
		int score = 78;
		if (score >= 90) {
			System.out.println("90 �� �̻��Դϴ�.");
		}else {
			System.out.println("90 ������ �۽��ϴ�.");
		}
		
		if (score >= 90) {
			System.out.println("A");
		}else if(score>=80){
			System.out.println("B");
		}else if(score >= 70){
			System.out.println("C");
		}else if(score >= 60){
			System.out.println("D");
		}else {
			System.out.println("F");
		}
	}
}
