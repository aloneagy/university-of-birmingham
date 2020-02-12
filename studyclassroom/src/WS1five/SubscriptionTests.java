package WS1five;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SubscriptionTests {

  private SubscriptionInterface Subscription1;
  private SubscriptionPrime SP;
  private Subscription Subscription2;

  @BeforeEach
  public void init() {
    Subscription1 = new Subscription("A1", "A2", 5);
    SP = new SubscriptionPrime("B1", "B2", 3, "B4");
    Subscription2 = new SubscriptionPrime("C1", "C2", 3, "C4");
  }

  // testing sub1's getTitle()
  @Test
  public void test1() {
    String expectedTitle = "A1";
    String actualTitle = Subscription1.getTitle();
    assertEquals(expectedTitle, actualTitle, "title should be: " + expectedTitle);
  }

  // testing sub1's getEmail()
  @Test
  public void test2() {
    String expectedEmail = "A2";
    String actualEmail = Subscription1.getEmail();
    assertEquals(expectedEmail, actualEmail, "mail should be: " + expectedEmail);
  }

  // testing sub1's getCost()
  @Test
  public void test3() {
    int expectedCost = 5;
    int actualCost = Subscription1.getCost();
    assertEquals(expectedCost, actualCost, "cost should be: " + expectedCost);
  }

  // testing subPrime1's getTitle()
  @Test
  public void test4() {
    String expectedTitle = "B1";
    String actualTitle = SP.getTitle();
    assertEquals(expectedTitle, actualTitle, "title should be: " + expectedTitle);
  }

  // testing subPrime1's getEmail()
  @Test
  public void test5() {
    String expectedEmail = "B2";
    String actualEmail = SP.getEmail();
    assertEquals(expectedEmail, actualEmail, "mail should be: " + expectedEmail);

  }

  // testing subPrime1's getCost()
  @Test
  public void test6() {
    int expectedCost = 3;
    int actualCost = SP.getCost();
    assertEquals(expectedCost, actualCost, "cost should be: " + expectedCost);
  }

  // testing subPrime1's getAddress()
  @Test
  public void test7() {
    String expectedDeliveryAddress = "B4";
    String actualDeliveryAddress = SP.getAddress();
    assertEquals(expectedDeliveryAddress, actualDeliveryAddress,
        "address should be: " + expectedDeliveryAddress);
  }

  // testing getAddress()
  @Test
  public void test8() {
    SubscriptionPrimeInterface SP2 =
        new SubscriptionPrime("WW", "SS", 5, "QQ");
    String expectedAddress = "QQ";
    String actualAddress = SP2.getAddress();
    assertEquals(expectedAddress, actualAddress, "address should be: " + expectedAddress);
  }

  // testing sub2's getTitle
  @Test
  public void test9() {
    String expectedTitle = "C1";
    String actualTitle = Subscription2.getTitle();
    assertEquals(expectedTitle, actualTitle, "title should be: " + expectedTitle);
  }

  // testing sub2's getEmail()
  @Test
  public void test10() {
    String expectedEmail = "C2";
    String actualEmail = Subscription2.getEmail();
    assertEquals(expectedEmail, actualEmail, "email should be: " + expectedEmail);
  }

  // testing sub2's getCost()
  @Test
  public void test11() {
    int expectedCost = 3;
    int actualCost = Subscription2.getCost();
    assertEquals(expectedCost, actualCost, "cost should be: " + expectedCost);
  }
}
