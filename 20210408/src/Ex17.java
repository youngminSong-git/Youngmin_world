
public class Ex17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 90�� �̻��̸� A������ 95���̸� A+  �ƴϸ� A
		// 80�� �̻��̸� B������ 85���̸� B+  �ƴϸ� B
		int score = 97;
		if(score >= 90) {
			if(score>=95) {
				System.out.println("A+");
			}else {
				System.out.println("A");
			}
		}else if(score >=80) {
			if(score>=85) {
				System.out.println("B+");
			}else {
				System.out.println("B");
			}
		}

	}
}