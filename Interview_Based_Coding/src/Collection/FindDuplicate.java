package Collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicate {
	public static void main(String[] args) {
		/* List<Integer> l=Arrays.asList(1,2,3,4,5,1,3); */
		int a[] = { 12, 22, 23, 44, 55, 12, 45, 44 };
		Set<Integer> s = new HashSet<Integer>();

		for (Integer intt : a) {

			if (!s.add(intt)) {
				System.out.println("Duplicate Elemeant is :::" + intt);
			}

		}
	}
}
