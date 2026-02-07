package Collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Hashset_UsingJava8 {

	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(11, 2, 3, 4, 5, 2, 3, 4, 10, 5, 6, 8);

		Set<Integer> s = new HashSet<Integer>();
		for (Integer integer : l) {
			s.add(integer);
		}
		s.forEach(System.out::println);
	}

}
