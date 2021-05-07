package package01;

import java.util.Scanner;

public class Ex02Test {
	public static void main(String[] args) {
		Ex01 ex = new Ex01();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("시작단 입력하세요.");
		int dan1 = sc.nextInt();
		
		System.out.println("끝단 입력하세요.");
		int dan2 = sc.nextInt();
		
		System.out.println("시작하는 곱셈 입력하세요.");
		int	gop1 = sc.nextInt();
		
		System.out.println("끝 곱셈 입력하세요.");
		int	gop2 = sc.nextInt();
		
		ex.gugu(dan1, dan2, gop1, gop2);
	}	
}
