package chap12;
import java.io.File;
import java.io.FileInputStream;

public class Example04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File file = new File("example03.txt");	//파일생성
			if(!file.exists())
				file.createNewFile();
			
			FileInputStream fis = new FileInputStream(file);
			int i = 0;
			
			while((i = fis.read())!= -1) {
				System.out.print((char)i);	//char 형태로 읽어오기(i칸)
			}
			fis.close();
			System.out.println("\n파일 읽기 성공");
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
