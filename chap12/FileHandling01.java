package chap12;
import java.io.File;

public class FileHandling01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File finfo = new File("C:\\eclipse\\workspace\\javabook\\src\\chap12\\Example01.java");
		
		if(finfo.exists()) {
			System.out.println("파일의 이름: " + finfo.getName());	//File 객체가 참조하는 파일이나 디렉토리의 이름을 반환.
			System.out.println("파일의 경로: " + finfo.getAbsolutePath());
			System.out.println("파일 쓰기가 가능한가?: " + finfo.canWrite());
			System.out.println("파일 읽기가 가능한가?: " + finfo.canRead());
			System.out.println("파일의 크기: " + finfo.length());
		}else {
			System.out.println("존재하는 파일이 아닙니다.");
		}
		
	}

}
