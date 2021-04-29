package package5;

public class Ex11Test {

	public static void main(String[] args) {
		// �͸� ��ü ���� : interface�θ� ��������
		// �Ϲ� Ŭ������ �߻�Ŭ������ �̿��ؼ� �͸� ��ü�� ���� �� ����.
		// �͸� ��ü�� ����� Ŭ������ ������� �ʾƵ� �ȴ�.
		// interface�� Ŭ������ ������� �ʰ� ��ü�� ������.
		// ��ü ������ �� ������ �ڿ� {}�� �ϸ� �͸� ��ü�� ���� �� �ִ�.
		Ex11 ex = new Ex11() { // TV������
			private int volume; //�ʵ带 �߰�
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
				if(volume > Ex11.MAX_VOLUME) {
					this.volume = Ex11.MAX_VOLUME;
				}else if(volume < Ex11.MIN_VOLUME) {
					this.volume = Ex11.MIN_VOLUME;
				}else {
					this.volume = volume;
				}
				System.out.println("���� �Ҹ� ũ��� : " + this.volume);
			}
		};
		ex.setVolume(11);
		ex.setVolume(-200);
		ex.setVolume(5);
	}

}
