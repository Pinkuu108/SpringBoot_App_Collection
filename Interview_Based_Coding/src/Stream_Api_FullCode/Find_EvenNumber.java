package Stream_Api_FullCode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Find_EvenNumber {
	public static void main(String[] args) {
		List<Integer> l=Arrays.asList(1,2,3,4,5,6,7,8,9,0);
		List<Integer> collect = l.stream().filter(c->c%2==0).collect(Collectors.toList());
		System.out.println("Find_EvenNumber.main()::"+collect);
	}

}
