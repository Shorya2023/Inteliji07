import org.testng.annotations.Test;

public class SeleniumRevertTestCases {



    @Test(priority=0,groups ="sanity")
    public void Reveret()
    {

        System.out.println("Revert success to app...................");
        //Assert.fail();
    }

    @Test(priority = 4,groups ="Regression")
    public void ReveertCommit()
    {

        System.out.println("Revert comiit success...............");
    }




}
