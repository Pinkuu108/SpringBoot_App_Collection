package Daily_COde1;

import java.util.HashSet;

public class Remove_Duplicate_Using_HashSet {
	public static void main(String[] args) {
		HashSet<Integer> hs=new HashSet<Integer>();
		
		int a[]= {1,9,7,0,4,3,8,9,9,9,2,2,5};
		
		for(int i=0;i<a.length;i++)
		{
			hs.add(a[i]);
		}
		System.out.println(hs);
		
	}

}
