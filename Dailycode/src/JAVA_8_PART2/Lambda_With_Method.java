package JAVA_8_PART2;
interface interface12
{
	public void m1(int i);
	
}
public class Lambda_With_Method {

	public void m2(int x)
	{
		System.out.println("Method Reference is ::"+x);
	}
	public static void main(String[] args) {
		interface12 i=p->System.out.println("Lambda Expression::"+p+2);
		i.m1(6);
		Lambda_With_Method l=new Lambda_With_Method();
		interface12 l2=l::m2;
		l2.m1(10);
	}

}
