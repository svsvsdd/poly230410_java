package chap12;
import java.io.File;
import java.io.FileWriter;

public class Example03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File file = new File("example03.txt");	//파일생성
			if(!file.exists())
				file.createNewFile();
			
			FileWriter myWriter = new FileWriter(file);
			
			myWriter.write("Hello!!\n");
			myWriter.write("Java Programming");
			myWriter.close();
			System.out.println("파일 쓰기 성공");
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
