package chap12;
import java.io.File;
import java.io.FileOutputStream;

public class FileHandling02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("gugudan.txt");
		try {
			if(!file.exists())
				file.createNewFile();
			
			FileOutputStream fos = new FileOutputStream(file);	//파일 안에 내용 작성
			
			for(int x = 2; x <= 9; x++) {	//구구단 2단부터 시작
				for(int y = 1; y <= 9; y++) {
					String str = x + " X " + y + "= " + (x*y) + "\n";
					byte[] b = str.getBytes();	//str 바이트화 시켜서 
					fos.write(b);	//값을 쓰기
				}
			}
			fos.close();
			System.out.println("파일 쓰기 성공");
		}catch(Exception e) {
			e.getMessage();
		}
	}

}
