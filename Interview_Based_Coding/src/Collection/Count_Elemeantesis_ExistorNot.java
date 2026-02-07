package Collection;

import java.util.Arrays;
import java.util.List;

public class Count_Elemeantesis_ExistorNot {

	public static void main(String[] args) {
		
		List<Integer> l=Arrays.asList(1,2,3,42,5,2,8,4,3,423,756,3,243);
		
//		//this progarm help me to find a number how many time repeat in this array
//		int num=1;
//		long cc = l.stream().filter(s->s.equals(num)).count();
//		System.out.println(cc);
		
		//shorting using java 8
		l.stream().sorted().forEach(System.out::println);

	}

}
