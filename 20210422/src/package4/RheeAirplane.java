package package4;

public class RheeAirplane extends Airplane {
	// ����� �Ϲ������� �̸��� �빮�ڷ� �Ѵ�.
	static final int NORMAL = 1; // �Ϲ� ����
	static final int SUPERSONIC = 2; // ������ ����
	
	int flyMode = NORMAL;
	
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("������ �����Դϴ�.");
		}else {
			super.fly(); // �θ� Ŭ������ �ִ� �޼��� ����
		}
	}
	
	
}
