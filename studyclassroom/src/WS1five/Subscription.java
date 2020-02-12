package WS1five;

/**
 * @author zyn
 * @description : this class is a implement of subscriptionInterface;it has three variables
 * title,email and cost,and the types of String,String and cost. it has its own construors and
 * the methods of get and set
 *
 * @date 2019-11-15
 */

public class Subscription implements SubscriptionInterface {
    // the title of WS1five.Subscription
    String title;
    // the email of WS1five.Subscription
    String email;
    // the cost of WS1five.Subscription
    int cost;

    /*
     * @param String title
     * @param String email
     * @param int cost
     * @description: constructor for WS1five.Subscription
     */
    public Subscription(String title, String email, int cost) {
        this.title = title;
        this.email = email;
        this.cost = cost;
    }
    /**
     *  getter for the title
     *  @return The title of the WS1five.Subscription.
     */
    @Override
    public String getTitle() {
        return title;
    }
    /**
     * Setter method to the email of WS1five.Subscription.
     * @param title the new email of WS1five.Subscription.
     */
    public void setTitle(String title) {
        this.title = title;
    }
    /**
     *  getter for the email
     *  @return The email of the WS1five.Subscription.
     */
    @Override
    public String getEmail() {
        return email;
    }
    /**
     * Setter method to the email of WS1five.Subscription.
     * @param email the new email of WS1five.Subscription.
     */
    public void setEmail(String email) {
        this.email = email;
    }
    /**
     *  getter for the cost
     *  @return The cost of the WS1five.Subscription.
     */
    @Override
    public int getCost() {
        return cost;
    }
    /**
     * Setter method to the cost of the WS1five.Subscription.
     * @param cost the new cost of the WS1five.Subscription.
     */
    public void setCost(int cost) {
        this.cost = cost;
    }
}
