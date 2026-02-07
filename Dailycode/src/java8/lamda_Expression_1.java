package java8;
@FunctionalInterface
 interface interf
  {
	  public void m1(int a,int b);
	  
  }


public class lamda_Expression_1

{
	public static void main(String[] args) 
	{
    interf d=(a,b)->System.out.println(a+b);;
    d.m1(1,3);
	}

}
