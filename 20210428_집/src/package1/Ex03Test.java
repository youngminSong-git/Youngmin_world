package package1;

public class Ex03Test {
	static Ex03 ex; //null값을 가지고 있음.
	public static void main(String[] args) {
//		ex.num1 = 10;
//		ex.num2 = 20;
//		ex.add();
//오류
		//해결방안
		try {
			ex.num1 = 10;
			ex.num2 = 20;
		} catch(NullPointerException e) {
			ex = new Ex03(); //객체가 생성되지 않았을 때 nullPoint라고 뜸
			ex.num1 = 10;
			ex.num2 = 20;
		}
		
		ex.add();
	}
}
