package JAVA_8_PART2;

import java.util.function.Function;

public class Function_Interface {
	public static void main(String[] args) {
		Function<String, Integer> f=p->p.length();
		System.out.println("Length of this name is ::"+f.apply("PINKUNAPRUSTY"));
	}

}
