package java8;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Student
{
	String name;
	int mark;
	public Student(String name, int mark) {
		super();
		this.name = name;
		this.mark = mark;
	}
	
}

public class Combination_Predicate__Function_Consumer {

	public static void main(String[] args) {
		
		
		Function<Student,String> f=s->
		{
			int mark=s.mark;
			String grade="";
			
			if(mark>=90) grade="A";
			else if(mark>=70) grade="B";
			else if(mark>=50) grade="C";
			else if(mark>=30) grade="D";
			else grade="FAIL";
			return grade;
		};
		
	    Predicate<Student> p=s->s.mark>=80;
		Consumer<Student> cs=c1->
		{
	      System.out.println("Student name::"+c1.name);
	      System.out.println("Student Mark::"+c1.mark);
	      System.out.println("Student Grade::"+f.apply(c1));
	      System.out.println();
		};
		Student []s= 
			{
				new Student("pinku",88),
				new Student("chinu",78),
				new Student("bidyut",77),
				new Student("lizun",67),
				new Student("santosh",98)
			};
		for (Student student1 : s) {
			if(p.test(student1))
			{
				cs.accept(student1);
			}
			
		}
		

	}

}
