
public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum();
		sum();
		sum(10);
		sum(100);
		sum(1000);
		sum(5, 10);
	}
	// 메서드 오버로딩
	public static void sum(int start , int end) {
		int sum = 0;
		for(int i = start; i<=end; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
	public static void sum(int end) {
		int sum = 0;
		for(int i = 1; i <= end; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
	public static void sum() {
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
}
