
public class Ex04 {
	// ����� �ʱ�ȭ
	static final String company;
	static final String model;
	int maxSpeed;
	/* static�� ����� �����ڸ� ���ؼ� �ʱ�ȭ �� �� ����.
	public Ex04(String comapny, String model) {
		// ���� ����� �����ڸ� ���ؼ� �ʱ�ȭ�� �� �� ����.
	}*/
	static { // ���� ����� static���� �̿��ؼ� �ʱ�ȭ�� �� �� �ִ�.
		company = "�����";
		model = "k5";
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public int getMaxSpeed() {
		return this.maxSpeed;
	}
}
