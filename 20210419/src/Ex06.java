
public class Ex06 {
	static int num1 = 3;
	static int num2 = 4;
	static String firstName = "숭무";
	static String lastName = "이";
	static int radius = 3;
	static double pi = 3.14;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("3.  매개변수는 없고 반환 값이 있는 메서드");
		int result = add();
		System.out.println(result);
		String fullName = name();
		System.out.println(fullName);
		double circle = area();
		System.out.println(circle);
		result = rangleArea();
		System.out.println(result);
	}
	// 매개변수 없는 경우에는 멤버필드를 이용해서 결과를 얻을 때 사용
	public static int rangleArea() {
		return num1 * num2;
	}
	public static double area() {
		return radius*radius*pi;
	}
	public static String name() {
		return lastName + firstName;
	}
	public static int add() {
		return num1 + num2;
	}

}
