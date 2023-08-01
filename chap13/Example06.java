package chap13;
import java.util.HashMap;
import java.util.Iterator;

public class Example06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> cats = new HashMap<Integer, String>();
		cats.put(1, "페르시안");
		cats.put(2, "샴");
		System.out.println(cats);
		
		cats.put(3, "러시안블루");
		System.out.println(cats);
		
		cats.put(3, "래그돌");	//중복시 덮어씌움
		System.out.println(cats);
		
		cats.remove(1);	//1없어짐
		System.out.println(cats);
		
		System.out.println(cats.size());	//배열 크기 2
		System.out.println(cats.get(2));	//key 2 = 샴
		System.out.print("(Key, Value) = ");
		
		Iterator<Integer> keys = cats.keySet().iterator();	//원하는 것만 추출할 때(강제) Iterator ->배열에서도 쓸 수 있음. keySet - 위의 값 
		while (keys.hasNext()){	//값이 있으면 뽑고 없으면 멈춤. Iterator/while 같이 쓰는 경우 많음.
			int key = keys.next();
			System.out.print(" (" + key + ", " + cats.get(key) + ") ");
		}
		
	}

}
