
public class Ex08 {

	public static void main(String[] args) {
		int [] i = {95, 71, 84, 93, 87};
		// ���� for���� �̿��ؼ� ���� ���Ͻÿ�.
		int sum = 0;
		for(int num : i) {
			sum = sum + num;
		}
		System.out.println(sum);
		sum = 0;
		for(int j = 0; j < i.length; j ++) {
			sum = sum + i[j];
		}
		System.out.println(sum);
		// 1 ~ 10 ������ ��
		sum = 0;
		for(int j = 1; j < 11 ;j++) {
			sum = sum + j;
		}
		System.out.println(sum);
	}
}
