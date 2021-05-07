package package01;

import java.util.*;

public class Ex10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<Integer, Account> map = new HashMap<Integer, Account>();
	
		while(true) {
			System.out.println("해당 번호를 입력하세요.");
			System.out.println("계좌 등록 : 1 | 입금 : 2 | 출금 : 3 | 계좌 정보 : 4 | 종료 : 5" );
			int num;
			try {
				num = sc.nextInt();
			} catch(Exception e) {
				sc.nextLine();
				System.out.println("숫자만 입력하세요.");
				continue;
			}
			switch(num) {
				case 1:
					System.out.println("계좌 등록 화면입니다.");
					System.out.println("계좌번호를 입력해주세요. : ");
					int accNum;
					int money;
					String name;
					
					try {
						accNum = sc.nextInt();
						System.out.println("입금금액을 입력하세요. : ");
						money = sc.nextInt();
						sc.nextLine();
					}catch(Exception e) {
						sc.nextLine();
						System.out.println("숫자만 입력하세요.");
						break;
					}
					
					System.out.println("계좌 주인의 이름을 입력하세요. : ");
					name = sc.nextLine();
					
					Account acc = new Account(accNum, money, name);
					map.put(accNum, acc);
					break;
				case 2 : 
					System.out.println("입금 화면입니다.");
					System.out.println("입금 계좌를 입력해주세요. : ");
					
					int accNum1 = sc.nextInt(); 
					sc.nextLine();
					
					if(map.containsKey(accNum1)) {
						System.out.println("입금 금액을 입력해 주세요.");
						money = sc.nextInt();
						sc.nextLine();
						Account acc1 = map.get(accNum1);
						acc1.setDeposit(money);
					} else {
						System.out.println("계좌가 존재하지 않습니다.");
					}
					
					break;
				case 3 :
					System.out.println("출금 화면입니다.");
					System.out.println("출금 계좌를 입력해주세요 : ");
					accNum1 = sc.nextInt();
					sc.nextInt();
					
					if(map.containsKey(accNum1)) {
						Account acc1 = map.get(accNum1);
						System.out.println("출금 금액을 입력해주세요.");
						money = sc.nextInt();
						sc.nextLine();
						acc1.setWithdraw(money);
					} else {
						System.out.println("계좌가 존재하지 않습니다.");
					}
					
					
					break;
				case 4 :
					System.out.println("계좌 정보 화면입니다.");
					System.out.println("계좌번호 \t 계좌주 \t 입금액");
					for(Integer key : map.keySet()) {
						Account acc1 = map.get(key);
						acc1.print();
					}
					break;
				case 5 : 
					System.out.println("종료 화면입니다.");
					System.exit(0); //프로그램 종료
			}
		}		
	}
}
