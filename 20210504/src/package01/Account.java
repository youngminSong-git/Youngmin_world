package package01;

public class Account {
	//Account
	int accNum;
	int balance;
	String accName;
	Account(int accNum, int balance, String accName){
		this.accNum = accNum;
		this.balance = balance;
		this.accName = accName;
	}
	//withdraw == ���
	public void setWithdraw(int money) {
		this.balance = balance - money;
	}
	
	//�Ա�
	public void setDeposit(int money) {
		this.balance = balance + money;
	}
	
	public void print() {
		System.out.println(this.accNum + "\t" + this.accName + "\t" + this.balance);
	}

}
