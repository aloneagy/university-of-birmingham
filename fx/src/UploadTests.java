import org.junit.Test;
/**
 *  This is a test class to test the Upload class
 *  @version 2019-12-03
 *  @author TIANHE YANG
 */
public class UploadTests {
    /**
     * this test case is designed to test when the class variables are default.
     */
    @Test
    public void test1(){
        Upload new1 = new Upload();
        new1.main(null);
    }

    /**
     * this test case is designed to test when the class variable width is not default.
     * The width is set to 10 which is less than the default value.
     */
    @Test
    public void test2(){
        Upload new2 = new Upload();
        new2.setWidth(10);
        new2.main(null);
    }
    /**
     * this test case is designed to test when the class variable width is not default.
     * The width is set to 40 which is less than the default value.
     */
    @Test
    public void test3(){
        Upload new3 = new Upload();
        new3.setWidth(40);
        new3.main(null);
    }
}
