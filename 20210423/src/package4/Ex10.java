package package4;
// TV RemoteControl
public class Ex10 implements Ex08{
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
		if(volume > Ex08.MAX_VOLUME) { // �Էµ� ���� MAX_VOLUME���� ũ�ٸ� 
			this.volume = Ex08.MAX_VOLUME; // MAX_VOLUME���� volume�� 
		}else if(volume < Ex08.MIN_VOLUME) {// �Էµ� ���� MIN_VOLUME���� �۴ٸ�
			this.volume = Ex08.MIN_VOLUME; // MIN_VOLUME���� volume��		
		}else {  // 0~ 10���̿� �ִ� ��
			this.volume = volume;
		}
	}
}
