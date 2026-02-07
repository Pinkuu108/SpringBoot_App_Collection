package JAVA_8_PART2;

interface left
{
	default void m1()
	{
		System.out.println("Left Interface");
	}
}
interface right
{
	default void m1()
	{
		System.out.println("Right Interface");
	}
}
 class DefaultMethod_On_MultipleInterface implements left,right{
	@Override
	public void m1() {
		
		right.super.m1();
	}
	public static void main(String[] args) {
		DefaultMethod_On_MultipleInterface d = new DefaultMethod_On_MultipleInterface();
		d.m1(); // Output: Left Interface
		
	}

	
	

}
