package Java_8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Remove_Duplicate_FromList {

	public static void main(String[] args) {
		List<Integer> li=Arrays.asList(1,3,5,4,3,21,6,7,8,4,24);
		
		Set<Integer> s=new HashSet<Integer>();
		
		for (Integer itr : li) {
			s.add(itr);
		}
		
      System.out.print(s+" ");
	}

}
