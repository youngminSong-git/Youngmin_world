
public class Ex02 {
	public static void main(String[] args) {
		// 메서드가 필요한 이유
		// 4단
		for(int gop = 1; gop <= 9; gop++) {
			System.out.println("4 * " + gop + " = " + 4 * gop);
		}
		// 5단 출력
		for(int gop = 1; gop <= 9; gop++) {
			System.out.println("5 * " + gop + " = " + 5 * gop);
		}
		// 6단 출력
		for(int gop = 1; gop <= 9; gop++) {
			System.out.println("6 * " + gop + " = " + 6 * gop);
		}
		System.out.println("================================");
		// 4단 ~ 6단
		for(int dan = 4 ; dan <= 6 ; dan++) {
			for(int gop = 1; gop <= 9; gop++) {
				System.out.println(
				dan + " * " + gop + " = " + dan * gop);
			}
		}
		System.out.println("=================================");
		System.out.println("=================================");
		// 2단 5단 7단
		// 2단 출력 
		int dan = 2;
		for(int gop = 1; gop <= 9; gop++) {
			System.out.println(
					dan + " * " + gop + " = " + dan * gop);
		}
		dan = 5;
		for(int gop = 1; gop <= 9; gop++) {
			System.out.println(
					dan + " * " + gop + " = " + dan * gop);
		}
		dan = 7;
		for(int gop = 1; gop <= 9; gop++) {
			System.out.println(
					dan + " * " + gop + " = " + dan * gop);
		}
		// 반복적으로 정의해서 사용하는 코드가 있다면 한번만 정의해서 사용
		System.out.println("=================================");
		gugu(2);
		gugu(5);
		gugu(7);
	}
	// 메서드는 메서드 안에 정의할 수 없다.
	public static void gugu(int dan) { // 피호출 메서드 
		// 반복적인 코드를 메서드 안에 정의 
		for(int gop = 1; gop <= 9; gop++) {
			System.out.println(
					dan + " * " + gop + " = " + dan * gop);
		}
	}
	// 메서드의 역할 
	// 1. 값을 전달한다.
	// 2. 값을 받아온다.
	// 3. 반복적인 코드를 한번만 정의해서 사용할 수 있다.
}
