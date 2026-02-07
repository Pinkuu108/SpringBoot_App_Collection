package Daily_Practice_Coding;

public class Create_NewThread_Implemeantes_RunnableInterface implements Runnable {
	public static void main(String[] args) {
		Create_NewThread_Implemeantes_RunnableInterface m=new Create_NewThread_Implemeantes_RunnableInterface();
		Thread t=new Thread(m);
		t.start();
		
		
	}

	@Override
	public void run() {
		System.out.println("New Thread");
		
	}

}
