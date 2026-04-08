package vehiclemanager;

/**
 * Abstract base class for all vehicles
 * @author Oladimeji
 * @version 1.0
 * Description: Abstract Vehicle class with common attributes and abstract getDetails() method
 */

public abstract class Vehicle {

    // Attributes (private for encapsulation)
    private String make;
    private String model;

    /**
     * Constructor for Vehicle
     * @param make  the make of the vehicle
     * @param model the model of the vehicle
     */
    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    // Getters
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    // Setters
    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Abstract method - must be implemented by all subclasses (Car, Truck, Motorcycle)
     * @return String with vehicle details including the unique field
     */
    public abstract String getDetails();

    /**
     * toString() method - used by the GUI
     */
    @Override
    public String toString() {
        return make + " " + model;
    }
}