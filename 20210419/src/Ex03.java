
public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2�� 
		int dan = 2;
		for(int gop = 1; gop <= 9; gop++) {
			System.out.println(dan + " * " + gop +" = " + dan*gop);
		}
		//5�� 
		dan = 5;
		for(int gop = 1; gop <= 9; gop++) {
			System.out.println(dan + " * " + gop + "=" +dan*gop);
		}
		//7��
		dan = 7;
		for(int gop = 1; gop <= 9; gop++) {
			System.out.println(dan + " * " + gop + "=" +dan*gop);
		}
		// �ݺ����� �ڵ尡 �ִٸ� �ѹ��� �����ؼ� �ݺ��ؼ� ����� �� �ְ� ����.
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