
public class Ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score1 = 83;
		int score2 = 90;
		int score3 = 83;
		int score4 = 90;
		int score5 = 83;
		int score6 = 90;
		int sum= 0; // score1 ~ score6���� ���� ���ϱ� ���� ����
		sum = sum + score1;
		sum = sum + score2;
		sum = sum + score3;
		sum = sum + score4;
		sum = sum + score5;
		sum = sum + score6;
		System.out.println(sum);
		
		int sum1 = 0; //score�迭�� �ִ� ����� ���� ���ϱ� ���� ����
				// �ڷ����� ���� ������ ������ �����ϰ� �ʹ�.
		// ������ �ϳ������� �������� �����͸� ������ �� ������ ����. �迭
		int [] score = {10,20,30,40,50,60};
		int scr[] = {10, 20, 30};
		// �迭 �ȿ� �ִ� ������ ������ ��Ҷ�� �Ѵ�.
		// �� ��Ҵ� ������ ��ȣ�� 0������ �ο� �ް� �Ǵµ� �� ��ȣ��index��� �Ѵ�.
		System.out.println(score[0]);
		System.out.println(score[1]);
		System.out.println(score[2]);
		for(int i = 0; i <= 5; i++) {
			sum1 = sum1 + score[i];
		}
		System.out.println(sum1);
		
		
		System.out.println(scr[0]);
		System.out.println(scr[1]);
		System.out.println(scr[2]);
		
		// �迭�̶� ���� �ڷ����� �����͸� ������ �����ϱ����ؼ� ���� ��
		
		
	}
}
