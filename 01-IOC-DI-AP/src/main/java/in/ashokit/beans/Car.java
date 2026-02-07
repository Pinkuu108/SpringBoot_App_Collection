package in.ashokit.beans;

public class Car {
    private IEngine engine;

    public Car() {
        System.out.println("Car Constructor...");
    }

    // Correct setter method
    public void setEngine(IEngine engine) {
        this.engine = engine;
    }

    public void drive() {
        int status = engine.start();
        if (status >= 1) {
            System.out.println("Journey Started...");
        } else {
            System.out.println("Engine Trouble...");
        }
    }
}
