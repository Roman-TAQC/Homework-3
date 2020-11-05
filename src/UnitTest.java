import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class UnitTest {
    private Unit unit;
    @BeforeClass
    public void createObject(){
        unit = new Unit();
    }

    @Test
    public void testIsTrue(){
        String actualResult = unit.isTrue(false);
        String expectedResult = "isTrue";
        Assert.assertEquals(actualResult, expectedResult, "Value is false");
    }
}
