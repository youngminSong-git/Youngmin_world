import java.io.FileReader;
import java.io.IOException;

public class Ex05 {
	public static void main(String[] args) {
		//filereader == 문자 단위로 읽어오게 됨
		FileReader fr = null;
		try {
			fr = new FileReader("d:\\java\\fileWriter.txt");
			int readChar;
			while((readChar = fr.read()) != -1) {
				System.out.println((char)readChar);
			}
		} catch(IOException e) {
			e.printStackTrace();//오류확인 소스;
		} finally {
			try {
				if(fr != null) {
					fr.close();
				}
			} catch(IOException e) {
				
			}
		}
	}
}
