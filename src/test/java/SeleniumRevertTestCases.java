import org.testng.annotations.Test;

public class SeleniumRevertTestCases {



    @Test(priority=0,groups ="sanity")
    public void Reveret()
    {

        System.out.println("Revert success to app...................");
        System.out.println("Revert success to app nned to reveert back ...................");

        //Assert.fail();
    }

    @Test(priority = 4,groups ="Regression")
    public void ReveertCommit()
    {

        System.out.println("Revert comiit success...............");
        System.out.println("updated1...............");

    }

    @Test(priority = 5,groups ="Regression")
    public void AddedNow()
    {

        System.out.println("updated 2...............");
    }





}
