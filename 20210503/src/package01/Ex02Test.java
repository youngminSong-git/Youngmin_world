package package01;

import java.util.Scanner;

public class Ex02Test {
	public static void main(String[] args) {
		Ex01 ex = new Ex01();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���۴� �Է��ϼ���.");
		int dan1 = sc.nextInt();
		
		System.out.println("���� �Է��ϼ���.");
		int dan2 = sc.nextInt();
		
		System.out.println("�����ϴ� ���� �Է��ϼ���.");
		int	gop1 = sc.nextInt();
		
		System.out.println("�� ���� �Է��ϼ���.");
		int	gop2 = sc.nextInt();
		
		ex.gugu(dan1, dan2, gop1, gop2);
	}	
}
