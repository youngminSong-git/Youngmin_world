package package03;

import java.text.SimpleDateFormat;
import java.util.*;

public class Ex11Test {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		
		String strNow = now.toString(); //now.toString�� ����ϸ� ���ڿ��� �޾ƿ� �� ���� 
		System.out.println(strNow);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String strNow2 = sdf.format(now); //��¥�� ���ڿ��� ��ȯ�� �� ==> SimpleDateFormat, sdf.format(��¥)
		System.out.println(strNow2);
		
		sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		strNow2 = sdf.format(now);
		System.out.println(strNow2);
		
		sdf = new SimpleDateFormat("yyyy�� MM�� dd�� W�� HH�� mm�� ss�� SS");
		strNow2 = sdf.format(now);
		System.out.println(strNow2);
		
		
	}
}
