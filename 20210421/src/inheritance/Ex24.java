package inheritance;

public class Ex24 extends Ex23{
	String subject;
	public Ex24(int radius, double pi, String subject) {
		super(radius,pi);
		this.subject = subject;
	}
	// �θ� Ŭ������ ���� ��� ���� �޼��带 �ڽ� Ŭ�������� Math.PI�� ����Ѵٰ� 
	// ������ : �޼���  �������̵�
	public double area() {
		return radius * radius * Math.PI;
	}
	public double area(double p) { /// �����ε�
		return radius * radius * p;
	}
}