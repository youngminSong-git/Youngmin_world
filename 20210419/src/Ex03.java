
public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2단 
		int dan = 2;
		for(int gop = 1; gop <= 9; gop++) {
			System.out.println(dan + " * " + gop +" = " + dan*gop);
		}
		//5단 
		dan = 5;
		for(int gop = 1; gop <= 9; gop++) {
			System.out.println(dan + " * " + gop + "=" +dan*gop);
		}
		//7단
		dan = 7;
		for(int gop = 1; gop <= 9; gop++) {
			System.out.println(dan + " * " + gop + "=" +dan*gop);
		}
		// 반복적인 코드가 있다면 한번만 정의해서 반복해서 사용할 수 있게 하자.
		System.out.println("================================");
		gugu(2);
		gugu(5);
		gugu(7);
	}
	public static void gugu(int dan) {
		for(int gop = 1; gop <= 9; gop++) {
			System.out.println(dan + " * " + gop + "=" +dan*gop);
		}
	}
}