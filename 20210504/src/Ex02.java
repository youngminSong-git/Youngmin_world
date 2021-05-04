import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("颇老阑 利绢 林技夸 : ");
		String fileName = sc.nextLine();
		FileWriter fw = null;
		try {
				fw = new FileWriter("d:\\java\\" + fileName);
				String msg = sc.nextLine();
				fw.write(msg);
			} catch(IOException e) {
				e.printStackTrace();
			} finally {
				if(fw != null) {
					try {
						fw.close();
					} catch(IOException e) {
						
					}
			}
			
		}
	
	}
}
