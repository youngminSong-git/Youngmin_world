
public class Ex17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		#������ 1�� ������ϴ�.
		#������ 2�� ������ϴ�.
		#������ 3�� ������ϴ�.
		#������ 4�� ������ϴ�.
		#������ 5�� ������ϴ�.
		#������ 6�� ������ϴ�.
		#������ 7�� ������ϴ�.
		#������ 8�� ������ϴ�.
		#������ 9�� ������ϴ�.
		#������ 10�� ������ϴ�.
		  ������ �Ѿ�ϴ�.
		  */
		//while������ �ۼ�
		int i = 1;
		while(i <= 10) {
			System.out.println("������ "+ i +"�� ������ϴ�.");
			i++;
		}
		// 1���� 100���� ���Ͻÿ�.
		int sum = 0;
		for(int j = 1 ; j <= 100; j++) {
			sum += j;
		}
		System.out.println(sum);
		sum = 0;
		int j = 1;
		while(j <= 100) {
			sum += j;
			j++;
		}
		System.out.println(sum); // 5050
		/// 1~100���� �� Ȧ���� ���Ͻÿ�
		sum = 0;
		for(i = 1; i <= 100; i++) {
			if(i % 2 == 0) {
				continue;
			}
			sum += i;
		}
		System.out.println("for " + sum);
		
		sum = 0; 
		i = 0;
		while (i <= 99) {
			i++;
			if(i % 2 == 0) {
				continue;
			}
			System.out.println(i);
			sum += i;
		}
		System.out.println("while " + sum);
	}

}
