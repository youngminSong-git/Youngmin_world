package package01;

public class Ex05 {
	public static void main(String[] args) {
		Ex02 ex1 = new Ex02("이름1");
		Ex02 ex2 = new Ex02("이름2");
		Ex02 ex3 = new Ex02("이름3");
		Ex04 ex4 = new Ex04();
		
		if(ex1.equals(ex2) == true) {
			System.out.println("ex1과 ex2는 같다.");
		} else {
			System.out.println("ex1과 ex2는 다르다");
		}
		if(ex1.equals(ex3) == true) {
			System.out.println("ex1과 ex3는 같다.");
		} else {
			System.out.println("ex1과 ex3는 다르다");
		}
		if(ex1.equals(ex4) == true) {
			System.out.println("같은 클래스로 만든 객체입니다.");
		} else {
			System.out.println("다른 클래스로 만든 객체입니다.");
		}
		
	}
}
