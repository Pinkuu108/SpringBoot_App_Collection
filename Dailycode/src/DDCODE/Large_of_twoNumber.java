package DDCODE;

import java.rmi.AccessException;



public class Large_of_twoNumber {

	public static void main(String[] args) 
	{
	Runnable r=()->{
		for(int i=0;i<10;i++)
		{
			System.out.println("Inside Runnable ");
		}
		
	};
	Thread t=new Thread(r);
	t.start();
	for(int i=0;i<10;i++)
	{
		System.out.println("Outside Runnable ");
	}
			
		
	}

}
