package Array_Based;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		String s1 = "silent";
		String s2 = "listen";
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s1.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);

		boolean equals = Arrays.equals(ch1, ch2);
		if (equals == true) {
			System.out.println("It is Agagram");
		} else {
			System.out.println("Not A Anagram");
		}
	}
}
