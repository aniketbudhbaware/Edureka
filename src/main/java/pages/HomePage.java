package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import utility.Utility;

public class HomePage extends WebTestBase {

    @FindBy(xpath = "//span[text()='Log In']")
    WebElement loginRegisterBtn;
    public HomePage()
    {
        PageFactory.initElements(driver, this);
    }
    public void clickOnLogin()
    {
        Utility.waitUntilElementToBeClickable(loginRegisterBtn);
    }

}
