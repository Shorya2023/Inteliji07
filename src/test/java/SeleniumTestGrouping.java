import org.testng.annotations.Test;

public class SeleniumTestGrouping {


    @Test(groups ="sanity")
    public  void Test123()
    {
        System.out.println("Sanity testing.......");
    }

    @Test (groups ="sanity")
    public  void Test2()
    {
        System.out.println(" sanity testing.......");
    }


    @Test (groups ="smoke")
    public  void Test3()
    {
        System.out.println("smoke testing.......");
    }


    @Test(groups ="Regression")
    public  void Test4()
    {
        System.out.println(" Regression testing.......");
    }


    @Test(groups ="Regression")
    public  void Test5()
    {
        System.out.println(" Regression testing.......");
    }


    @Test (groups ="smoke")
    public  void Test6()
    {
        System.out.println(" smoke testing.......");
    }



}
