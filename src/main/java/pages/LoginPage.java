package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import utility.Utility;

public class LoginPage extends WebTestBase {

    @FindBy(xpath = "//a[text()='All Results']")
    WebElement allResultText;
    @FindBy(id = "si_popup_email")
    WebElement usernameTextBox;

    @FindBy(id = "si_popup_passwd")
    WebElement passwordTextBox;

    @FindBy(xpath = "//button[@class='clik_btn_log btn-block']")
    WebElement loginBtn;

    public LoginPage()
    {
        PageFactory.initElements(driver, this);
    }
    public void login(String username, String password){
        usernameTextBox.sendKeys(username);
        passwordTextBox.sendKeys(password);
        loginBtn.click();
    }
    public String getTextOfLoginPage(){
        return Utility.getTextOfElement(allResultText);

    }
}
