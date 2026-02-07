package Stram_Api_BY_RabiSir;

import java.util.function.UnaryOperator;

public class UnarryOpperator1 {

	public static void main(String[] args) {
	
		UnaryOperator<Integer> ii=p->p*p;
		System.out.println(ii.apply(9));
		
		System.out.println("=============================");
		UnaryOperator<String> str=s->s.concat("base");
		System.out.println(str.apply("data"));
		

	}

}
