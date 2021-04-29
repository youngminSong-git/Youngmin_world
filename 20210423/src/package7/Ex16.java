package package7;

// TV RemoteControl
// �ΰ� �̻��� interface�� ����ϴ� ���� ���� ���
// interface�� ���� ����� �����ϴ�.
// class�� ���� ����� �� �� ����.
public class Ex16 implements Ex14, Ex15 {
	private int volume;
	@Override
	public void search(String url) {
		System.out.println(url + "�� �˻��մϴ�.");	
	}
	@Override
	public void turnOn() {
		System.out.println("TV�� �մϴ�.");		
	}
	@Override
	public void turnOff() {
		System.out.println("TV�� ���ϴ�.");		
	}
	@Override
	public void setVolume(int volume) {
		if(volume > Ex14.MAX_VOLUME) {
			this.volume = Ex14.MAX_VOLUME;
		}else if(volume < Ex14.MIN_VOLUME) {
			this.volume = Ex14.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("���� TV ����: " + volume);
	}
}
