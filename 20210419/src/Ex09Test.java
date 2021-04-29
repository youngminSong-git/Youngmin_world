
public class Ex09Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex09 ex = new Ex09(); // 오버로딩된 생성자 실행
		ex.setAge(16);
		ex.setHeight(175.5);
		ex.setName("이숭무"); // 객체 외부에 메서드 호출
		System.out.println(ex.getAge());
		System.out.println(ex.getHeight());
		System.out.println(ex.getName());
		Ex09 ex1 = new Ex09("이숭무", 25); // 오버로딩된 생성자 실행
		ex1.setHeight(175.5);
		System.out.println(ex1.getAge());
		System.out.println(ex1.getHeight());
		System.out.println(ex1.getName());	
	}
}