package java8;

import java.util.function.Predicate;

public class Predicate_Using_OwnClass2 {
	public static void main(String[] args) {
		int a[]= {1,3,2,4,5,6,7,8,9,10};
		Predicate<Integer> p1=e->e%2==0;
		Predicate<Integer> p2=e->e>2;
		System.out.println("All Number");
		//System.out.println(p1.test(10));
//		for(Integer i1:a)
//		{
//			if(p1.and(p2).test(i1))
//			{
//				System.out.println(i1);
//			}
//			
//		}
	}

}
