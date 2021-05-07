import java.util.*;

public class Ex01Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, Account> map = new HashMap<String, Account>();
		
		while(true) {
			System.out.println("���� ��� : 1 | �Ա� : 2 | ��� : 3 | �������� : 4 | ���� : 5");
			System.out.println("�ش� ��ȣ�� �����ϼ���.");
			String num = sc.nextLine(),
				   accNum,
				   accName;
			int money;
			switch(num) {
				case "1" : 
					System.out.println("���� ��� ȭ���Դϴ�.");
					System.out.println("���� ��ȣ�� �Է����ּ���.");
					accNum = sc.nextLine();
					System.out.println("�����ָ� �Է����ּ���.");
					accName = sc.nextLine();
					System.out.println("�Ա� �ݾ��� �Է����ּ���.");
					money = sc.nextInt();
					sc.nextLine();
					Account acc = new Account(accNum, accName, money);
					map.put(accNum, acc);
					break;	
				case "2" : 
					System.out.println("�Ա� ȭ���Դϴ�.");
					System.out.println("�Ա� ���¸� �Է����ּ���.");
					accNum = sc.nextLine();
					System.out.println("�Ա� �ݾ��� �Է����ּ���.");
					money = sc.nextInt();
					sc.nextLine();
					acc = map.get(accNum);
					acc.setDeposit(money);
					System.out.println("�Ա��� �Ϸ�Ǿ����ϴ�.");
					break;
				case "3" : 
					System.out.println("��� ȭ���Դϴ�.");
					System.out.println("���� ��ȣ�� �Է����ּ��� : ");
					accNum = sc.nextLine();
					System.out.println("��� �ݾ��� �Է����ּ���.");
					money = sc.nextInt();
					sc.nextLine();
					acc = map.get(accNum);
					acc.setWithdraw(money);
					System.out.println("����� �Ϸ�Ǿ����ϴ�.");
					break;
				case "4" : 
					System.out.println("�������� ȭ���Դϴ�.");
					System.out.println("���� ��ȣ \t ������ \t �ݾ�");
					for(String key : map.keySet()) {
						acc = map.get(key);
						acc.print();
					}
					break;
				case "5" : 
					System.out.println("����");
					System.exit(0);
				default : 
					System.out.println("���ڰ� �߸��Ǿ����ϴ�. �ٽ� �Է����ּ���.");
			}
		}
	}
}
