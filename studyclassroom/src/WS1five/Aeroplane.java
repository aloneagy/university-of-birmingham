package WS1five;

/**
 * @author zyn
 * @description : WS1five.Aeroplane is a sub-class of WS1five.Aircraft.
 * it has its own variable fuelConsumption whose type is double
 * and it has the methods of get ,set and toString
 * @date 2019-11-13
 */


public class Aeroplane extends Aircraft {
    // the fuelConsumption of WS1five.Aeroplane
    double fuelConsumption;
    /*
     * @param int passengerNumber
     * @param int maxSpeed
     * @param double fuelConsumption
     * @description: constructor for WS1five.Aeroplane
     */
    public Aeroplane(int passengerNumber, int maxSpeed, double fuelConsumption) {
        super(passengerNumber, maxSpeed);
        this.fuelConsumption = fuelConsumption;
    }
    /**
     * Getter method to return fuelConsumption of Aerplane.
     * @return The fuelConsumption of the Aerplane.
     */
    public double getFuelConsumption() {
        return fuelConsumption;
    }
    /**
     * Setter method to the fuelConsumption.
     * @param fuelConsumption .
     */
    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
    /**
     * Standard toString method to represent the object in a human
     * readable form.
     * @return String  The object in a human readable form.
     */
    @Override
    public String toString() {
        return "WS1five.Aeroplane{" +
                "fuelConsumption=" + fuelConsumption +
                ", passengerNumber=" + passengerNumber +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
