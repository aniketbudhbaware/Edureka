package testclasses;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.JobRolePage;
import testbase.WebTestBase;


public class JobRoleTest extends WebTestBase {
    public JobRolePage jobRolePage;

    public JobRoleTest()
    {
        super();
    }

    @BeforeMethod
    public void beforeMethod()
    {
        initialization();
        jobRolePage = new JobRolePage();
    }
    @Test(priority = 2, description = "Click On Job Role Dropdown And Select The Option")
    public void verifyDropdownOfJobRole()
    {
        jobRolePage.clickOnJobRoleDropdown();
        driver.close();

    }
}
