package package01;

public class Ex03test {
	static Ex03 ex;
	public static void main(String[] args) {
		try {
			ex.num1 = 10;
			ex.num2 = 20;
		}catch(NullPointerException e) {
			ex = new Ex03(); // ��ü�� �������� �ʾ��� �� nullPoint
			ex.num1 = 10;
			ex.num2 = 20;
		}
		ex.add();
	}
}
