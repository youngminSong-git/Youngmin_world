
public class Ex01 {
	int num;
	String writer;
	String subject;
	String content;
	String enterDate;
	public Ex01() {} // 생성자  // default 생성자.
	// class이름과 같은 이름의 메서드를 생성자.
	// 생성자는 class내에 무조건 한개 이상 존재해야 한다.
	public Ex01(int num, String writet) {
		this.num = num;
		this.writer = writer;
	}
	// 멤버필드에 값을 전달하기 위해서 사용
	public void setNum(int num) {
		this.num = num;
	}
	// 멤버필드가 가진 값을 외부로 전해 줌.
	public int getNum() {
		return this.num;
	}
	// 내부에서 코드가 정의 되어 있는 메서드를 피호출 메서드라 한다.
	// return 문 뒤에 있는 값은 
	public void setWriter(String writer) {
		this.writer = writer; 
	}
	public String getWriter() {
		return this.writer;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getSubject() {
		return this.subject;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getConString() {
		return this.content;
	}
	public void setEnterDate(String enterDate) {
		this.enterDate = enterDate;
	}
	public String getEnterDate() {
		return this.enterDate;
	}
}
