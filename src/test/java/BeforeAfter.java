import org.testng.Assert;
import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;

public class BeforeAfter {


    @BeforeTest
    public void initi()
    {

        System.out.println("initiate app logs");
    }

    @AfterTest
    public void deallocate()
    {
        System.out.println("call off the loggs");
    }


    @BeforeClass
    public void checkapp()
   {

       System.out.println("befoer class started......");
   }



   @AfterClass
   public void checkoutapp()
    {

        System.out.println("after class started......");
    }

    @BeforeMethod
   public void Datasetup()
   {

       System.out.println("data set up done befoer method............");
   }

    @AfterMethod
    public void Datasetupteardown()
    {

        System.out.println("data set up deallocated ............");
    }


    @Test(priority=0)
    public void Login()
    {

        System.out.println("Login to app...................");
        //Assert.fail();
    }

    @Test(priority = 4)
    public void testRun1()
    {

        System.out.println("Test cases executed.1..................");
    }

    @Test(priority = 2)
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



    @Test (priority = 5,groups ="Regression")
    public void zteardown()
    {

        System.out.println("loggin offf..............");
    }



}
