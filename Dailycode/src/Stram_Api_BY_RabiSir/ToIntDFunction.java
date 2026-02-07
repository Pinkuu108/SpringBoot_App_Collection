package Stram_Api_BY_RabiSir;

import java.util.ArrayList;
import java.util.function.ToIntFunction;

public class ToIntDFunction {

	//This is a Predefined class Interdued in java 16
	record Employee(String name,int yearorexpe) {}
	
	public static void main(String[] args) {
	

		ArrayList<Employee> e=new ArrayList<Employee>();
		e.add(new Employee("pinku", 3));
		e.add(new Employee("chinu", 3));
		e.add(new Employee("bidyut", 12));
		e.add(new Employee("santosh", 18));
		e.add(new Employee("sohan", 1));
//		System.out.println(e);
		
		ToIntFunction<Employee> t=s->s.yearorexpe();
		int totalyearofexperiance=e.stream().mapToInt(t).sum();
		System.out.println("ToIntDFunction.main()::"+totalyearofexperiance);
		
		
	}

}
