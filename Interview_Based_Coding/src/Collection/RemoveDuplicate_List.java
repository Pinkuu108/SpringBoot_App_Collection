package Collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicate_List {

	public static void main(String[] args) {
		List<Integer> l=Arrays.asList(1,2,3,4,4,4,5,5,5,2);
		HashSet<Integer> hs=new HashSet<Integer>(l);
		System.out.print(hs);
	}
}
