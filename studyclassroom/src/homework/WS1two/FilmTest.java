package homework.WS1two;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FilmTest {

    private Date date;
    private Film adAstra;

    @BeforeEach
    public void init() {
        date = new Date(30, "Jan", 2030);
        adAstra = new Film("Now you see me", date, 99);
    }

    @Test
    public void test1() {
        int expectedDay = 30;
        int actualDay = adAstra.getReleaseDate().getDay();
        assertEquals(expectedDay, actualDay, "failure");
    }

    @Test
    public void test2() {
        String expectedMonth = "Jan";
        String actualMonth = adAstra.getReleaseDate().getMonth();
        assertEquals(expectedMonth, actualMonth,
                "failure");
    }

    @Test
    public void test3() {
        int expectedYear = 2030;
        int actualYear = adAstra.getReleaseDate().getYear();
        assertEquals(expectedYear, actualYear, "failure");
    }

    @Test
    public void test4() {
        String expectedTitle = "Now you see me";
        String actualTitle = adAstra.getTitle();
        assertEquals(expectedTitle, actualTitle,
                "failure");
    }

    @Test
    public void test5() {
        int expectedLength = 99;
        int actualLength = adAstra.getLength();
        assertEquals(expectedLength, actualLength,
                "failure");
    }

    @Test
    public void test6() {
        Date updatedReleaseDate = new Date(11, "May", 2032);
        adAstra.setReleaseDate(updatedReleaseDate);

        String expectedDate = "11 May 2032";
        String actualDate = adAstra.getReleaseDate().toString();

        assertEquals(expectedDate, actualDate, "failure");
    }


}
