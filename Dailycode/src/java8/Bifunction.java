package java8;

import java.util.ArrayList;
import java.util.function.BiFunction;

class Studentes
{
	int id;
	String name;
	public Studentes(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
}

public class Bifunction {

	public static void main(String[] args) {
		ArrayList<Studentes> l=new ArrayList<Studentes>();
		BiFunction<Integer, String, Studentes> b=(id,name)-> new Studentes(id, name);
		
		l.add(b.apply(2, "pinku"));
		l.add(b.apply(3, "chinu"));
		l.add(b.apply(4, "lizun"));
		l.add(b.apply(5, "bidyut"));
		l.add(b.apply(6, "santosh"));
		for (Studentes s1 : l) {
			System.out.println("Student name:::"+s1.id);
			System.out.println("Student id::"+s1.name);
			System.out.println();
			
		}

	}

}
