package vehiclemanager;

/**
 * Motorcycle subclass extending Vehicle
 * @author Oladimeji
 * @version 1.0
 * Description: Motorcycle with engineType as extra unique field
 */

public class Motorcycle extends Vehicle {

    private String engineType;   // Unique attribute for Motorcycle

    /**
     * Constructor for Motorcycle
     * @param make       make of the motorcycle
     * @param model      model of the motorcycle
     * @param engineType engine type (e.g. V-Twin, Inline-4)
     */
    public Motorcycle(String make, String model, String engineType) {
        super(make, model);
        this.engineType = engineType;
    }

    @Override
    public String getDetails() {
        return "Motorcycle: " + getMake() + " " + getModel() + " - Engine: " + engineType;
    }

    @Override
    public String toString() {
        return getDetails();
    }
}
