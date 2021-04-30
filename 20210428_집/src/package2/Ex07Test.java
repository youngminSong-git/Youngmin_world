package package2;

public class Ex07Test {
	public static void main(String[] args) {
		Ex07 ex = new Ex07();

		try {
			ex.div();
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("idx는 2 이상이면 안됩니다.");
		} catch(NumberFormatException e) {
			System.out.println("숫자만 입력 가능합니다.");
		} catch(ArithmeticException e) {
			System.out.println("969776");
		} catch(Exception e){
			e.printStackTrace(); //예외처리 되었을 때 어떤게 오류인지 출력
		} finally {
			System.out.println("다시시작");
			
		}
	}
}
