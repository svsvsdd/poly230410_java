package chap04;

public class Ex4_3 {

	
	public static void main(String[] args) {
	    for(int i = 1; i < 10; i=i+3) {		//i 가 1부터 3씩 증가. -첫 줄이 시작값이 1 4 7로 시작
	    	System.out.println("******************************************");
			System.out.println("구구단 " + i + " 단" + "	구구단 " + (i + 1) + " 단" + "	구구단 " + (i + 2) + " 단");
			System.out.println("******************************************");
	        for(int j = 1; j < 10; j++) {	//j 가 1-9까지 증가. 각 단수를 - *1~*9까지 표기
	            for(int k = i; k < i+3; k++) {	//k는 i부터 i+2까지 1씩 증가 k단을 출력함. i가 1 4 7이니 1~3, 4~6, 7~9까지 반복
	                System.out.print(k + " * " + j + " = " + k*j + "\t");	//\t 탭을 써서 3개이 단을 구분함. println 쓰면 k증가시 줄바꿔버림
	            }
	            System.out.println();	//위의 print 에서 바뀌지 않았던 줄을 바꿔줌 없을시 3단씩 끊어서 줄이 안바뀌고 한줄에 전부 표기
	        } 
	        System.out.println();	//한 단이 완료되면 한줄 띄워줌
	    }	    	    
	}
}	
	
/*	
		for(int i = 1; i<10; i=i+3){
			System.out.println("**");
			System.out.println("구구단 " + i + " 단" + "	구구단 " + i+1 + " 단" + "	구구단 " + i+2 + " 단");
			System.out.println("**");
			for(int j = 1; j<10; j++);
				for(int k = i; k < i+3; k++){
					System.out.print(k + " * " + j + " = " + k*j + "\t");
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i < 10; i++){
			System.out.println("************");
			System.out.println("구구단 " + i + " 단");
			System.out.println("************");
			
			for(int j = 1; j < 10; j++){
				System.out.println(i + " * " + j + " = " + i*j);
			}		
		}
		System.out.println("************");
	}
}
----------------------------------------------
---------------------------------


public static void main(String[] args) {
    for(int i = 1; i < 10; i+=3) {
        System.out.println("**********");
        for(int j = 1; j < 10; j++) {
            for(int k = i; k < i+3; k++) {
                System.out.print(k + " * " + j + " = " + k*j + "\t");
            }
            System.out.println();
        }
    }
    System.out.println("**********");
}
*/