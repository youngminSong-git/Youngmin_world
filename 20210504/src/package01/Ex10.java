package package01;

import java.util.*;

public class Ex10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<Integer, Account> map = new HashMap<Integer, Account>();
	
		while(true) {
			System.out.println("�ش� ��ȣ�� �Է��ϼ���.");
			System.out.println("���� ��� : 1 | �Ա� : 2 | ��� : 3 | ���� ���� : 4 | ���� : 5" );
			int num;
			try {
				num = sc.nextInt();
			} catch(Exception e) {
				sc.nextLine();
				System.out.println("���ڸ� �Է��ϼ���.");
				continue;
			}
			switch(num) {
				case 1:
					System.out.println("���� ��� ȭ���Դϴ�.");
					System.out.println("���¹�ȣ�� �Է����ּ���. : ");
					int accNum;
					int money;
					String name;
					
					try {
						accNum = sc.nextInt();
						System.out.println("�Աݱݾ��� �Է��ϼ���. : ");
						money = sc.nextInt();
						sc.nextLine();
					}catch(Exception e) {
						sc.nextLine();
						System.out.println("���ڸ� �Է��ϼ���.");
						break;
					}
					
					System.out.println("���� ������ �̸��� �Է��ϼ���. : ");
					name = sc.nextLine();
					
					Account acc = new Account(accNum, money, name);
					map.put(accNum, acc);
					break;
				case 2 : 
					System.out.println("�Ա� ȭ���Դϴ�.");
					System.out.println("�Ա� ���¸� �Է����ּ���. : ");
					
					int accNum1 = sc.nextInt(); 
					sc.nextLine();
					
					if(map.containsKey(accNum1)) {
						System.out.println("�Ա� �ݾ��� �Է��� �ּ���.");
						money = sc.nextInt();
						sc.nextLine();
						Account acc1 = map.get(accNum1);
						acc1.setDeposit(money);
					} else {
						System.out.println("���°� �������� �ʽ��ϴ�.");
					}
					
					break;
				case 3 :
					System.out.println("��� ȭ���Դϴ�.");
					System.out.println("��� ���¸� �Է����ּ��� : ");
					accNum1 = sc.nextInt();
					sc.nextInt();
					
					if(map.containsKey(accNum1)) {
						Account acc1 = map.get(accNum1);
						System.out.println("��� �ݾ��� �Է����ּ���.");
						money = sc.nextInt();
						sc.nextLine();
						acc1.setWithdraw(money);
					} else {
						System.out.println("���°� �������� �ʽ��ϴ�.");
					}
					
					
					break;
				case 4 :
					System.out.println("���� ���� ȭ���Դϴ�.");
					System.out.println("���¹�ȣ \t ������ \t �Աݾ�");
					for(Integer key : map.keySet()) {
						Account acc1 = map.get(key);
						acc1.print();
					}
					break;
				case 5 : 
					System.out.println("���� ȭ���Դϴ�.");
					System.exit(0); //���α׷� ����
			}
		}		
	}
}
