package Java_8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class All_In_One {

	public static void main(String[] args) {
		List<Integer> li=Arrays.asList(1,11,3,8,4,9,2,5,6,5,7);
		List<Integer> li1=Arrays.asList(22,33,44,55,9,2,5,6,5,7);
		List<String> ls=Arrays.asList("a","ccc","ddddd","ff","gggggg","hh","i","s","p");
		
		
		
		//Question: Find common elements between two lists
		//li.stream().filter(li1::contains).forEach(System.out::println);
		
		
		
		
		//convert List to Map
		//li.stream().collect(Collectors.toMap(obj->obj.getid(), obj->obj.getname()));
		
			
		//Numbers starting with digit 1
		//li.stream().map(String::valueOf).filter(s->s.startsWith("1")).forEach(System.out::println);
		
		
		
		
		//Sort strings by length
		//ls.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);
		
		
		
		//Group strings by length
		Map<Integer, List<String>> leng = ls.stream().collect(Collectors.groupingBy(String::length));
		//System.out.println(leng);
		
		
		//Count frequency of each element
		Map<Integer, Long> count = li.stream().collect(Collectors.groupingBy(s->s,Collectors.counting()));
		//System.out.println(count);
		
		
		//find Duplicate
		Set<Integer> s=new HashSet<Integer>();
		//li.stream().filter(p->!s.add(p)).collect(Collectors.toList()).forEach(System.out::println);
		
		
		
		//Find Second Heigest Number
		Integer second = li.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		//System.out.println(second);

		
		//Sum of List
		int sum = li.stream().mapToInt(Integer::intValue).sum();
		//System.out.println("List sum is ::"+sum);
		
		
		//Find Max  && Min
		Integer max = li.stream().max(Integer::compareTo).get();
		Integer min = li.stream().min(Integer::compareTo).get();
       // System.out.println("Max::"+max);
       // System.out.println("Min::"+min);
	}

}
