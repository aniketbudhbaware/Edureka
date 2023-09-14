package testclasses;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.LoginPage;
import testbase.WebTestBase;

public class LoginTest extends WebTestBase {

    public HomePage homePage;
    public LoginPage loginPage;
    LoginTest() {
        super();
    }

    @BeforeMethod
    public void beforeMethod() {
        initialization();
        homePage = new HomePage();
        loginPage = new LoginPage();
    }

    @Test(priority = 1, description = "verify login with valid username and password")
    public void verifyLoginWithValidUserNameAndValidPassword()
    {
        SoftAssert softAssert = new SoftAssert();
        homePage.clickOnLogin();
        loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
        softAssert.assertEquals(loginPage.getTextOfLoginPage(), "All Results", "Text should be match");
        softAssert.assertAll();
        driver.close();


    }

}
