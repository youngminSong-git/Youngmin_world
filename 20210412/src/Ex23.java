
public class Ex23 {

	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		// TODO Auto-generated method stub
		// 1.while   6�� ���
		while (i < 9) {
			i++;
			System.out.println(" 6 * " + i + "=" + 6 * i);
		}
		// 2. while  6�� ��� (Ȧ�� �� ���) continue(X)
		i = 0;
		while (i < 9) {
			i++;
			if(i % 2 != 0) {
				System.out.println(" 6 * " + i + "=" + 6 * i);
			}
		}
		// 3. while  6 �� ���(¦�� �� ���) continue (X)
		i = 0;
		while (i < 9) {
			i++;
			if(i % 2 == 0) {
				System.out.println(" 6 * " + i + "=" + 6 * i);
			}
		}
		// 4. while  6�� ��� (Ȧ�� �� ���) continue 
		i = 0;
		while (i < 9) {
			i++;
			if(i % 2 == 0) {
				continue;
			}
			System.out.println(" 6 * " + i + "=" + 6 * i);
		}
		// 5. while  6 �� ���(¦�� �� ���) continue
		i = 0;
		while (i < 9) {
			i++;
			if(i % 2 != 0) {
				continue;
			}
			System.out.println(" 6 * " + i + "=" + 6 * i);
		}
		// 6. while  1 ~ 100 ���� ��� �ϴ� �� 4�� ����� continue(X)
		i = 0;
		while (i < 100) {
			i++;
			if(i % 4 == 0) {
				System.out.println(i);
			}
		}
		// 7. while  1 ~ 100 �� 4�� ����� ���� ���Ͻÿ�. continue(X)
		i = 0;
		sum = 0;
		while (i <= 99) {
			i++;
			if(i % 4 == 0) {
				sum+=i;
			}
		}
		System.out.println(sum);
		// 8. while  1 ~ 100 ���� ��� �ϴ� �� 4�� ����� continue
		i = 0;
		while (i < 100) {
			i++;
			if(i % 4 != 0) {
				continue;
			}
			System.out.println(i);
		}
		// 9. while  1 ~ 100 �� 4�� ����� ���� ���Ͻÿ�. continue
		i = 0;
		sum = 0;
		while (i <= 99) {
			i++;
			if(i % 4 != 0) {
				continue;
			}
			sum+=i;
		}
		System.out.println(sum);
		// 10.while  1 ~ 100 �� 4�� ����� �ƴ� ���� ���� ���Ͻÿ�. continue
		i = 0;
		sum = 0;
		while (i <= 99) {
			i++;
			if(i % 4 == 0) {
				continue;
			}
			sum+=i;
		}
		System.out.println(sum);		
	}
}
