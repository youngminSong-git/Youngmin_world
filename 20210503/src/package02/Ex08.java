package package02;

import java.util.Random;
import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		//����������
		Scanner sc = new Scanner(System.in);
		
		int com1 = (int)(Math.random() * 3 + 1); //0,1,2 + 1
		/*
		 �̷��Ե� ��밡��
		 Random rnd = new Random(3); 
		 int com1 = rnd.nextInt(3) + 1;
		*/
		System.out.println("���������� ����");
		System.out.println("���� : 1, ���� : 2, �� : 3");
		
		int saram = sc.nextInt();
		switch(com1) {
			case 1 :
				System.out.println("����");
				switch(saram) {
					case 1 :
						System.out.println("�����ϴ�.");
						break;
					case 2 : 
						System.out.println("�̰���ϴ�.");
						break;
					case 3 : 
						System.out.println("�����ϴ�.");
						break;
				}
				
				break;
			case 2 :
				System.out.println("����");
				switch(saram) {
					case 1 :
						System.out.println("�����ϴ�.");
						break;
					case 2 : 
						System.out.println("�����ϴ�.");
						break;
					case 3 : 
						System.out.println("�̰���ϴ�.");
						break;
				}
				
				break;
			case 3 :
				System.out.println("��");
				switch(saram) {
					case 1 :
						System.out.println("�̰���ϴ�.");
						break;
					case 2 : 
						System.out.println("�����ϴ�.");
						break;
					case 3 : 
						System.out.println("�����ϴ�.");
						break;
				}
				
				break;
		}
	}
}
