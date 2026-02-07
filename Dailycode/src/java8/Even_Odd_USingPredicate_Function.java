package java8;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Even_Odd_USingPredicate_Function {

	public static void main(String[] args) {
        
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(1);
		a.add(3);
		a.add(5);
		a.add(6);
		a.add(99);
		a.add(8);
		a.add(4);
		Predicate<Integer> p=e->e%2==0;
		
		for (Integer integer : a)
		{
			if(p.test(integer))
			{
				System.out.println(integer);
			}
		}
		
		
	}

}
