// Ŭ������ ���� ���
// ��� �ʵ�
// ������
// �޼���
public class Ex10 {
	// ��� �ʵ�
	String  name;
	int age;
	
	// ������
	public Ex10() {} // default������
	public Ex10(String name, int age) {
		this(name);
		this.age = age;
	}
	public Ex10(String name) {
		this.name = name;
	}
	/// �޼���
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
}
