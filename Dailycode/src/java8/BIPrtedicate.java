package java8;

import java.util.function.BiPredicate;

public class BIPrtedicate {
	public static void main(String[] args) {
		BiPredicate<Integer, Integer> b=(a,c)->(a+c)%2==0;
		System.out.println(b.test(3, 8));
	}

}
