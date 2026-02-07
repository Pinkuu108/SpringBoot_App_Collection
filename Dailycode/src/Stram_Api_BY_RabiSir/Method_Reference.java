package Stram_Api_BY_RabiSir;
class testt
{
	public  void m1()
	{
		//if you are not writting not satatic method , you should create object then call method reference
		for(int i=0;i<10;i++)
			
		{
			System.out.println("testt.m1()");
		}
	}
}

public class Method_Reference {

	public static void main(String[] args) {

		testt p=new testt();
    Runnable r=p::m1;
    Thread t=new Thread(r);
    t.start();
    for(int i=0;i<10;i++)
    {
    	System.out.println("Method_Reference.main()");
    }

	}

}
