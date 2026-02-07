package JAVA_8_PART2;

import java.util.function.Predicate;

public class Predicate1 {
	public static void main(String[] args) {
		Predicate<Integer> p=l->(l>=2);
		System.out.println(p.test(0));
	}

}
