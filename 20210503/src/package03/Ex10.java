package package03;

import java.util.Random;

public class Ex10 {
	public static void main(String[] args) {
		double num = Math.random();
		System.out.println(num);
		
		int num1 = (int)(Math.random());
		System.out.println(num1);
	
		int num2 = (int)(0.25);
		int num3 = (int)(1.65);
		System.out.println("num2 " + num2);
		System.out.println("num3 " + num3);
		
		int num4 = (int)(Math.random() * 3);
		System.out.println(num4);
		/* 
		 0.000 * 3 = 0.000 ~ 0.999 * 3 = 2.998
		 0, 1, 2�� �ϳ��� ����
 		*/
		
		int num5 = (int)(Math.random() * 9);
		System.out.println(num5);
		// 0.000 * 9 = 0.000 ~ 0.999 * 9 = 8.99987, int�̹Ƿ� �Ҽ��� �����ڸ��� �� ©���� ������ ���
		
		int num6  = (int)(Math.random() * 45);
		System.out.println(num6);
		//0,1,2,3~44���� �ҷ�����

		int num7  = (int)(Math.random() * 45 + 1);
		System.out.println(num7);
		//0,1,2,3~44 + 1���� �ҷ�����
		
		Random rnd = new Random(10); //��Ʈ���� �ٲ��־�� ��
		int num8 = rnd.nextInt(45); // 0 ~ 44���� �ҷ�����
		System.out.println("num8 : " + num8);
		int num9 = rnd.nextInt(45) + 1;
		System.out.println("num9 : " + num9);
		
		
 	}
}
