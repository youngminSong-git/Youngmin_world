package package7;

import package6.Ex09;

public class Ex12 extends Ex09{
	public Ex12(String  field) {
		super();
		this.field = field;  // �θ� Ŭ������ ���� ��� ���� �ʵ�
	}
	public void print() {
		// �θ� Ŭ������ ���� ��� ���� �ʵ�  ���
		System.out.println(this.field);
		method();
	}
	
}
