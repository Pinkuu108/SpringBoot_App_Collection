package StreamApi_Using_ChatGpt;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class foirst_stcode {

	public static void main(String[] args) {
		
	List<Integer> list= Arrays.asList(1,1,2,3,4,2,3,4,5,6,7,8,9,0);
	
//		String str = "pinkuna";
//		str.chars().mapToObj(s -> (char) s).collect(Collectors.groupingBy(s -> s, Collectors.counting()))
//				.forEach((p, c) -> System.out.println(p + "-" + c));
//		2::Find Even Number

//		l.stream().filter(s->s%2==0).collect(Collectors.toList()).forEach(System.out::println);
		
		//3:: Find Odd Number
		//list.stream().filter(s->s%2!=0).forEach(System.out::println);
		
	     //4::Find max Number
//		Integer integer = list.stream().max(Integer::compare).get();
//		System.out.println("Max Number is ::"+integer);
	
	//5::Find The Min Number 
//	Integer integer = list.stream().min(Integer::compareTo).get();
//	System.out.println("min::"+integer);
	
	//list.stream().sorted().forEach(System.out::println);
	
	//list.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
	
	//list.stream().distinct().forEach(System.out::println);
//	int sum = list.stream().mapToInt(Integer::intValue).sum();
//	System.out.println(sum);
//	long count = list.stream().filter(s->s>5).count();
//	System.out.println(count);
	
	
	
	}

}
