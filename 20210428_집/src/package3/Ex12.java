package package3;

public class Ex12 {
	String id;
	public Ex12(String id) {
		this.id = id;
	}
	public void checked(Object obj) {
		//obj�� Ex12�ϰ� ���İ� ����� ����
		if(obj instanceof Ex12) {
			System.out.println(this.id);
		} else {
			System.out.println(obj);
		}
	}
}
