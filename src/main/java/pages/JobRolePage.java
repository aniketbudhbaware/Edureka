package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;

public class JobRolePage extends WebTestBase {

    @FindBy(xpath = "//i[@class='icon-down-arrow2']")
    WebElement jobRoleDropDown;
    @FindBy(xpath = "//label[@class='radio-label']")
    WebElement selectFromJobRoleDropDown;
    public JobRolePage()
    {
        PageFactory.initElements(driver, this);
    }
    public void clickOnJobRoleDropdown()
    {
        jobRoleDropDown.click();
        selectFromJobRoleDropDown.click();
    }
}
