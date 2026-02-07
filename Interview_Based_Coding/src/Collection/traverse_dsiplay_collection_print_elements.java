package Collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class traverse_dsiplay_collection_print_elements {

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		v.add("Mango");
		v.add("Orange");
		v.add("litchi");
		v.add("watermelon");
		v.add("sugarcane");
		v.add("guava");
		v.add("coconut");
		v.add("papaya");
		v.add("apple");
		v.add("Grapes");

		System.out.println("Using ForEach Loop");
		for (String string : v) {
			System.out.print(string + "||");
		}
		System.out.println("==============================================");
        System.out.println("Using tostring");
        System.out.println(v.toString());
        System.out.println("=========================================");
        System.out.println("Ordinary Forloop");
        for(int i=0;i<v.size();i++)
        {
        	System.out.print(v.get(i)+"+");
        }
        System.out.println("-----------------------------------");
        System.out.println("Using Enumeraction...");
        Enumeration<String> e=v.elements();
        while(e.hasMoreElements())
        {
        	System.out.print(e.nextElement()+" ");
        }
        System.out.println("--------------------------------");
        System.out.println("Using Iterrator....");
        Iterator<String> i=v.iterator();
        while(i.hasNext())
        {
        	System.out.print(i.next()+"--");
        }
        System.out.println("==================================");
        ListIterator<String> li=v.listIterator();
        
       System.out.println("Forword Direction....");
        while(li.hasNext())
        {
        	System.out.print(li.next()+"~");
        }
        System.out.println("BackWord Direction...");
        while(li.hasPrevious())
        {
        	System.out.print(li.previous()+"~~");
        }
        
        System.out.println("Using Methos Reference....");
        v.forEach(System.out::println);
	}
}
