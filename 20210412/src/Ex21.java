
public class Ex21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 ���� 100���� ����Ͻÿ� while
		int i = 0;
		while (i < 100) { // i <= 99
			i++;
			System.out.println(i);
		}
		// 3���� 95���� ����Ͻÿ�.
		i = 2;
		while (i <= 94) {
			i++;
			System.out.println(i);
		}
		// 1���� 100�� 3�� ����� ����Ͻÿ�.while
		i = 0;
		while(i <= 99) {
			i++;
			if(i % 3 != 0) {
				continue;
			}
			System.out.println(i);
		}
		i = 0;
		while (i <= 99) {
			i++;
			if(i % 3 == 0) {
				System.out.println(i);
			}
		}
		// while ���� �̿��ؼ� 4����� ����Ͻÿ�. 1���� 100���� 
		i = 0;
		while (i <= 99) {
			i++;
			if(i % 4 == 0) {
				System.out.println(i);
			}
		}
		
		
		
		
		
		
		
		
		
		
	}

}
