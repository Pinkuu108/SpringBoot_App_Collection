package StreamApi_Using_ChatGpt;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Day2_UsingChat_Gpt {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(10, 5, 20, 15, 30, 5, 10, 40);
		List<String> list2 = Arrays.asList("pinku", "sai", "ram", "piku", "ram", "kittu", "sanjay");

//		long count = list.stream().count();
//		System.out.println("Total Number is::" + count);
//
//		list2.stream().filter(s->s.equals("pinku")).forEach(System.out::println);
//		list2.stream().map(s->s.toUpperCase()).forEach(System.out::println);

//		list.stream().filter(s->s%2==0).collect(Collectors.toList()).forEach(System.out::println);
//		list.stream().distinct().forEach(System.out::println);

//		int orElseThrow = list.stream().mapToInt(s->s).max().orElseThrow();
//		System.out.println(orElseThrow);
//		
//		int orElseThrow2 = list.stream().mapToInt(s->s).min().orElseThrow();
//		System.out.println(orElseThrow2);

//		list.stream().distinct().forEach(System.out::println);
		// list.stream().distinct().sorted().forEach(System.out::println);
//		list.stream().sorted((a,b)->b-a).forEach(System.out::println);

//		long count = list.stream().filter(s->s==5).count();
//		System.out.println(count);

		// list.stream().map(s->s*2).collect(Collectors.toList()).forEach(System.out::println);

//		Integer reduce = list.stream().reduce(0, (a, b) -> a + b);
//		System.out.println("Total Sum is ::" + reduce);
//		list.stream().map(s->s.toString()).forEach(System.out::println);

		// Part 2 For String
		// list2.stream().filter(s -> s.startsWith("p")).forEach(System.out::println);
		// list2.stream().filter(s -> s.length() > 4).forEach(System.out::println);
		//list2.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);
         
		//list2.stream().sorted().forEach(System.out::println);
//		long count = list2.stream().filter(s->s.equals("ram")).count();
//		System.out.println(count);
		//list2.stream().map(s->s.toUpperCase()).collect(Collectors.toList()).forEach(System.out::println);
		
		
		//list2.stream().filter(s->s.endsWith("u")).forEach(System.out::println);
		
//		list2.stream().filter(s->s.length()==4).forEach(System.out::println);
	

//		String orElse = list2.stream().max((a,b)->a.length()-b.length()).orElse(null);
//		
//		System.out.println(orElse);
		
		
//		String collect = list2.stream().collect(Collectors.joining(","));
//		System.out.println(collect);
//		
		
		Map<Character, List<String>> ll = list2.stream().collect(Collectors.groupingBy(s->s.charAt(0)));
		System.out.println(ll);
		
		
		
		
		
		
		
	}
}
