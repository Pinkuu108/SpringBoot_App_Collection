package Daily_Practice_Coding;

public class New_ThreadUsing_ThreadClass extends Thread{
	
	public void run()
	{
		System.out.println("Run method Executed And New Thrtead Created");
	}
	public static void main(String[] args) {
		New_ThreadUsing_ThreadClass t=new New_ThreadUsing_ThreadClass();
		t.start();
	}

}
