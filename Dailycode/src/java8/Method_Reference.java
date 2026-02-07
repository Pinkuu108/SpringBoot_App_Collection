package java8;
class pkk1
{
	
	public static void mm()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("Child Thread");
		}
	}
	}

public class Method_Reference {

	public static void main(String[] args) {
		
		Runnable r=pkk1::mm;
		
		Thread t=new Thread(r);
		t.start();
		for(int i=1;i<=10;i++)
		{
			System.out.println("Main Thread");
		}
	}
}
