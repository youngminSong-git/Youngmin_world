
public class Ex07 {
	static int num1 = 3;
	static int num2 = 4;
	static String firstName = "숭무";
	static String lastName = "이";
	static int radius = 3;
	static double pi = 3.14;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("4. 매개변수도 없고 반환값도 없다.");
		add();
		name();
		area();
		rangleArea();
	}
	//  반환값이 없는 경우에는 return type으로 void를 적어준다.
	public static void rangleArea() {
		System.out.println(num1 * num2);
	}
	public static void add() {
		System.out.println(num1 + num2);
	}
	public static void name() {
		System.out.println(firstName + lastName);
	}
	public static void area() {
		System.out.println(radius * radius * pi);
	}
	
	/*    매개변수                 반환값
	 *       o             o
	 *       o             x
	 *       x             o
	 *       x             x
	 */
	// 매개변수가 없다는 것은 내부의 값을 사용해서 결과를 얻는다는 말과 같다.
}
