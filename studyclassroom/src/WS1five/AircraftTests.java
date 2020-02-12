package WS1five;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AircraftTests {
  public static final double TOLERANCE = 0.0000000001;
  private Aircraft a1, a2;
  private Aeroplane a3;

  @BeforeEach
  public void init() {

    a1 = new Aircraft(10, 80);
    a3 = new Aeroplane(30, 50, 30);
    a2 = new Aeroplane(20, 30, 40);
  }

  // testing getters of aircraft1
  @Test
  public void test1() {

    int expectedNumOfPassengers = 10;
    int actualNumOfPassengers = a1.getPassengerNumber();
    assertEquals(expectedNumOfPassengers, actualNumOfPassengers);

    int expectedMaxSpeed = 80;
    int actualMaxSpeed = a1.getMaxSpeed();
    assertEquals(expectedMaxSpeed, actualMaxSpeed);
  }

  // testing getters of aeroplane
  @Test
  public void test2() {

    int expectedNumOfPassengers = 30;
    int actualNumOfPassengers = a3.getPassengerNumber();
    assertEquals(expectedNumOfPassengers, actualNumOfPassengers);

    int expectedMaxSpeed = 50;
    int actualMaxSpeed = a3.getMaxSpeed();
    assertEquals(expectedMaxSpeed, actualMaxSpeed);

    double expectedFuelCons = 30;
    double actualFuelCons = a3.getFuelConsumption();
    assertEquals(expectedFuelCons, actualFuelCons, TOLERANCE);
  }

  // testing setters of aircraft1
  @Test
  public void test3() {

    a1.setPassengerNumber(500);
    int expectedNumOfPassengers = 500;
    int actualNumOfPassengers = a1.getPassengerNumber();
    assertEquals(expectedNumOfPassengers, actualNumOfPassengers);

    a1.setMaxSpeed(70);
    int expectedMaxSpeed = 70;
    int actualMaxSpeed = a1.getMaxSpeed();
    assertEquals(expectedMaxSpeed, actualMaxSpeed);
  }

  // testing setters of aeroplane
  @Test
  public void test4() {

    a3.setPassengerNumber(5);
    int expectedNumOfPassengers = 5;
    int actualNumOfPassengers = a3.getPassengerNumber();
    assertEquals(expectedNumOfPassengers, actualNumOfPassengers);

    a3.setMaxSpeed(3);
    int expectedMaxSpeed = 3;
    int actualMaxSpeed = a3.getMaxSpeed();
    assertEquals(expectedMaxSpeed, actualMaxSpeed);


    a3.setFuelConsumption(10);
    double expectedFuelCons = 10;
    double actualFuelCons = a3.getFuelConsumption();
    assertEquals(expectedFuelCons, actualFuelCons, TOLERANCE);
  }


  // testing getters of aircraft2
  @Test
  public void test5() {

    int expectedNumOfPassengers = 20;
    int actualNumOfPassengers = a2.getPassengerNumber();
    assertEquals(expectedNumOfPassengers, actualNumOfPassengers);

    int expectedMaxSpeed = 30;
    int actualMaxSpeed = a2.getMaxSpeed();
    assertEquals(expectedMaxSpeed, actualMaxSpeed);
  }

  // testing setters of aircraft2
  @Test
  public void test6() {

    a2.setPassengerNumber(12);
    int expectedNumOfPassengers = 12;
    int actualNumOfPassengers = a2.getPassengerNumber();
    assertEquals(expectedNumOfPassengers, actualNumOfPassengers);

    a2.setMaxSpeed(14);
    int expectedMaxSpeed = 14;
    int actualMaxSpeed = a2.getMaxSpeed();
    assertEquals(expectedMaxSpeed, actualMaxSpeed);
  }
}
