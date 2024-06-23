import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SeleniumTest {


    @Test(priority=0,groups ="sanity")
    public void Login()
    {

        System.out.println("Login to app...................");
        //Assert.fail();
    }

    @Test(priority = 4,groups ="Regression")
    public void testRun1()
    {

        System.out.println("Test cases executed.1..................");
    }

    @Test(priority = 2,groups ="Regression")
    public void testRun2()
    {

        System.out.println("Test cases executed.2..................");
    }
    @Test(priority = 3)
    public void testRun3()
    {

        System.out.println("Test cases executed3...................");
    }

    @Test(priority = 1)
    public void testRun4()
    {

        System.out.println("Test cases executed4...................");

    }



    @Test (priority = 5)
    public void zteardown()
    {

        System.out.println("loggin offf..............");
    }



}
