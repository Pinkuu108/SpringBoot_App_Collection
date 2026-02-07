package java8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Arraylist_Comparator_LambdaExpression {

	public static void main(String[] args) {
	
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(12);
		a.add(121);
		a.add(0);
		a.add(54);System.out.println(a);
		Comparator<Integer> c= (l1,l2)->(l1<l2)?-1:(l1>l2)?1:0;
		Collections.sort(a,c);
		System.out.println(a);

	}

}
