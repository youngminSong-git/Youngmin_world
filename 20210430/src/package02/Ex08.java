package package02;

public class Ex08 {
	public static void main(String[] args) {
		Ex06 ex1 = new Ex06("이름1", "aor");
		Ex06 ex2 = new Ex06("이름2", "aor2");
		Ex07 ex3 = new Ex07();
		if(ex1.equals(ex2)) {
			System.out.println("같은클래스");
		} else {
			System.out.println("다른클래스");
		}
		if(ex1.equals(ex3)) {
			System.out.println("같은클래스");
		} else {
			System.out.println("다른클래스");
		}
		
		String str = ex1.toString();
		System.out.println(str);
		str = ex2.toString();
		System.out.println(str);
	}
}
