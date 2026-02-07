package java8;

import java.util.function.Function;

public class Function_Interface2 {
	public static void main(String[] args) {
		
		//check this name length
		Function<String, Integer> f=i->i.length();
		System.out.println(f.apply("pinkuna"));
		
		Function<String, String> f2=i->i.toUpperCase();
		System.out.println(f2.apply("bidyutlata-prusty"));
	}

}
