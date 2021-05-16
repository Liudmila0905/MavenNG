import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class StringHomeTest extends Parent {
    StringHome stringhome = new StringHome();
    @Test
    public void testFormat() {
        String expected = "Lifeisgood";
        assertEquals(stringhome.format("Life", "is", "good"), expected, "Format is wrong, expected is = " + expected);
    }
    @Test
    public void testFormat1() {
        String expected1 = "Dreamscometrue11";
        assertEquals(stringhome.format("Dreams", "come", "true"), expected1, "Format is wrong, expected is" + expected1);
    }
    @Test(dataProvider="getData")
    public void provider (int s1, String s2) {
        System.out.println("Example data(" + s1 +", " + s2 + ")");
    }
    @DataProvider
    public Object[][] getData(){
        return new Object[][] {
                {4, "four"},
                {6, "six"}};
    }
}