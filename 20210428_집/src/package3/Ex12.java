package package3;

public class Ex12 {
	String id;
	public Ex12(String id) {
		this.id = id;
	}
	public void checked(Object obj) {
		//obj가 Ex12하고 같냐고 물어보는 질문
		if(obj instanceof Ex12) {
			System.out.println(this.id);
		} else {
			System.out.println(obj);
		}
	}
}
