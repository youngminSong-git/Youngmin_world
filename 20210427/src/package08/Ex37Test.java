package package08;

public class Ex37Test {

	public static void main(String[] args) {
		String name = null;
		try {
			System.out.println(name.toString());
		}catch(NullPointerException e) {
			name= "�̼���";
			System.out.println(name.toString());
		}
	}

}
