package Stream_Api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class My_First_Code {

	public static void main(String[] args) {
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(0);
		a1.add(10);
		a1.add(5);
		a1.add(30);
		a1.add(25);
		a1.add(80);
		System.out.println(a1);
//		List<Integer> l=a.stream().filter(s->s%2==0).collect(Collectors.toList());
		List<Integer> l=a1.stream().map(s->s+5).collect(Collectors.toList());
		System.out.println(l);
	}
}
