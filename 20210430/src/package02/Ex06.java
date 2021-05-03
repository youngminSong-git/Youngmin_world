package package02;

public class Ex06 {
	private String company,
				   os;
	public Ex06(String company, String os) {
		this.company = company;
		this.os = os;
	}
	public String getOs() {
		return this.os;
	}
	
	@Override
	public String toString() {
		return company + " , "  + os;
	}
	
	@Override
	public boolean equals(Object obj) {
		//obj와 현클래스가 같은지를 확인할 때 사용
		if(obj instanceof Ex06) {
			return true;
		} else {
			return false;
		}
	}
}
