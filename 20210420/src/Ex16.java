
public class Ex16 {
	// ������
	static double pi = 3.141592;
	// ������
	static void gugu(int dan) {
		for(int i = 1; i <= 9; i++) {
			System.out.println(dan + "*" + i + "=" + dan * i);
		} 
	}
	// �ձ��ϱ�
	static int sum(int start, int end) {
		int sum = 0;
		for(int i = start; i <= end ; i++) {
			sum = sum + i;
		}
		return sum;
	}
	// ���� ����
	static double circle(int radius) {
		return radius * radius * pi;
	}
}
