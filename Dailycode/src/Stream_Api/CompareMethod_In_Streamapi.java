package Stream_Api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CompareMethod_In_Streamapi {
	public static void main(String[] args) {

		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(12);
		l.add(0);
		l.add(2);
		l.add(6);
		l.add(23);
		l.add(33);
		System.out.println(l);
		List<Integer> sortedlist=l.stream().sorted((l1,l2)->-l1.compareTo(l2)).collect(Collectors.toList());
		System.out.println(sortedlist);
	}

}
