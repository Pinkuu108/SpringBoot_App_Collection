package Daily_Practice_Coding;

import java.util.HashSet;

public class Duplicate_Elemeant_Array_String_No5 {
	public static void main(String[] args) {

		String s[] = { "java", "c", "python", "java", "glang" };
		for (int i = 0; i < s.length; i++) {
			for (int j = i + 1; j < s.length; j++) {
				if (s[i].equals(s[j])) {
					System.out.println("Duplicate_Elemeant::" + s[i]);
				}
			}
		}
		System.out.println("====================================================");
		// Using HashSet
		HashSet<String> hs = new HashSet<String>();
		for (String string : s) {

			if (hs.add(string) == false) {
				System.out.println("Duplicate_Elemeant_Array_String_No5.main():::" + string);
			}

		}
		
		
		//remove duplicate Integer 
		Integer a[]= {1,2,3,4,5,6,6,7,7,3,8,8,9};
		HashSet<Integer> hs1=new HashSet<Integer>();
		for(int i=0;i<a.length;i++)
		{
		  hs1.add(a[i]);
		}
		System.out.println("Remove Duplicate Elemeantes::"+hs1);
			
		

	}

}
