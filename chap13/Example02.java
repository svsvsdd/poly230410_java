package chap13;
import java.util.LinkedList;

public class Example02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> cats = new LinkedList<String>();
		
		cats.add("러시안블루");
		cats.addFirst("페르시안");
		cats.addLast("래그돌");
		System.out.println(cats);
		
		cats.add(1, "샴");	//삽입
		System.out.println(cats);
		
		cats.set(2, "코리안쇼트헤어");	//수정
		System.out.println(cats);
		
		cats.removeFirst();	//첫번째 제거
		cats.removeLast();	//마지막 제거
		System.out.println(cats);
		
		cats.remove(1);	//[1] 제거
		System.out.println(cats);
		System.out.println(cats.size());
		System.out.println(cats.get(0));
		System.out.println(cats.contains("샴"));
		System.out.println(cats.indexOf("샴"));
		
	}

}
