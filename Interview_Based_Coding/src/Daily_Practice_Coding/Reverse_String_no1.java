package Daily_Practice_Coding;

import java.util.Scanner;

public class Reverse_String_no1 {

	public static void main(String[] args) {
		String s="Hello World";
		String rev="";
		int len=s.length();
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println("Reverse_String.main()::"+rev);
		
		//Using StringBuffer
		String s1="Hello Pinku";
		StringBuffer st=new StringBuffer(s1);
		System.out.println("Reverse_String.main()::"+st.reverse());
	}

}
