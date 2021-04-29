
public class Ex09 {
	int age;
	String name;
	double height;
	public Ex09() {} // 생성자의 오버로딩
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
	// 매개변수는 있지만 반환값이 없는 메서드
	public void setHeight(double height) {
		this.height = height;
	}
	//  매개변수는 없지만 반환값이 메서드
	public double getHeight() {
		return this.height;
	}
}
