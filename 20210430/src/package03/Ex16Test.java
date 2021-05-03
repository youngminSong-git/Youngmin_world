package package03;

public class Ex16Test {
	public static void main(String[] args) {
		String ssn = "123124-151234";
		System.out.println(ssn.substring(0,8) + "******");
		
		int idx = ssn.indexOf("-"); //6
		System.out.println(idx);
		
		System.out.println(ssn.substring(0, idx));
		System.out.println(ssn.substring(idx+1));
		System.out.println(ssn.substring(idx-4));
	}
}
