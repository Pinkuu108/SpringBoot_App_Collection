package java8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

class pk{
	int no;
	String name;
	public pk(int no, String name) {
		super();
		this.no = no;
		this.name = name;
	}
	public String toString()
	{
		return no+":"+name;
	}
	
}

public class Comparable {

	public static void main(String[] args) {
		
  ArrayList<pk> p=new ArrayList<pk>();
  p.add(new pk(1,"pk"));
  p.add(new pk(2,"ak"));
  p.add(new pk(3,"pintu"));
  p.add(new pk(4,"chinu"));
  p.add(new pk(5,"finku"));
      System.out.println(p);
//      Collections.sort(p,(e1,e2)->(e1.no<e2.no)?-1:(e1.no>e2.no)?1:0);
      Collections.sort(p,(e1,e2)->e1.name.compareTo(e2.name));
      System.out.println(p);
	}

}
