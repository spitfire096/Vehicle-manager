package vehiclemanager;

/**
 * Car subclass extending Vehicle
 * @author Oladimeji
 * @version 1.0
 * Description: Car with numberOfDoors as extra unique field
 */

public class Car extends Vehicle {

    private int numberOfDoors;   // Unique attribute for Car

    /**
     * Constructor for Car
     * @param make          make of the car
     * @param model         model of the car
     * @param numberOfDoors number of doors
     */
    public Car(String make, String model, int numberOfDoors) {
        super(make, model);        // Call Vehicle constructor
        this.numberOfDoors = numberOfDoors;
    }

    /**
     * Implementation of abstract method from Vehicle
     */
    @Override
    public String getDetails() {
        return "Car: " + getMake() + " " + getModel() + " - Doors: " + numberOfDoors;
    }

    @Override
    public String toString() {
        return getDetails();
    }
}