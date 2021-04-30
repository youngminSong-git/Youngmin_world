package package02;

public class Ex10 {
	public static void main(String[] args) {
		System.out.println(System.nanoTime()); //현재시간 가져올때 사용
		long startTime = System.nanoTime();
		int sum = 0;
		for(int i = 1; i <= 100000; i++) {
			sum += i;
		}
		
		System.out.println("1~100000합 : " + sum);
		long endTime = System.nanoTime();
		System.out.println("실행 시간" + (endTime - startTime));
		
		startTime = System.currentTimeMillis();
		sum = 0;
		for(int i = 1; i <= 1000000; i++) {
			sum+=i;
		}
		
		System.out.println("1~100000까지 합 : " + sum);
		endTime = System.currentTimeMillis();
		System.out.println("실행 시간은 " + (endTime - startTime));
	}
}
