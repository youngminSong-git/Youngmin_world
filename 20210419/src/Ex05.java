
public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("2. 매개변수는 있고 반환값이 없는 메서드");
		add(4, 5);
		fullName("숭무","이");
		area(3, 3.14);
		rangleArea(3, 4);
	}
	// 2. 매개변수는 있지만 반환값이 없는 메서드 
	// 반환형을 void로 적어주면 반환값이 없는 메서드가 된다.
	// 반환값이 없는 경우에는 메서드내에서 결과를 확인할 수 있어야 한다.
	public static void rangleArea(int num1, int num2) {
		int result = num1 * num2;
		System.out.println(result);
	}
	public static void area(int radius, double pi) {
		double result = radius * radius * pi;
		System.out.println(result);
	}
	public static void add(int num1, int num2) {
		int result = num1 + num2;
		System.out.println(result);
	}
	public static void fullName(String firstName, 
			String lastName) {
		String fullName = lastName + firstName;
		System.out.println(fullName);
	}
}
