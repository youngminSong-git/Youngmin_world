
public class Ex20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1���� 100������ Ȧ���� ���� ���Ͻÿ�.
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 0) {
				System.out.println( i + "�� ¦���Դϴ�.");
				continue;
			}
			sum += i;
		}
		System.out.println(sum);
		// ¦���� ���� ���Ͻÿ�.
		sum = 0;
		for(int i = 0; i <= 100 ; i++) {
			if(i % 2 != 0) {
				System.out.println(i + "�� Ȧ���Դϴ�.");
				continue;
			}
			sum += i;
		}
		System.out.println(sum);
		
		sum = 0;
		for(int i = 0; i <= 100; i++) {
			if(i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
		
		// Ȧ���� ���� ���Ͻÿ�.
		sum = 0;
		int i = 0;
		while (i <= 99) { // 99
			i++; // 100 // 101
			if(i % 2 == 0 ) {
				continue;
			}
			sum += i;
			 // 2
		}
		System.out.println(sum);
		// 1 ~ 10����Ͻÿ�. while	
		int i1 = 0; 
		while (i <= 9) {
			i++;
			System.out.println(i);
		}
		i1 = 0;
		while (i < 10) {
			i++;
			System.out.println(i);
		}
		
	}
}
