package Homework0420;

public class Student {
	int id;
	String name;
	
	Student(){	//기본 생성자
		System.out.println("기본 생성자 Student() 호출");
	}
	
	Student(int parm1, String parm2){	//일반 생성자 
		System.out.println("일반 생성자 Strudent(...) 호출");
		id = parm1;
		name = parm2;
	}	
		
	void insertRecord(int parm1, String parm2) {	//객체의 데이터를 변경
		id = parm1;
		name = parm2;
		
	}
	
	void printInfo() {
		System.out.println("아이디: " + id);
		System.out.println("이름: " + name);
	}
}
