package package11;

public class Person {
	Ex11 contract = new Ex11(3); 
	
	int run() {
		System.out.println("����� ����Ǿ����ϴ�.");
		if(contract.roll() == false) {
			System.out.println("����� ����Ǿ����ϴ�.");
			return 1; 
		}
		return 0;
	}
}
