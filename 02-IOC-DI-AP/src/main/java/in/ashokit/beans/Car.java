package in.ashokit.beans;

public class Car {
	private IEngine engine;

	public Car() {
		System.out.println(" no args Car Constructor is running...");

	}
	//pinku

	public Car(IEngine engine) {
		
		super();
		this.engine = engine;
		System.out.println("Args Constructors is Running");
	}


	public void setEngine(IEngine engine) {
		this.engine = engine;
		System.out.println("Setter is Running");
	}

	public void drive() {
		int status = engine.start();
		if (status >= 1) {
			System.out.println("jyourney Strted....");
		} else {
			System.out.println("Engine Failure....");
		}
	}

}
