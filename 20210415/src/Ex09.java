
public class Ex09 {

	public static void main(String[] args) {
		int [] i = {10,20,30,40,50,60,70,80,90,100};
		// ���� for������ ���� ���Ͻÿ�.
		int sum = 0;
		for(int num : i) {
			sum += num;
		}
		System.out.println(sum);
		
		sum = 0;
		// �迭�� ��쿡�� ũ�Ⱑ �ִ�.
		int [] score = {60,89,56,73,66,90,95};
		// ����� ���Ͻÿ�.
		for(int num : score) {
			sum += num;
		}
		System.out.println( sum / score.length );		
	}
}
