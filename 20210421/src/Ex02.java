
public class Ex02 {
	private int age;
	private String name;
	private String addr;
	
	public Ex02() {}
	public Ex02(int age, String name, String addr) {
		this.addr = addr;
		this.age = age;
		this.name = name;
	}
	// setter : ����ʵ忡 ���� �����ϴ� �޼��带 setter�� ��
	public void setAge(int age) {
		this.age = age;
		// this�� �����ִ� ������ �ν��Ͻ� ����(��, ����ʵ�)���� ��Ÿ��
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	// getter
	public int getAge() {
		return this.age;
	}
	public String getName() {
		return this.name;
	}
	public String getAddr() {
		return this.addr;
	}
}



