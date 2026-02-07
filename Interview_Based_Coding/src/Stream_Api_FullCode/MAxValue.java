package Stream_Api_FullCode;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MAxValue {
	public static void main(String[] args) {
		List<Integer> i=Arrays.asList(1,2,3,4,5,6,7,8,9,0);
		Optional<Integer> max = i.stream().max(Integer::compareTo);
		System.out.println(max);
	}

}
