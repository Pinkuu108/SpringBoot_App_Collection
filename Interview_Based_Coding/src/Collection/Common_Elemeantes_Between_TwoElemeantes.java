package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Common_Elemeantes_Between_TwoElemeantes {
public static void main(String[] args) {
	List<Integer> a=new ArrayList<>(Arrays.asList(1,2,3,5,4));
	List<Integer> b=Arrays.asList(3,4,5,6,7);
	a.retainAll(b);
	System.out.println(a);
}
}
