package package9;

public class Ex21 implements Ex20{
	private int volume;
	@Override
	public void turnOn() {
		System.out.println("Audio�� �մϴ�.");		
	}
	@Override
	public void turnOff() {
		System.out.println("Audio�� ���ϴ�.");
	}
	@Override
	public void setVolume(int volume) {
		if(volume > Ex20.MAX_VOLUME) {
			this.volume = Ex20.MAX_VOLUME;
		}else if(volume < Ex20.MIN_VOLUME) {
			this.volume = Ex20.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("���� Audio ����: " + volume);
	}
	@Override
	public void setMute(boolean mute) {
		if(mute) {
			System.out.println("Audio ���� ó���մϴ�.");
		}else {
			System.out.println("Audio ���� �����մϴ�.");
		}
	}
}
