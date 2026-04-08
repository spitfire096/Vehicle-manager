package vehiclemanager;

/**
 * Truck subclass extending Vehicle
 * @author Oladimeji
 * @version 1.0
 * Description: Truck with loadCapacity as extra unique field
 */

public class Truck extends Vehicle {

    private double loadCapacity;   // Unique attribute for Truck (in tons)

    /**
     * Constructor for Truck
     * @param make         make of the truck
     * @param model        model of the truck
     * @param loadCapacity load capacity in tons
     */
    public Truck(String make, String model, double loadCapacity) {
        super(make, model);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String getDetails() {
        return "Truck: " + getMake() + " " + getModel() + " - Load Capacity: " + loadCapacity + " tons";
    }

    @Override
    public String toString() {
        return getDetails();
    }
}
