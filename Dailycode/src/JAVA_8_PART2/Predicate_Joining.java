package JAVA_8_PART2;

import java.util.function.Predicate;

public class Predicate_Joining {

	public static void main(String[] args) {
		int a[]= {1,3,6,9,8,10,15,18};
		Predicate<Integer> p1=c->c>3;
		Predicate<Integer> p2=m->m%2==0;
		
//		System.out.println("The Number is Greter than 3 or not::");
//		m1(p1, a);
//		System.out.println("The Number is Even or Odd:: ");
//		m1(p2, a);
		System.out.println("Enter a number to check Both Condiction Check");
		m1(p1.and(p2),a);

	}
	public static void m1(Predicate<Integer> p,int[]a)
	{
		for (int i : a) {
			if(p.test(i))
			{
				System.out.print(i+" ");
			}
			
		}
	}

}
