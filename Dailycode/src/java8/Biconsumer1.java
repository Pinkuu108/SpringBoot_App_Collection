package java8;

import java.util.ArrayList;
import java.util.function.BiConsumer;

class student6
{
	String name;
	double salary;
	public student6(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
}

public class Biconsumer1 {
	public static void main(String[] args) {
		
		ArrayList<student6> a=new  ArrayList<student6>();
		populate(a);
		 BiConsumer<student6, Double> bc=(n,s)->n.salary=n.salary+s;
		 for (student6 s1 : a) {
			 bc.accept(s1, (double) 500);
			
		}
		 for (student6 s2 : a) {
			 System.out.println("Student name::"+s2.name);
			 System.out.println("Student Salary::"+s2.salary);
			 System.out.println();
			
		}
	}
	public static void populate(ArrayList<student6> b)
	{
		b.add(new student6("pinku", 4000));
		b.add(new student6("chinu", 5000));
		b.add(new student6("bidyut", 30000));
		b.add(new student6("lizun", 60000));
	}

}
