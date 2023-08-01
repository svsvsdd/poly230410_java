package chap12;
import java.io.File;
import java.io.FileOutputStream;

public class Example02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello! Java Programming ";
		try {
			File file = new File("example02.txt");	//파일생성
			if(!file.exists())
				file.createNewFile();	//파일생성
			
			FileOutputStream fos = new FileOutputStream(file);	//파일 안에 내용 작성
			
			byte[] b = str.getBytes(); //str 바이트화 시켜서 
			fos.write(b);	//파일 안에 쓴 내용(b) 저장
			fos.close();	//후 닫기 - 메모리 아끼기 위함
			System.out.println("파일 쓰기 성공");
		}catch(Exception e) {
			e.getMessage();
		}
	}

}
