package package01;

public class Ex03 {
	static int idx;
	String email,
		   name;
	public Ex03(String email, String name) {
		idx++;
		this.email = email;
		this.name = name;
	}
	
	//getter »ý¼º
	public String getEmail() {
		return this.email;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getIdx() {
		return this.idx;
	}
}
