package java8;

import java.util.function.Function;

class findgrade {
	String name;
	Integer mark;

	public findgrade(String name, Integer mark) {
		super();
		this.name = name;
		this.mark = mark;
	}

}

public class Find_Grade_Function_Predicate {
	public static void main(String[] args) {

		Function<findgrade, String> f=s->
		{
			int mark=s.mark;
			String grade="";
			if(mark>=90) grade="O_Grade";
			else if(mark>=75) grade="A-Grade";
			else if(mark>=60) grade="B-Greade";
			else  grade="Filed";
			
			return grade;
		};
		findgrade s=  new findgrade("pinkuna",30);
		System.out.println(f.apply(s));
	}

}
