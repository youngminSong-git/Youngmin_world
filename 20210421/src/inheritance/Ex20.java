package inheritance;

// �ڽ�Ŭ����
public class Ex20 extends Ex19{
	int studentNo;

	public Ex20(String name, String ssn, int studentNo) { // �ڽ� Ŭ���� ������
		super(name, ssn); //  �θ� Ŭ������ �ִ� ������
		this.studentNo = studentNo;
	}
	public void print() {
		System.out.println(name);
		System.out.println(ssn);
		System.out.println(studentNo);
	}
}