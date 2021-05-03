package package03;

import java.text.SimpleDateFormat;
import java.util.*;

public class Ex11Test {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		
		String strNow = now.toString(); //now.toString을 사용하면 문자열로 받아올 수 있음 
		System.out.println(strNow);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String strNow2 = sdf.format(now); //날짜를 문자열로 변환할 때 ==> SimpleDateFormat, sdf.format(날짜)
		System.out.println(strNow2);
		
		sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		strNow2 = sdf.format(now);
		System.out.println(strNow2);
		
		sdf = new SimpleDateFormat("yyyy년 MM월 dd일 W주 HH시 mm분 ss초 SS");
		strNow2 = sdf.format(now);
		System.out.println(strNow2);
		
		
	}
}
