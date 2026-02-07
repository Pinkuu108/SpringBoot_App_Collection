package java8;

import java.util.function.Predicate;

public class Predicate_Interface {

	public static void main(String[] args) {
		int []a= {0,9,8,6,4,3,24,7};
		Predicate<Integer> p=i->i%2==0;
		for (int j : a) {
			if(p.test(j))
			{
				System.out.println(j);
			}
			
		}
		

	}

}
