
public class Ex01Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex01 ex = new Ex01();
		// Ex01()  // 생성자
		// 객체 생성을 할 때 무조건 생성자를 실행해서 객체 생성을 한다.
		// ()가 있으면 메서드라고 부른다.
		ex.setNum(1); 
// 실행코드를 가지고 있지 않고 메서드 명만 가지고 있는 메서드를 호출메서드라 함.  
		System.out.println(ex.getNum());
				
		Ex01 ex1 = new Ex01(1, "이숭무");
		// 생성자가 하는 역할은 객체생성시에 멤버필드에 값을 초기화 한다.
		
	}
}
