import org.testng.annotations.Test;

public class SeleniumTestRun {

    @Test (priority = 0,groups ="sanity")
    public void run()
    {

        System.out.println("SeleniumTestRun branch01.........");
    }



    @Test (priority = 1,groups ="sanity")
    public void run2()
    {

        System.out.println("SeleniumTestRun branch01 run 2.........");
    }

    @Test (priority = 2,groups ="Regression")
    public void run3()
    {

        System.out.println("SeleniumTestRun branch01 run 3.........");
    }



}
