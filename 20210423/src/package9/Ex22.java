package package9;
// Television RemoteControl
public class Ex22 implements Ex20 {
	private int volume;
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
		if(volume > Ex20.MAX_VOLUME) {
			this.volume = Ex20.MAX_VOLUME;
		}else if(volume < Ex20.MIN_VOLUME) {
			this.volume = Ex20.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("���� TV ����: " + volume);
	}
	/// default �޼��� ������ ����.
}
