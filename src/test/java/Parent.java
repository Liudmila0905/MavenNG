import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class Parent {
    @BeforeClass
    public void BeforeClass() {
        System.out.println("Before class");
    }
    @AfterClass
    public void AfterClass() {
        System.out.println("After class");
    }
    @BeforeSuite
    public void BeforeSuite() {
        System.out.println("Before suite");
    }
    @AfterSuite
    public void AfterSuite() {
        System.out.println("After suite");
    }

}
