import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ex03 {
	public static void main(String[] args) {
		FileWriter fw = null; //파일을 읽어오는 자료형
		BufferedWriter bw = null;
		try {
			fw = new FileWriter("d:\\java\\bufferwriter1.txt");
			bw = new BufferedWriter(fw);
			bw.write("BufferedWriter 테스트");
			bw.newLine();
			bw.write("안녕하세요." + System.getProperty("line.separator"));
			bw.write("파일의 끝입니다.");
			bw.flush(); //글자 나타내게 만들어 주는 것
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
