package Collection;

import java.util.Arrays;
import java.util.List;

public class Traverse_List_USingJava8 {

	public static void main(String[] args) {
		List<String> l = Arrays.asList("Java", "python", "c", "golang");
		l.forEach(System.out::println);
	}
}
