package package9;

public class Ex23Test {
	public static void main(String[] args) {
		Ex20 ex = new Ex21();
		ex.turnOn();
		ex.setVolume(5);
		ex.setMute(true);
		ex.setMute(false); // default �޼��� ������
		ex.turnOn();
		ex = new Ex22(); // ������
		ex.turnOn();
		ex.setVolume(8);
		ex.setMute(true);
		ex.setMute(false); // default�޼��� ���������� �ʾ���.
		ex.turnOff();
	}

}
