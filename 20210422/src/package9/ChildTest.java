package package9;

public class ChildTest {

	public static void main(String[] args) {
		Child child = new Child();
		Parent parent =  child;
		parent.method1();
		parent.method2();
		// parent.method3();
		// �ڵ� �� ��ȯ�� ���� �� �ڽ��� ������ �ִ� �޼���� �θ� ����� �� ����.
		

	}

}
