package package03;

public class Ex09 {
	static String userId;
	String userEmail;
	String userName;

	public Ex09(String userId, String userEmail, String userName) {
		this.userId = userId;
		this.userEmail = userEmail;
		this.userName = userName;		
	}
	
	//getter
	public String getUserId() {
		return this.userId;
	}
	public String getUserEmail() {
		return this.userEmail;
	}
	public String getUserName() {
		return this.userName;
	}
}

//������ ����ڸ� 4�� �ְ�, key�� userId�� Ű�� �ؼ� 4���� ������ ����ڸ� ���
//userID == Ű