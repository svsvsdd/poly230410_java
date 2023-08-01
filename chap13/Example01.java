package chap13;
import java.util.ArrayList;

public class Example01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> cats = new ArrayList<String>();	//string 형태로 강제
		
		cats.add("페르시안");	//값을 집어넣음
		cats.add("null");
		System.out.println(cats);
		
		cats.add(1, "샴");	//행렬 [1]에 추가 (1, "샴") (오버로딩 - 값이 2개들어감)
		System.out.println(cats);
		
		cats.set(2, "러시안블루");	//행렬 [2]에 수정 덮어씀
		System.out.println(cats);
		
		cats.remove("페르시안");	//페르시안 삭제
		System.out.println(cats);
		
		cats.remove(1);	//행렬 [1] 삭제 
		System.out.println(cats);
		
		System.out.println(cats.size());
		System.out.println(cats.get(0));
		System.out.println(cats.contains("샴"));	//샴 있는지
		System.out.println(cats.indexOf("샴"));	//샴 위치
		
	}

}
