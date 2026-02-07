package JAVA_8_PART2;
interface staticmethod
{
	public static void m1(int a,int b)
	{
		System.out.println("The Sum is ::"+(a+b));
	}
}
public class StaticMethod_Interface {
	public static void main(String[] args) {
		staticmethod.m1(22, 23);
	}

}
