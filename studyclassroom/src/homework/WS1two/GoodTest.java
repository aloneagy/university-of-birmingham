package homework.WS1two;

import static org.junit.jupiter.api.Assertions.assertEquals;

import homework.WS1two.Good;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GoodTest {

    private Good milk;
    private Good bread;
    public final static double TOLERANCE = 0.000001;

    @BeforeEach
    public void setup() {
        milk = new Good("Milk", 50);
        bread = new Good("Bread", 115);
    }

    @Test
    public void test1() {
        String expectedName = "Milk";
        double expectedNetPrice = 50;
        double expectedVATRate = 20;

        String actualName = milk.getName();
        double actualNetPrice = milk.getNetPrice();
        double actualVATRate = Good.VAT_RATE;
        assertEquals(expectedName, actualName, "failure ");
        assertEquals(expectedNetPrice, actualNetPrice, TOLERANCE,
                "failure");
        assertEquals(expectedVATRate, actualVATRate, TOLERANCE,
                "failure");
    }

    // testing getters of bread
    @Test
    public void test2() {
        String expectedName = "Bread";
        double expectedNetPrice = 115;

        String actualName = bread.getName();
        double actualNetPrice = bread.getNetPrice();

        assertEquals(expectedName, actualName, "failure");
        assertEquals(expectedNetPrice, actualNetPrice, TOLERANCE,
                "failure");
    }

    @Test
    public void test3() {
        milk.setName("Whole milk");
        milk.setNetPrice(10);
        String expectedName = "Whole milk";
        double expectedNetPrice = 10;

        String actualName = milk.getName();
        double actualNetPrice = milk.getNetPrice();

        assertEquals(expectedName, actualName, "failure");
        assertEquals(expectedNetPrice, actualNetPrice, TOLERANCE,
                "failure");

    }

    // testing setters and getters of bread
    @Test
    public void test4() {
        bread.setName("Rye bread");
        bread.setNetPrice(15);
        String expectedName = "Rye bread";
        double expectedNetPrice = 15;

        String actualName = bread.getName();
        double actualNetPrice = bread.getNetPrice();

        assertEquals(expectedName, actualName, "failure");
        assertEquals(expectedNetPrice, actualNetPrice, TOLERANCE,
                "failure");

    }

    // testing grossPrice method of milk
    @Test
    public void test5() {
        double expectedGrossPrice = 60;
        double actualGrossPrice = milk.grossPrice();

        assertEquals(expectedGrossPrice, actualGrossPrice, TOLERANCE,
                "failure");

    }

    // testing grossPrice method of bread
    @Test
    public void test6() {
        double expectedGrossPrice = 138;
        double actualGrossPrice = bread.grossPrice();

        assertEquals(expectedGrossPrice, actualGrossPrice, TOLERANCE,
                "failure");

    }


    @Test
    public void test7() {
        milk.discount(0);
        String expectedString = "The Milk has a gross price of \u00A360.00.";
        String actualString = milk.toString();
        assertEquals(expectedString, actualString,
                "failure in test11: " + " expected toString output does not match the actual one");
    }

}
