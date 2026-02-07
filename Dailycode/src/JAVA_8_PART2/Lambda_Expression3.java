package JAVA_8_PART2;
interface interface2
{
	public abstract int  square(int a);
}
public class Lambda_Expression3 {

	public static void main(String[] args) {
		interface2 i=(a)->a*a;
		System.out.println("Square is ::"+i.square(5));

	}

}
