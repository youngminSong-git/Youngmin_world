
public class Ex5 {

	public static void main(String[] args) {
		System.out.println("1�� ������ϴ�.");
		System.out.println("2�� ������ϴ�.");
		System.out.println("3�� ������ϴ�.");
		System.out.println("4�� ������ϴ�.");
		System.out.println("5�� ������ϴ�.");
		System.out.println("6�� ������ϴ�.");
		System.out.println("7�� ������ϴ�.");
		System.out.println("8�� ������ϴ�.");
		System.out.println("9�� ������ϴ�.");
		System.out.println("10�� ������ϴ�.");
		System.out.println("������ �Ѿ�ϴ�.");
		System.out.println("==================================");
		int i = 1;
		while (i <= 10) {
			System.out.println(i + "�� ������ϴ�.");
			if(i == 10) {
				System.out.println("������ �Ѿ�ϴ�.");
			}
			i++;	
		}
		System.out.println("==================================");
		System.out.println("1��° �Դϴ�.");
		System.out.println("2��° �Դϴ�.");
		System.out.println("3��° �Դϴ�.");
		System.out.println("4��° �Դϴ�.");
		System.out.println("5��° �Դϴ�.");
		System.out.println("6��° �Դϴ�.");
		System.out.println("7��° �Դϴ�.");
		System.out.println("8��° �Դϴ�.");
		System.out.println("==================================");
		i = 1;
		while(i <= 10) {
			System.out.println(i + "��° �Դϴ�.");
			i++;
		}
		System.out.println("==================================");
		int sum = 0;
		sum = sum + 1;
		sum = sum + 2;
		sum = sum + 3;
		sum = sum + 4;
		sum = sum + 5;
		sum = sum + 6;
		sum = sum + 7;
		sum = sum + 8;
		sum = sum + 9;
		sum = sum + 10;
		System.out.println("1 ~ 10���� ���� : " + sum);
		System.out.println("==================================");
		sum = 0;
		i = 1;
		while(i <= 10 ) {
			sum = sum + i;
			i++;
		}
		System.out.println("1 ~ 10���� ���� : " + sum);
		System.out.println("==================================");
		sum = 0;
		i = 1;
		int end = 10;
		while (i <= end) {
			sum = sum + i;
			i++;
		}
		System.out.println("1 ~ 10���� ���� : " + sum);
		System.out.println("==================================");
		
		System.out.println(" 3 * 1 = 3");
		System.out.println(" 3 * 2 = 6");
		System.out.println(" 3 * 3 = 9");
		System.out.println(" 3 * 4 = 12");
		System.out.println(" 3 * 5 = 15");
		System.out.println(" 3 * 6 = 18");
		System.out.println(" 3 * 7 = 21");
		System.out.println(" 3 * 8 = 24");
		System.out.println(" 3 * 9 = 27");
		
		System.out.println("==================================");
		i = 1;
		while(i <= 9) {
			System.out.println(" 3 * " + i + " = " + 3 * i);
			i++;
		}
		System.out.println("==================================");
		System.out.println(" 3 * 1 = 3");
		System.out.println(" 3 * 3 = 9");
		System.out.println(" 3 * 5 = 15");
		System.out.println(" 3 * 7 = 21");
		System.out.println(" 3 * 9 = 27");
		System.out.println("==================================");
		i = 1;
		while(i <= 9) {
			if(i % 2 == 0 ) {continue;}
			System.out.println(" 3 * " + i + " = " +  3 * i);
			i++;
		}
		System.out.println("==================================");
		i = 1;
		while(i <= 9) {
			System.out.println(" 3 * " + i + " = " +  3 * i);
			i+=2;
		}
		System.out.println("==================================");
		i = 0;
		while(i <=9 ) {
			i++;
			System.out.println(" 3 * " + i + " = " +  3 * i);
		}
		// 100���� 1000������ ���� ���Ͻÿ�.
		i = 100;
		end = 1000;
		sum = 0;
		while(i <= end) {
			sum += i;
			i ++;
		}
		System.out.println(sum);
	}

	
	
	
	
	
	
	
}
