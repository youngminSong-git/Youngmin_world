
public class Ex08 {
	String name;
	int age;
	double height;
	// �������� �̸��� ���� �Ű������� ������ �ٸ� �ų� �Ű������� ������ 
	// �ٸ� ���� �����ε��̴�.
	public Ex08() {}
	public Ex08(String name, int age, double height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}
	public Ex08(String name, double height, int age) {
		this.name = name;
		this.age = age;
		this.height = height;
	}
	public Ex08(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public Ex08(int age, double height) {
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
