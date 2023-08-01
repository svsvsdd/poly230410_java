package chap12;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class FileHandling03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("member.txt");
		
		try {
			if(!file.exists())
				file.createNewFile();
			FileWriter fw = new FileWriter(file);
			Scanner input = new Scanner(System.in);
			
			boolean quit = false;
			while (!quit) {	//참이면
				System.out.println("아이디 : ");
				String userID = input.next();
				fw.write("아이디 : " + userID + " ");
				System.out.println("이름 : ");
				String userName = input.next();
				fw.write("이름 : " + userName + "\n");
				
				System.out.println("계속 진행? Y | N");
				input = new Scanner(System.in);
				String str = input.nextLine();
				
				if (str.toUpperCase().equals("N"))	//소문자 입력시 대문자로 변환
					quit = true;
			}
			fw.close();
			System.out.println("파일 쓰기 성공");
		
		}catch(Exception e) {
			e.getMessage();
			
		}
		
		
	}

}
