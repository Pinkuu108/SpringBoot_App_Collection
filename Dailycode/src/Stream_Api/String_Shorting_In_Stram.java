package Stream_Api;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class String_Shorting_In_Stram {
	public static void main(String[] args) {
	
		ArrayList<String> l=new ArrayList<String>();
		l.add("PPPPP");
		l.add("PP");
		l.add("PPPPP");
		l.add("PPPP");
		l.add("P");
		l.add("PPP");
		System.out.println(l);
		Comparator<String> c= (s1,s2)->
		{
				int a1=s1.length();
				int a2=s2.length();
				if(a1<a2) return -1;
				else if (a1>a2) return 1;
				else return s1.compareTo(s2);
				 
		};
		 List<String> list = l.stream().sorted(c).collect(Collectors.toList());
		 System.out.println(list);
		}
	}


