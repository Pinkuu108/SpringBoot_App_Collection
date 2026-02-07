package Stream_Api;

import java.util.ArrayList;

public class MinAndAMAx_Stream {
	public static void main(String[] args) {
		ArrayList<Integer> l=new ArrayList<Integer>();
		l.add(11);
		l.add(1);
		l.add(1);
		l.add(1111);
		l.add(11111);
		l.add(111);
		System.out.println(l);
		Integer min=l.stream().min((s1,s2)->s1.compareTo(s2)).get();
		System.out.println(min);
		Integer max=l.stream().max((s1,s2)->s1.compareTo(s2)).get();
		System.out.println(max);
	}

}
