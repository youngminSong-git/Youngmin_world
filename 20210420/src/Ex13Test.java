
public class Ex13Test {
// static�� ��������� ������ ��� ��ü�� �����ؼ� ����� �� �ִ� �������̴�.
// �ν��Ͻ� ������ ��ü�������� ��밡���� �����̹Ƿ� ������ �� ����.
	public static void main(String[] args) {
		Ex13 ex = new Ex13(); // c= 0 + 1 , count = 0 + 1 : 1
		System.out.println("ex.c : " + ex.c);
		System.out.println("ex.count : " + ex.count);
		Ex13 ex1 = new Ex13(); // c = 0 + 1 : 1,count = 1 + 1 :2
		System.out.println("ex1.c : " + ex1.c);
		System.out.println("ex1.count : " + ex1.count);
		Ex13 ex2 = new Ex13(); // c = 0 + 1 :1, count = 2 + 1 : 3 
		System.out.println("ex2.c : " + ex2.c);
		System.out.println("ex2.count : " + ex2.count);	
	}

}
