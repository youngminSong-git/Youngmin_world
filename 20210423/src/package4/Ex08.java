package package4;
/// ��� �ҽ������� Ȯ���ڴ� .java�̴�.
/// ��� �ҽ������� compile�� ����Ʈ �ڵ� ������ Ȯ���ڴ� .class�� �ȴ�.
/// RemoteControl
public interface Ex08 {
	//  �����Ͻÿ� public static final�� �ٴ´�.
	int MAX_VOLUME = 10; // ���
	int MIN_VOLUME = 0;
	//�߻� �޼ҵ� // �����Ͻ� public abstract�� �ٴ´�.
	public abstract void turnOn(); // ���� ���� ���� �޼��带 �߻� �޼��� 
	void turnOff();
	void setVolume(int volume);
	// default �޼���
	default void setMute(boolean mute){
		if(mute) {
			System.out.println("���� ó���մϴ�.");
		} else {
			System.out.println("���� �����մϴ�.");
		}
	}
	// ���� �޼���
	static void changeBattery() {
		System.out.println("�������� ��ȯ�մϴ�.");
	}
	/* �������̽������� �Ϲ� �޼���� ����� �� ����.
	public void add() {
		System.out.println(MAX_VOLUME - MIN_VOLUME);
	}
	*/
}
