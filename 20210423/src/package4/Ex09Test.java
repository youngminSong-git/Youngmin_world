package package4;

public class Ex09Test {

	public static void main(String[] args) {
		Ex09 ex = new Ex09();
		ex.setVolume(5);
		
		Ex10 ex2 = new Ex10();
		ex2.setVolume(11); // 11 ==> 10
		ex2.setVolume(-20); // -20 ==> 0
		ex2.setVolume(5); // 0~10 
		
		/// interface ������ Ex09�� �θ��̹Ƿ� Ex09�� ���� ��ü�� ���� �� �� �ִ�.
		/// interface��  ��ӹ��� ��ü�� �����ϴ� ������ ���� ���� �ִ�.
		Ex08 ex1 = new Ex09(); // audio ������
		ex1.setVolume(11);
		ex1.setVolume(-20);
		ex1.setVolume(5);
		
		ex1 = new Ex10(); /// tv ������
		ex1.setVolume(11);
		ex1.setVolume(-20);
		ex1.setVolume(5);
		/// ������
		
		
		/// interface�� �߻�޼��带 ������ �־� �ϼ��Ǿ� ���� �����Ƿ� ��ü ������ �� �� ����.
		//Ex08 ex2 = new Ex08();
		
		
	}
}
