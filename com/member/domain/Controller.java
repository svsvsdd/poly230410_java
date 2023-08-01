package com.member.domain;
import java.util.Scanner;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;	//배열 재정렬 관련
import java.util.Comparator;
import java.util.Iterator;
import java.io.PrintWriter;


public class Controller  {
	
	
	
	Scanner s = new Scanner(System.in);
	ArrayList<Member> md = new ArrayList<Member>();
	String name, addr;
	int num = 1;
	int phone;
	String phoneString;
	
//	int[] num, phone;	//배열
//	int num, phone;
//	int count = 0;	//초기 숫자
	
	
	
	//이름 연락처 주소 전화번호
	//1.등록
	void memberJoin() {
		
//		num[count] = count + 1;	//
//		System.out.print("회원번호 : " + num[count]);  //회원번호는 자동으로 증가되도록 num = i+1
		System.out.println("회원번호 : " + this.num);  //회원번호는 자동으로 증가되도록 num = i+1
		System.out.print("이름 : ");  
		this.name = s.nextLine();
		
	
		System.out.print("연락처 : ");  
	//	this.phone = s.nextInt();
	//	s.nextLine(); // 추가 s.nextInt() 메소드는 엔터(\n)키를 입력받지 않고 숫자만 입력받기 때문에, s.nextInt()로 입력받은 후에 바로 s.nextLine()으로 개행문자를 제거해주어야 함
		String phoneString = s.next(); // 문자열로 입력받기
		
		
		try {	//예외처리
			this.phone = Integer.parseInt(phoneString); // 입력받은 값이 int형이라면 진행
			s.nextLine();
	    } catch (NumberFormatException e) {	//아니면 예외처리
	        System.out.println("잘못 입력되었습니다. 다시 입력하세요");
	        s.nextLine();
	        memberJoin();	//다시 입력하도록 돌아감 - 이대로 진행하면 catch 블록 이후 코드가 계속 실행되어 아래 주소 입력창이 한번 더 출력되는 문제가 생김. 
	        
	    }
		
		System.out.print("주소 : "); 
		this.addr = s.nextLine();

		
		md.add(new Member(this.num, this.name, this.phone, this.addr));	//  배열 형식으로 저장
//		md.add(new Member(num[count], name, phone[count], addr));
//		md.add(new Member(new int[] {num}, new String[] {name}, new int[] {phone}, new String[] {addr}));	//[]  배열 형식으로 저장하려는데
		System.out.print("회원가입이 완료되었습니다\n");

		this.num++;	//다음 회원번호 증가
		}
	
	
	
	
	//2. 조회
	void search() {
	    System.out.print("조회할 회원번호 입력 : ");
	    int searchNum = s.nextInt();
	    s.nextLine();

	    boolean found = false;
	    for (Member m : md) {
	        if (m.getNum() == searchNum) {  // m.getNum()[0] 배열의 첫번째 요소가 입력한 회원번호와 일치하는 Member 객체를 찾음
	            System.out.println(m.toString1());  // 일치하는 객체의 정보 출력
	            found = true;
	            break;
	        }
	    }

	    if (!found) {
	        System.out.println("해당 회원번호를 가진 회원이 존재하지 않습니다.");
	    }
	}
	
	
	
	
	//3. 수정 md.set()
	void edit() {
		System.out.print("수정할 회원번호 입력 : ");		//회원번호 num 입력하면   이름 번호 주소 수정되도록
		int editNum = s.nextInt();
		s.nextLine();
		
		boolean found = false;	//해당 회원번호를 가진 회원이 존재하는가?"를 검사하기 위한 변수입니다. 초기값을 false로 설정하여, 처음에는 해당 회원번호를 가진 회원이 존재하지 않았다는 것을 의미
    	for (Member m : md) {
       	 	if (m.getNum() == editNum) {  // 일치하는 회원 정보를 찾았을 때, 해당 회원 정보 수정
       	 		System.out.print("수정할 이름을 입력하세요 : ");
                String nameInput  = s.nextLine();
                if (!nameInput.isEmpty()) {
                    m.setName(nameInput);
       	 			}	
                
                System.out.print("수정할 전화번호를 입력하세요 : ");
                String phoneInput = s.nextLine();		//원래 int로 받던걸 문자열로 변환
                if (!phoneInput.isEmpty()) {		//문자열 빈칸인지 확인(아니면)
                    m.setPhone(Integer.parseInt(phoneInput));	//입력받은 문자열(숫자) int로 변환
                } else {
                    m.setPhone(m.getPhone()); // 이전값 가져오기 (int)  이거 빠지면 입력값을 string으로 받아서 자료형이 달라짐.
                }
		
              
                System.out.print("수정할 주소를 입력하세요 : ");
                String addrInput  = s.nextLine();
                if (!addrInput.isEmpty()) {
                    m.setAddr(addrInput);
                }

                System.out.println("회원 정보 수정이 완료되었습니다.");
                found = true;
                break;
       	 	}
    	}
        
//    	boolean found = false;		//md.set로 변경하는 방법
//        for (int i = 0; i < md.size(); i++) {
//            Member m = md.get(i);
//            if (m.getNum() == editNum) {
//                System.out.print("수정할 이름을 입력하세요 : ");
//                String nameInput = s.nextLine();
//                System.out.print("수정할 전화번호를 입력하세요 : ");
//                int phoneInput = s.nextInt();
//                s.nextLine();
//
//                // ArrayList의 set() 메소드를 사용해 회원 정보 변경
//                md.set(i, new Member(editNum, nameInput, phoneInput));
//                System.out.println(editNum + "번 회원 정보가 수정되었습니다.");
//                found = true;
//                break;
//            }
//        }
    
    	

        if (!found) {
            System.out.println("해당 회원번호를 가진 회원이 존재하지 않습니다.");
            
        }
    }
      	 	
		
		

	//4. 삭제			md.remove(m)		삭제한 뒤에 배열 재정렬하려면 sort()메소드 사용하면 됨.
	void delete() {
		System.out.print("삭제할 회원번호 입력 : ");		//회원번호 num 입력받으면
		int deleteNum = s.nextInt();						//[num-1] 값을 remove
		s.nextLine();
		
		boolean found = false;	//해당 회원번호를 가진 회원이 존재하는가?"를 검사하기 위한 변수입니다. 초기값을 false로 설정하여, 처음에는 해당 회원번호를 가진 회원이 존재하지 않았다는 것을 의미
		// 삭제된 요소의 인덱스를 md에서 제거
		for (Member m : md) {
		    if (m.getNum() == deleteNum) {
		        md.remove(m);
		        found = true;
	            
		     // 삭제한 이후에 남은 회원들의 회원번호를 재할당합니다.
		        for (int i = 0; i < md.size(); i++) {
		            Member member = md.get(i);
		            member.setNum(i + 1);
		        }

		        // 회원번호순으로 정렬합니다.
		        Collections.sort(md, new Comparator<Member>() {
		            @Override
		            public int compare(Member m1, Member m2) {
		                return Integer.compare(m1.getNum(), m2.getNum());
		            }
		        });
		        break;
		    }
		}
		if (!found) {
	         System.out.println("해당 회원번호를 가진 회원이 존재하지 않습니다.");
		}
	}
	
		
	
	//5. 목록
	void list() {
	//	Member m = new Member();
		System.out.println("정보 목록을 출력합니다.");	
	//    System.out.println(m.toString1());  // 객체의 정보 출력
	    for (Member m : md) {
	        System.out.println(m.toString1()); // output member information
	    }
	    
		
		
		
		
	/*	
		Iterator<Member> itr = md.iterator();
		
		while(itr.hasNext()) {
			// toString을 출력
			System.out.print(itr.next() + " ");
		}*/
	}
	
	
	
	
	//6. 파일출력		//파일생성도 추가
	void printFile() {
		System.out.println("파일을 출력합니다.");	
		
	/*	File fileObj = new File("MemberList.txt");
		try {
			boolean success = fileObj.createNewFile();	//파일생성
			if(success) {
				System.out.println("파일 생성 성공");
			}else {
				System.out.println("파일 생성 실패");
			}
		}catch(IOException e) {
			System.out.println(e);
		}
		
		
		
		
		String str = Member.toString2();
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
		}*/
		
		try {
		    PrintWriter writer = new PrintWriter("MemberList.txt", "UTF-8");	//UTF-8 한글이 포함되어서 추가함.
		    for (Member m : md) {
		        writer.println(m.toString2());
		    }
		    writer.close();
		    System.out.println("MemberList.txt 저장됨.");
		} catch (IOException e) {
		    System.out.println("오류 : MemberList.txt 저장되지 않음.");
		}
		
		
		
		for (Member m : md) {
	        System.out.println(m.toString2()); // output member information
	    }
	 
	}
	
	
	
	
	
	//7. 종료
	void exit() {
		System.out.println("프로그램을 종료합니다.");	
		
	}
}	
	
