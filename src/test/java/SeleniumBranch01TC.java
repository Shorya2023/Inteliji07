import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SeleniumBranch01TC {


    @Test(priority=0,groups ="sanity")
    public void Login()
    {

        System.out.println("Login to app branc01...................");
        //Assert.fail();
    }

    @Test(priority = 4,groups ="Regression")
    public void testRun1()
    {

        System.out.println("Test cases executed.branch01..................");
    }




}
