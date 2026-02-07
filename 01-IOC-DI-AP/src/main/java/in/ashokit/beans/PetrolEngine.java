package in.ashokit.beans;

public class PetrolEngine implements IEngine {

    public PetrolEngine() {
        System.out.println("PetrolEngine Constructor...");
    }

    @Override
    public int start() {
        System.out.println("Petrol Engine started...");
        return 1;
    }
}
