package package10;

public interface Ex24 {
	//���
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	//�߻� �޼ҵ�
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	//����(static) �޼ҵ�
	static void changeBattery() {
		System.out.println("�������� ��ȯ�մϴ�.");
	}
}
