package package01;

public class Ex04 {

	public static void main(String[] args) {
		try {
			Class.forName("java.util.Scanner");
			System.out.println("java.util.Scanner Ŭ������ �����մϴ�.");
		}catch(ClassNotFoundException e) {
			System.out.println("Ŭ������ �������� �ʽ��ϴ�.");
		}
		
		try {
			Class.forName("package01.Ex03");
			System.out.println("package01.Ex03 Ŭ������ �����մϴ�.");
		}catch(ClassNotFoundException e) {
			System.out.println("Ŭ������ �������� �ʽ��ϴ�.");
		}
		
		try {
			Class.forName("package01.Ex");
			System.out.println("package01.Ex Ŭ������ �����մϴ�.");
		}catch(ClassNotFoundException e) {
			System.out.println("package01.Ex  Ŭ������ �������� �ʽ��ϴ�.");
		}
	}

}
