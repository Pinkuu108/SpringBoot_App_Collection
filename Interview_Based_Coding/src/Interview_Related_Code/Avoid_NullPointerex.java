package Interview_Related_Code;

import java.util.Date;
import java.util.HashSet;

public class Avoid_NullPointerex {
	public static void main(String[] args) {
//		Date date=(Date) null;
//		date=new Date();
//		
//		System.out.println(date.getYear());
		
		int a[]= {1,4,4,4,5,5,9,9,8,80,0};
		HashSet<Integer> hs=new HashSet<Integer>();
		for(int i=0;i<a.length;i++)
		{
			hs.add(a[i]);
		}
		System.out.println("Avoid_NullPointerex.main()"+hs);
		
		String s="pinku";
		StringBuffer s1=new StringBuffer(s);
		System.out.println(s1.reverse());
		
		
	}
	

}
