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

//임의의 사용자를 4명 넣고, key는 userId를 키로 해서 4명의 임의의 사용자를 출력
//userID == 키