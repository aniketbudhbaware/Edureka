package testclasses;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.OtherFilterPage;
import testbase.WebTestBase;

public class OtherFilterTest extends WebTestBase
{
    public OtherFilterPage otherFilterPage;
    OtherFilterTest()
    {
        super();
    }

    @BeforeMethod
    public void beforeMethod()
    {
        initialization();
        otherFilterPage = new OtherFilterPage();
    }
    @Test(priority = 3, description = "click on other filter dropdown select training type batch type and click on apply")
    public void verifyFilter()
    {
        otherFilterPage.clickOnOtherFilter();
        driver.close();
    }
}