
public class Ex04 {
	String name;
	int age;
	double height;
	//  Ŭ������� �̸��� ���� �޼���
	public Ex04() {} // default ������ 
	// �����ڰ� �����ڸ� ����� default�����ڴ� ��������� �ʴ´�.
	// �����ڸ� ����� default �����ڰ� �ʿ��ϴٰ� �Ѵٸ� ���� �����־��
	// �Ѵ�.
	// ������
	public Ex04(String name, int age, double height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return this.age;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getHeight() {
		return this.height;
	}
}
