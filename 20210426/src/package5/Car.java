package package5;

public class Car {
	// ����ʵ��� ������
	Tire frontLeftTire = new HankookTire("�տ���", 6);
	Tire frontRightTire = new HankookTire("�տ�����", 2);
	Tire backLeftTire = new KumhoTire("�ڿ���", 3);
	Tire backRightTire = new KumhoTire("�ڿ�����", 4);
	
	int run() {
		System.out.println("[�ڵ����� �޸��ϴ�.]");
		if(frontLeftTire.roll() == false) {stop();return 1;}
		if(frontRightTire.roll() == false) {stop();return 2;}
		if(backLeftTire.roll() == false) {stop();return 3;}
		if(backRightTire.roll() == false) {stop();return 4;}
		return 0; //  ��ü�� Ÿ�̾ ����.
	}
	void stop() {
		System.out.println("�ڵ����� ���߰ڽ��ϴ�.");
	}
}
