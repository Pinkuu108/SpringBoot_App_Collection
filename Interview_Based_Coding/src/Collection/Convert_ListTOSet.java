package Collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Convert_ListTOSet {

	public static void main(String[] args) {
		List<String> l=Arrays.asList("java","c","python","golang","java");
		Set<String> s=new HashSet<String>(l);
		System.out.println("Convert_ListTOSet.main()"+s);
	}
}
