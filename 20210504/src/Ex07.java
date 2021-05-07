
import java.io.*;
import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FileWriter fw = null;
		BufferedWriter bw = null;
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			System.out.println("파일 이름을 적어주세요.");
			String fileName = sc.nextLine();
			
			fw = new FileWriter("d:\\java\\" + fileName);
			bw = new BufferedWriter(fw);
			System.out.println("내용 입력해");
			System.out.println("입력이 끝나면 exit 적어주세요");
			
			while(true) {
				String msg = sc.nextLine();
				if(msg.equals("exit") == true) {
					break;
				}
				
				bw.write(msg);
				bw.newLine();
			}
			bw.flush();
			fr = new FileReader("d:\\java\\" + fileName);
			br = new BufferedReader(fr);
			String msg;
		}catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fw != null) fw.close();
				if(bw != null) bw.close();
				if(fr != null) fr.close();
				if(br != null) br.close();
			} catch(Exception e) {}
		}
	}
}
