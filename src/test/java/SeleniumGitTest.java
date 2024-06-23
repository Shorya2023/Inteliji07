import org.testng.annotations.Test;

public class SeleniumGitTest {

    @Test (priority = 0,groups ="sanity")
    public void run()
    {

        System.out.println("SeleniumGitTest Started1.........");
    }

    @Test (priority = 1,groups ="sanity")
  public void run1()
    {

        System.out.println("SeleniumGitTest Started 2.........");
    }

}
