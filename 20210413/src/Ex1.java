public class Ex1 {

	public static void main(String[] args) {
		System.out.println("1��° �Դϴ�.");
		System.out.println("2��° �Դϴ�.");
		System.out.println("3��° �Դϴ�.");
		System.out.println("4��° �Դϴ�.");
		System.out.println("5��° �Դϴ�.");
		System.out.println("6��° �Դϴ�.");
		System.out.println("7��° �Դϴ�.");
		System.out.println("8��° �Դϴ�.");
		
		System.out.println("===============================");
		int i;
		for( i = 1; i <= 8; i++) {
			System.out.println(i + "��° �Դϴ�.");
		}
		
		System.out.println("==============================");
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
		System.out.println("1���� 10������ �� : " + sum);
		
		System.out.println("====================================");
		for(i = 1; i <= 10 ; i++) {
			sum = sum + i;
		}
		System.out.println("1���� 10������ �� : " + sum);
		
		System.out.println("====================================");
		
		System.out.println(" 3 * 1 = 3");
		System.out.println(" 3 * 2 = 6");
		System.out.println(" 3 * 3 = 9");
		System.out.println(" 3 * 4 = 12");
		System.out.println(" 3 * 5 = 15");
		System.out.println(" 3 * 6 = 18");
		System.out.println(" 3 * 7 = 21");
		System.out.println(" 3 * 8 = 24");
		System.out.println(" 3 * 9 = 27");
		
		System.out.println("====================================");
		for (i = 1; i <= 9 ; i++) {
			System.out.println(" 3 * "+ i +" = " + 3 * i);
		}
		
		System.out.println("====================================");
		
		System.out.println(" 5 * 3 = 15");
		System.out.println(" 5 * 4 = 20");
		System.out.println(" 5 * 5 = 25");
		System.out.println(" 5 * 6 = 30");
		System.out.println(" 5 * 7 = 35");
		
		System.out.println("====================================");
		for(i = 3; i <= 7; i++) {
			System.out.println(" 5 * " + i + " = " + 5 * i);
		}
		System.out.println("====================================");
		
		System.out.println(" 2 * 3 = 6");
		System.out.println(" 3 * 3 = 9");
		System.out.println(" 4 * 3 = 13");
		System.out.println(" 5 * 3 = 15");
		System.out.println(" 6 * 3 = 18");
		System.out.println("====================================");
		for(i = 2; i <= 6; i++) {
			System.out.println(i + " * 3 = " + i * 3);
		}
		System.out.println("====================================");
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
		System.out.println("====================================");
		for(i = 1; i <= 10; i++) {
			System.out.println( i + "�� ������ϴ�.");
			if(i == 10) {
				System.out.println("������ �Ѿ�ϴ�.");
			}
		}
	}
}
