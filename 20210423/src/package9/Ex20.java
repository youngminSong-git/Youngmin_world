package package9;

public interface Ex20 {
	//���
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	//�߻� �޼ҵ�
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	default void setMute(boolean mute) { // class �Ϲ� �޼���
		if(mute) {
			System.out.println("���� ó���մϴ�.");
		}else {
			System.out.println("���� �����մϴ�.");
		}
	}
}
