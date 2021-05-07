import java.io.FileWriter;
import java.io.IOException;

public class Ex01 {
	public static void main(String[] args) {
		FileWriter fw = null; //FileWriter == 파일 저장을 할수 있게 만들어주는 자료형
		try {
			fw = new FileWriter("d:\\java\\fileWriter.txt");
			String msg = "안녕하세요.";
			fw.write(msg);
		} catch(IOException e) {
			e.printStackTrace();
			System.out.println("파일이 존재하지 않습니다.");
		} finally {
			if(fw != null) {
				try {
					fw.close();
				} catch(IOException e) {
					
				}
			}
		}
		
		/*
		  
		 */
	}
}
