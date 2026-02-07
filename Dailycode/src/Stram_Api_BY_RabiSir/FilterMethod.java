package Stram_Api_BY_RabiSir;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class FilterMethod {

	public static void main(String[] args) {
//		ArrayList<Integer> l=new ArrayList<Integer>();
//		l.add(12);
//		l.add(1);
//		l.add(0);
//		l.add(8);
//		l.add(9);
//		l.add(45);
//		l.add(10);
//		System.out.println(l);
//		Set<Integer> collect = l.stream().filter(s->s%2==0).collect(Collectors.toSet());
//       System.out.println("FilterMethod.main()::"+collect);
//   	List<String> l1=Arrays.asList("java","python","c","golang");
//   	Stream<String> stream1=l1.stream();
//    List<String> list = Arrays.asList("Java", "Python", "C++");
//    Stream<String> stream12 = list.stream();
//    stream12.forEach(System.out::println);
		
		
//		List<Integer> l=Arrays.asList(5,10,20,30,40,50);
//		l.stream().filter(s->s>10).map(s->s*2).distinct().sorted().forEach(System.out::println);
   	
		
		ArrayList<Integer> l=new ArrayList<Integer>();
		l.add(2);
		l.add(0);
		l.add(4);
		l.add(6);
		l.add(9);
		l.add(7);
		System.out.println(l);
//		Integer integer = l.stream().max((a,b)->a.compareTo(b)).get();
//		
//		System.out.println("FilterMethod.main()::"+integer);
//		 l.stream().forEach(System.out::println);

		l.stream().forEach(a->{
			System.out.println("The Square is ::"+a*a);
		});
	}

}
