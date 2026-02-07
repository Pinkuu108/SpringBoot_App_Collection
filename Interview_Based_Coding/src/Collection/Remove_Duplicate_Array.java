package Collection;

import java.util.HashSet;
import java.util.Set;

public class Remove_Duplicate_Array {
	
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,1,2,3};
		Set<Integer> s=new HashSet<Integer>();
		for (Integer integer : a) {
			s.add(integer);
			
			
		}
		System.out.println(s);
	}

}
