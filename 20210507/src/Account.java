public class Account {
	String accNum,
		   accName;
	int balance; //�Աݰ� ������� ��������
	
	public Account(String accNum, String accName, int balance) {
		this.accNum = accNum;
		this.accName = accName;
		this.balance = balance;
	}
	
	public void setDeposit(int money) {
		this.balance += money;
	}
}
