package chap13;
import java.util.TreeMap;
import java.util.Iterator;

public class Example07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, String> cats = new TreeMap<Integer, String>();
		cats.put(7, "페르시안");
		cats.put(3, "러시안블루");
		System.out.println(cats);
		
		cats.put(5, "샴");
		System.out.println(cats);
		
		cats.replace(3, "래그돌");	//덮어씀
		System.out.println(cats);
		
		cats.remove(5);	//5없어짐
		System.out.println(cats);
		System.out.println(cats.size());	//배열 크기 2
		System.out.println(cats.get(7));	//key 7 = 페르시안
		System.out.print("(Key, Value) = ");
		
		Iterator<Integer> keys = cats.keySet().iterator();	//원하는 것만 추출할 때(강제)
		while (keys.hasNext()){	//값이 있으면 뽑고 없으면 멈춤. Iterator/while 같이 쓰는 경우 많음.
			int key = keys.next();
			System.out.print(" (" + key + ", " + cats.get(key) + ") ");
		}
	}

}
