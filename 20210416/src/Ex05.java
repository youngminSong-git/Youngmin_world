
public class Ex05 {
	String name;
	int age;
	double height;
	
	// ��ü ������ ���ÿ� ��� �ʵ� ���� ������ �ǵ��� ����.
	// ������
	public Ex05(String name, int age, double height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}
	// �����ڰ� �����ڸ� ����� default�����ڴ� ��������� �ʴ´�.
	// default �����ڰ� �ʿ��ϴٸ� 
	// ���� ������ �־�� �Ѵ�.
	public Ex05() {}
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
