
public class Ex09 {
	int age;
	String name;
	double height;
	public Ex09() {} // �������� �����ε�
	public Ex09(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public Ex09(int age, String name, double height) {
		this.age = age;
		this.name= name;
		this.height = height;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return this.age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public 	String getName() {
		return this.name;
	}
	// �Ű������� ������ ��ȯ���� ���� �޼���
	public void setHeight(double height) {
		this.height = height;
	}
	//  �Ű������� ������ ��ȯ���� �޼���
	public double getHeight() {
		return this.height;
	}
}
