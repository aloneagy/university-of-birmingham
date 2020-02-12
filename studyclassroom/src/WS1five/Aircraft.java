package WS1five;

/**
 * @author zyn
 * @description: The WS1five.Account class  has two field variables, passengerNumber,
 * maxSpeed of types int,int,
 * and it has constructor and the methods of get and set
 * @date 2019-11-12 15:28
 */

public class Aircraft {
    //the passengerNumber of WS1five.Aircraft
    int passengerNumber;
    //the maxSpeed of WS1five.Aircraft
    int maxSpeed;

    /*
     * @param int passengerNumber
     * @param int maxSpeed
     * @description: constructor for WS1five.Aircraft
     */
    public Aircraft(int passengerNumber, int maxSpeed) {
        this.passengerNumber = passengerNumber;
        this.maxSpeed = maxSpeed;
    }
    /**
     * Getter method to return the passengerNumber.
     * @return The passengerNumber of the account.
     */
    public int getPassengerNumber() {
        return passengerNumber;
    }
    /**
     * Setter method to the passengerNumber.
     * @param passengerNumber the new passengerNumber of the user.
     */
    public void setPassengerNumber(int passengerNumber) {
        this.passengerNumber = passengerNumber;
    }
    /**
     * Getter method to return the maxSpeed.
     * @return The maxSpeed.
     */
    public int getMaxSpeed() {
        return maxSpeed;
    }
    /**
     * Setter method to the maxSpeed.
     * @param maxSpeed the maxSpeed of the user.
     */
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    /**
     * Standard toString method to represent the object in a human
     * readable form.
     * @return String  The object in a human readable form.
     */
    @Override
    public String toString() {
        return "WS1five.Aircraft{" +
                "passengerNumber=" + passengerNumber +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
