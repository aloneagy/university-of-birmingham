/**
 *  Class Expenditure is a class to represent expenditures.
 *  @version 2019-12-03
 *  @author TIANHE YANG
 */
public class Expenditure {
    /**
     * an expenditure with the two field variables private String description and private int value
     */
    private String description;
    private int value;

    /**
     * This constructor creates an expenditure from 2 parts: description and value
     * @param description the description of an expenditure
     * @param value the value of an expenditure
     */
    public Expenditure(String description, int value) {
        this.description = description;
        this.value = value;
    }

    /**
     * The method getDescription is to return the description of an expenditure.
     * @return the description of an expenditure
     */
    public String getDescription() {
        return description;
    }

    /**
     * The method getValue is to return the value of an expenditure.
     * @return the value of an expenditure
     */
    public int getValue() {
        return value;
    }

}
