package package7;

import package6.Ex11;

public class Ex10 {
	public static void main(String [] args) {
		/*
		Ex09 ex = new Ex09(); // protected�� �ٸ� ��Ű������ ����� �� ����.
		ex.field = 10;
		ex.method();
		*/
		Ex11 ex1 = new Ex11();
		ex1.field = "abcd";
		ex1.method();
		
		Ex12 ex2 = new Ex12("�̼���");
		// protected�� �ʵ带 ��� ���� Ŭ���� �������� ����� �� ������ �ܺο����� ��� ����
		// ex2.field =  10;
		// ex2.method();
		ex2.print();
	}
}