
public class Ex17 {
	
	int field;
	// ���� ���� �ʱ�ȭ
	// ���������� �ʱ�ȭ�ϴ� ����� static���� �̿��ϰų� static�޼��带 �̿�
	static int field2;
	
	public Ex17(int field, int field2) {
		// �ν��Ͻ� ������ ���� ���� ��� �ʱ�ȭ�� �ȴ�.
		this.field = field;
		this.field2 = field2;
	}
	static {
		// field = 10; �ν��Ͻ������� static������ �ʱ�ȭ�� �� �� ����.
		field2 = 10; // ���������� �ʱ�ȭ�� �ȴ�.
	}
	static void setValue(int field, int field2) {
		//this.field = field;
		// �ν��Ͻ� ������ static�޼��忡���� �ʱ�ȭ�� ���� �ʴ´�.
		field2 = field2; //static ������ �ν��Ͻ� ������ �ƴϹǷ� this���(x)
		// ���� �޼��� �ȿ����� ���������� �ʱ�ȭ�ȴ�.
	}
	void setField(int field) {
		this.field = field;
		this.field2 = field2;
	}
	public void getValue() {
		System.out.println("field : " + field);
		System.out.println("field2 : " + field2);
	}
}
