import java.util.*;

public class Ex01Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, Account> map = new HashMap<String, Account>();
		
		while(true) {
			System.out.println("계좌 등록 : 1 | 입금 : 2 | 출금 : 3 | 계좌정보 : 4 | 종료 : 5");
			System.out.println("해당 번호를 선택하세요.");
			String num = sc.nextLine(),
				   accNum,
				   accName;
			int money;
			switch(num) {
				case "1" : 
					System.out.println("계좌 등록 화면입니다.");
					System.out.println("계좌 번호를 입력해주세요.");
					accNum = sc.nextLine();
					System.out.println("계좌주를 입력해주세요.");
					accName = sc.nextLine();
					System.out.println("입금 금액을 입력해주세요.");
					money = sc.nextInt();
					sc.nextLine();
					Account acc = new Account(accNum, accName, money);
					map.put(accNum, acc);
					break;	
				case "2" : 
					System.out.println("입금 화면입니다.");
					System.out.println("입금 계좌를 입력해주세요.");
					accNum = sc.nextLine();
					System.out.println("입금 금액을 입력해주세요.");
					money = sc.nextInt();
					sc.nextLine();
					acc = map.get(accNum);
					acc.setDeposit(money);
					System.out.println("입금이 완료되었습니다.");
					break;
				case "3" : 
					System.out.println("출금 화면입니다.");
					System.out.println("계좌 번호를 입력해주세요 : ");
					accNum = sc.nextLine();
					System.out.println("출금 금액을 입력해주세요.");
					money = sc.nextInt();
					sc.nextLine();
					acc = map.get(accNum);
					acc.setWithdraw(money);
					System.out.println("출금이 완료되었습니다.");
					break;
				case "4" : 
					System.out.println("계좌정보 화면입니다.");
					System.out.println("계좌 번호 \t 계좌주 \t 금액");
					for(String key : map.keySet()) {
						acc = map.get(key);
						acc.print();
					}
					break;
				case "5" : 
					System.out.println("종료");
					System.exit(0);
				default : 
					System.out.println("숫자가 잘못되었습니다. 다시 입력해주세요.");
			}
		}
	}
}
