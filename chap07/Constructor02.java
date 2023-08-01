package chap07;

public class Constructor02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("****학생주소록****");
		Student stObj1 = new Student();	//기본 생성자
		
		stObj1.insertRecord(20221004, "홍길순");
		stObj1.printInfo();
		
		Student stObj2 = new Student(20221005, "홍길동");	//일반 생성자
		stObj2.printInfo();
		
	}

}
