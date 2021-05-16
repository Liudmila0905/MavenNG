import add.PropertiesReaderClassLoader;
import org.testng.annotations.*;

import static org.testng.Assert.*;

public class MathoperationsTest extends Parent{
    Mathoperations mathoperations = new Mathoperations();
    @BeforeClass
    public void BeforeClass() {
        System.out.println("Before class");
    }
    @AfterClass
    public void AfterClass() {
        System.out.println("After class");
    }

    @BeforeMethod
    public void BeforeMethod() {
        System.out.println("Before method");
    }
    @AfterMethod
    public void AfterMethod() {
        System.out.println("After method");
    }

    @Test
    public void testMax() {
        int num1 = 10;
        int num2 = 15;
        int expected = 15;
        int rr = mathoperations.max(num1, num2);
        assertEquals(rr, expected);
    }
    @Test
    public void testMax1()
    {
        int num1 = 10;
        int num2 = 15;
        int expected = 17;
        int rr = mathoperations.max(num1, num2);
        assertEquals(rr, expected);
    }

    @Test
    public void testEqual() {
        int num1 = 32;
        int num2 = 89;
        boolean expected = false;
        boolean b = mathoperations.equal(num1, num2);
        assertEquals(b, expected);
    }

    @Test
    public void testEqual1() {
        int num1 = 32;
        int num2 = 32;
        boolean expected = true;
        boolean b = mathoperations.equal(num1, num2);
        assertEquals(b, expected);
    }
    @Test
    public void testEqual2() {
        int num1 = 32;
        int num2 = 32;
        boolean expected = false;
        boolean b = mathoperations.equal(num1, num2);
        assertEquals(b, expected);
    }
    @Test
    public void testMin() {
        int num1 = -9;
        int num2 = 19;
        int expected = -9;
        int rr = mathoperations.min(num1, num2);
        assertEquals(rr, expected);
    }
    @Test
    public void testMin1() {
        int num1 = -98;
        int num2 = 19;
        int expected = -9;
        int rr = mathoperations.min(num1, num2);
        assertEquals(rr, expected);
    }

    @Test
    public void testSquareRoot() {
        double number = 144;
        double expected_sr  = 12;
        double root = mathoperations.squareRoot(number);
        assertEquals(root, expected_sr);
    }
    @Test
    public void testSquareRoot1() {
        double number = 140;
        double expected_sr  = 12;
        double root = mathoperations.squareRoot(number);
        assertEquals(root, expected_sr);
    }
    @Test
    public void test2() {
        String baseUrl = PropertiesReaderClassLoader.getInstance().getValueFromProperty( "baseUrl");
        String defaultTimeoutValue = PropertiesReaderClassLoader.getInstance().getValueFromProperty( "defaultTimeout");
        System.out.println("baseUrl = " + baseUrl);
        System.out.println("defaultTimeoutValue = " + defaultTimeoutValue);
    }
}