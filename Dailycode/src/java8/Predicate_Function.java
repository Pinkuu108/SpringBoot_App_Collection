package java8;

import java.util.function.Predicate;

public class Predicate_Function {

	public static void main(String[] args) {
		
		String s[]= {"pinku","pk","bhubaneswwer","bhadrak","chinmayee"};
    Predicate<String> p=s1->s1.length()>4;
    for(String s1:s)
    {
    	if(p.test(s1))
    	{
    		System.out.println(s1);
    	}
    }
	}

}
