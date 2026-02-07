package java8;

class simple {

	public simple() {
		System.out.println("Simple Class Constructor Executed....");
	}

}

interface simpleinter {
	public simple get();
}

public class Constructor_Reference {
	public static void main(String[] args) {

		simpleinter s=simple::new;
		s.get();
	}
}
