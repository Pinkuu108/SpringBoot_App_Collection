package Stream_Api;

import java.util.ArrayList;
import java.util.stream.Stream;

public class toArray {
	public static void main(String[] args) {
		ArrayList<Integer> l=new ArrayList<Integer>();
		l.add(11);
		l.add(1);
		l.add(1);
		l.add(1111);
		l.add(11111);
		l.add(111);
		System.out.println(l);
		Integer[] i=l.stream().toArray(Integer[]::new);
//		for (Integer integer : i) {
//			System.out.println(integer);
//		}
		Stream.of(i).forEach(System.out::println);
	}

}
