import java.io.File;
import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//���ϻ���
		System.out.println("������ �����̸��� ��������.");
		String fileName = sc.nextLine();
		
		File file = new File("d:\\java\\" + fileName);
		if(file != null) {
			file.delete();
			System.out.println(fileName + "��(��) �����Ǿ����ϴ�.");
		} else {
			System.out.println("������ �������� �ʽ��ϴ�.");
		}
	}
}
