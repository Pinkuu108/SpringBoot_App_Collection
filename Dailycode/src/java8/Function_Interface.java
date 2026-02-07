package java8;

import java.util.function.Function;

public class Function_Interface {
	public static void main(String[] args) {
		
		Function<Integer, Integer> f=i->i*i;
		System.out.println(f.apply(5));
		System.out.println(f.apply(9));
	}

}
