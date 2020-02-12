package WS1five;

/**
 * @author zyn
 * @description : this class is a implement of subscriptionInterface and it also is a sub-class of WS1five.Subscription
 * it has one variable address and the type of String
 *  it has its construors and the method of get and set
 *
 * @date 2019-11-15
 */

public class SubscriptionPrime extends Subscription implements SubscriptionPrimeInterface {
    //the address of WS1five.SubscriptionPrime
    String address;

    /*
     * @param String title
     * @param String email
     * @param int cost
     * @param String address
     * @description: constructor for WS1five.SubscriptionPrime
     */
    public SubscriptionPrime(String title, String email, int cost, String address) {
        super(title, email, cost);
        this.address = address;
    }
    /**
     *  getter for the address
     *  @return The address of the WS1five.SubscriptionPrime.
     */
    @Override
    public String getAddress() {
        return address;
    }
    /**
     * Setter method to the address of WS1five.SubscriptionPrime.
     * @param address the new address of WS1five.SubscriptionPrime.
     */
    public void setAddress(String address) {
        this.address = address;
    }
}
