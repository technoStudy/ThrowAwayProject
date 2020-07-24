import org.testng.Assert;
import org.testng.annotations.Test;

public class ThisWillNotRun {
    @Test
    void test(){
        Assert.assertTrue(true);
    }
}
