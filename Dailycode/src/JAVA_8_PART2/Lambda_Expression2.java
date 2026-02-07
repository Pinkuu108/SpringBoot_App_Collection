package JAVA_8_PART2;
interface interface1
{
	public abstract void m1(int a,int b);
	
}

public class Lambda_Expression2 {

	public static void main(String[] args) {
		
		interface1 i=(a,b)->System.out.println(a+b);
		i.m1(12, 6);
		
	}

}
