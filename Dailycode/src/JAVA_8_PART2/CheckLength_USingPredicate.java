package JAVA_8_PART2;

import java.util.Collection;
import java.util.function.Predicate;

public class CheckLength_USingPredicate {

	public static void main(String[] args) {
	Predicate<String> p=s->(s.length()<3);
	System.out.println(p.test("Pinkuna"));
	//check this collection is empty or not 
	Predicate<Collection> p1=c->c.isEmpty();
	
	

	}

}
