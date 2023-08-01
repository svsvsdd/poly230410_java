package chap13;
import java.util.TreeSet;

public class Collection05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> str = new TreeSet<String>();
		
		str.add("A");
		str.add("B");
		str.add("C");
		System.out.println(str);
		
		System.out.print("TreeSet 요소 : ");
		for(String elements : str)	//str TreeSet의 각 요소에 대해 반복하는 향상된 for 루프
			System.out.print(elements + " ");
		
		String[] array = new String[str.size()];
		str.toArray(array);
		
		System.out.println();
		System.out.print("Array 요소 : ");
		for(int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
	}

}
