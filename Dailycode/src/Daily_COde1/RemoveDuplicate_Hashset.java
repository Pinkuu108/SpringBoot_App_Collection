package Daily_COde1;

import java.util.HashSet;

public class RemoveDuplicate_Hashset {
	

public static void main(String[] args) {
int[] a= {1,6,7,8,3,0,9,9,9,4,3,3,3,3,};
	
	HashSet<Integer> hs=new HashSet<Integer>();
	
	for(int i=0;i<a.length;i++)
	{
		hs.add(a[i]);
	}
	System.out.print(hs);
}
}
