package chap12;
import java.io.File;
import java.io.FileInputStream;

public class FileHandling04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("gugudan.txt");
		try {
			if(!file.exists())
				file.createNewFile();
			
			FileInputStream fis = new FileInputStream(file);
			int i = 0;
			
			while ((i = fis.read()) != -1) {
				System.out.print((char) i);	//순서대로 char 읽어옴
			}
			fis.close();
			System.out.println("파일 읽기 성공");
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
