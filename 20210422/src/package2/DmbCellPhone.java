package package2;

public class DmbCellPhone extends CellPhone{
	int channel;
	DmbCellPhone(String model, String color, int channel){
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	public void turnOnDmb() {
		System.out.println("ä�� " + channel + " �Դϴ�.");
	}
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("ä�� " + channel + " �Դϴ�.");
	}
	void turnOffDmb() {
		System.out.println("DMB ��� ������ ����ϴ�.");
	}
}
