
public class Ex01 {
	int num;
	String writer;
	String subject;
	String content;
	String enterDate;
	public Ex01() {} // ������  // default ������.
	// class�̸��� ���� �̸��� �޼��带 ������.
	// �����ڴ� class���� ������ �Ѱ� �̻� �����ؾ� �Ѵ�.
	public Ex01(int num, String writet) {
		this.num = num;
		this.writer = writer;
	}
	// ����ʵ忡 ���� �����ϱ� ���ؼ� ���
	public void setNum(int num) {
		this.num = num;
	}
	// ����ʵ尡 ���� ���� �ܺη� ���� ��.
	public int getNum() {
		return this.num;
	}
	// ���ο��� �ڵ尡 ���� �Ǿ� �ִ� �޼��带 ��ȣ�� �޼���� �Ѵ�.
	// return �� �ڿ� �ִ� ���� 
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
