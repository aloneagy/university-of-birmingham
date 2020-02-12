package homework.WS1two;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
public class a {


        private Car c1;
        private Car c2;
        private Car c3;


        @BeforeEach
        public void beforeEach() {
            c1 = new Car("aaa", 100, 50, "abc");
            c2 = new Car("bbb", 1000, 70, "bcd");
            c3 = new Car("ccc", 10000, 100, "cde");
        }

        // testing getter for make
        @Test
        public void testMake1() {
            String expected = "aaa";
            String actual = c1.getMake();
            assertEquals(expected, actual, "error");
        }
        @Test
        public void testMake2() {
            String expected = "bbb";
            String actual = c2.getMake();
            assertEquals(expected, actual, "error");
        }
        @Test
        public void testMake3() {
            String expected = "ccc";
            String actual = c3.getMake();
            assertEquals(expected, actual, "error");
        }

        // testing getter for price
        @Test
        public void testPrice1() {
            int expected = 100;
            int actual = c1.getPrice();
            assertEquals(expected, actual, "error");
        }
        @Test
        public void testPrice2() {
            int expected = 1000;
            int actual = c2.getPrice();
            assertEquals(expected, actual, "error");
        }
        @Test
        public void testPrice3() {
            int expected = 10000;
            int actual = c3.getPrice();
            assertEquals(expected, actual, "error");
        }


        // testing getter for maxSpeed
        @Test
        public void testmaxSpeed1() {
            int expected = 50;
            int actual = c1.getMaxSpeed();
            assertEquals(expected, actual, "error");
        }
        @Test
        public void testmaxSpeed2() {
            int expected = 70;
            int actual = c2.getMaxSpeed();
            assertEquals(expected, actual, "error");
        }
        @Test
        public void testmaxSpeed3() {
            int expected = 100;
            int actual = c3.getMaxSpeed();
            assertEquals(expected, actual, "error");
        }

        // testing getter for colour
        @Test
        public void testColour1() {
            String expected = "abc";
            String actual = c1.getColour();
            assertEquals(expected, actual, "error");
        }
        @Test
        public void testColour2() {
            String expected = "bcd";
            String actual = c2.getColour();
            assertEquals(expected, actual, "error");
        }
        @Test
        public void testColour3() {
            String expected = "cde";
            String actual = c3.getColour();
            assertEquals(expected, actual, "error");
        }


        // testing setter for make
        @Test
        public void testSetMake1() {
            c1.setMake("111");
            String expected = "111";
            String actual = c1.getMake();
            assertEquals(expected, actual, "error");
        }
        @Test
        public void testSetMake2() {
            c2.setMake("222");
            String expected = "222";
            String actual = c2.getMake();
            assertEquals(expected, actual, "error");
        }
        @Test
        public void testSetMake3() {
            c3.setMake("333");
            String expected = "333";
            String actual = c3.getMake();
            assertEquals(expected, actual, "error");
        }

        // testing setter for price
        @Test
        public void testSetPrice1() {
            c1.setPrice(80);
            int expected = 80;
            int actual = c1.getPrice();
            assertEquals(expected, actual, "error");
        }
        @Test
        public void testSetPrice2() {
            c2.setPrice(90);
            int expected = 90;
            int actual = c2.getPrice();
            assertEquals(expected, actual, "error");
        }
        @Test
        public void testSetPrice3() {
            c3.setPrice(1);
            int expected = 1;
            int actual = c3.getPrice();
            assertEquals(expected, actual, "error");
        }

        // testing setter for maxSpeed
        @Test
        public void testSetMaxSpeed1() {
            c1.setMaxSpeed(300);
            int expected = 300;
            int actual = c1.getMaxSpeed();
            assertEquals(expected, actual, "error");
        }
        @Test
        public void testSetMaxSpeed2() {
            c2.setMaxSpeed(33);
            int expected = 33;
            int actual = c2.getMaxSpeed();
            assertEquals(expected, actual, "error");
        }
        @Test
        public void testSetMaxSpeed3() {
            c3.setMaxSpeed(10);
            int expected = 10;
            int actual = c3.getMaxSpeed();
            assertEquals(expected, actual, "error");
        }

        // testing setter for setColour
        @Test
        public void testSetColour1() {
            c1.setColour("ttt");
            String expected = "ttt";
            String actual = c1.getColour();
            assertEquals(expected, actual, "error");
        }
        @Test
        public void testSetColour2() {
            c2.setColour("llll");
            String expected = "llll";
            String actual = c2.getColour();
            assertEquals(expected, actual, "error");
        }
        @Test
        public void testSetColour3() {
            c3.setColour("ooo");
            String expected = "ooo";
            String actual = c3.getColour();
            assertEquals(expected, actual, "error");
        }

    }



