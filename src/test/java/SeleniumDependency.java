import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumDependency {


    @Test(priority = 0)
    public void CreatePayment()
    {
        System.out.println("Create Payment ........");
        Assert.fail();
    }

    @Test(dependsOnMethods ="CreatePayment")
    public void VerifyPayment()
    {
        System.out.println("VerifyPayment Payment ........");
    }

    @Test(dependsOnMethods ="VerifyPayment")
    public void DeletePayment()
    {
        System.out.println("Delete Payment ........");
    }


    @Test(dependsOnMethods ="DeletePayment",alwaysRun = true)
    public void Logout()
    {
        System.out.println("Logout Payment ........");
    }


}




