package JAVA_8_PART2;

public class Method_Reference {
	public static void name() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("Child Thread");
		}

	}
	public static void main(String[] args) {
		Runnable r=Method_Reference::name;
		Thread t=new Thread(r);
		t.start();
		for (int i = 0; i <= 10; i++) {
			System.out.println("Main Thread");
		}
		
	}

}
