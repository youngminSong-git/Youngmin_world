package package4;

/// class���� interface�� ��� �޾ƿ´�.
/// �߻�޼��带 class�� ��� ������ ����(������)�ؾ��Ѵ�. implement
/// interface�� class�� ����ϰ� �Ǹ� interface���� �ִ� �߻�޼��带 ���� �ؾ��Ѵ�.
/// Audio RemoteControl
public class Ex09 implements Ex08{
	private int volume; // ���� ������ ����
	@Override
	//turnOn() �߻� �޼ҵ��� ��ü �޼ҵ�
	public void turnOn() {
		System.out.println("Audio�� �մϴ�.");
	}
	@Override
	public void turnOff() {
		System.out.println("Audio�� ���ϴ�.");
	}
	@Override             // -1                   
	public void setVolume(int volume) {
		if (volume > Ex08.MAX_VOLUME) { // 11 = > 10
			this.volume = Ex08.MAX_VOLUME; 
		}else if(volume < Ex08.MIN_VOLUME) { // -1 => 0
			this.volume = Ex08.MIN_VOLUME;
		}else{
			this.volume = volume;
		}
		System.out.println("���� �Ҹ� ũ��� : " + this.volume);
	}

}
