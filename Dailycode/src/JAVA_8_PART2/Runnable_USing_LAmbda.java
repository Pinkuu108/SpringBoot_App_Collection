package JAVA_8_PART2;

public class Runnable_USing_LAmbda {

	public static void main(String[] args) {
		Runnable r=()->{
			for(int i=0;i<=10;i++)
			{
				System.out.println("Child Method");
			}
		};
		Thread t=new Thread(r);
		t.start();
		for(int i=0;i<=10;i++)
		{
			System.out.println("Main Method");
		}

	}

}
