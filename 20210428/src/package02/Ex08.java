package package02;

import java.util.Scanner;

public class Ex08 {
	public void gugu() throws NumberFormatException  {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�������� ����ϰڽ��ϴ�.");
		while(true) {
			System.out.println("���α׷��� �����Ϸ��� exit");
			
			System.out.print("ù ���� �Է��Ͻÿ�. : ");
			String data1 = sc.nextLine();
			System.out.print("������ ���� �з��Ͻÿ�. : ");
			String data2 = sc.nextLine();
			System.out.print("���� ���� �Է��Ͻÿ�. : ");
			String data3 = sc.nextLine();
			System.out.println("������ ���� �Է��Ͻÿ�.");
			String data4 = sc.nextLine();
			
			if(data1.equals("exit") || data2.equals("exit") ||
					data3.equals("exit") || data4.equals("exit")) {
				System.out.println("���α׷� ���� �մϴ�.");
				sc.close();
				break;
			}
			
			int startDan = Integer.parseInt(data1);
			int endDan = Integer.parseInt(data2);
			int startGop = Integer.parseInt(data3);
			int endGop = Integer.parseInt(data4);
			
			// 2�� ~ 9��
			for(int dan = startDan ; dan <= endDan ; dan++) {
				for(int gop = startGop; gop <= endGop ; gop++) {
					System.out.println(dan + " * " + gop + " = " + dan * gop);
				}
				System.out.println();
			}
		}
	}
}
