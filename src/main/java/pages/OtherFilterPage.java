package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;

public class OtherFilterPage extends WebTestBase {

    @FindBy(xpath = "//button[@class='dropdown-toggle trackButton']")
    WebElement otherFilter;

    @FindBy(xpath = "//ul[@class='options']//child::li[2]")
    WebElement selectCheckbox;

    @FindBy(xpath = "//div[@class='batchsec']//child::li[2]")
    WebElement selectCheckboxSecond;

    @FindBy(xpath = "//a[@class='applyfilterbtn giTrackElement']")
    WebElement applyBtn;

    @FindBy(xpath = "//a[@id='clearallbtn']")
    WebElement clearAll;

    public OtherFilterPage()
    {
        PageFactory.initElements(driver, this);
    }
    public void clickOnOtherFilter()
    {
        otherFilter.click();
        selectCheckbox.click();
        selectCheckboxSecond.click();
        applyBtn.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        clearAll.click();
    }
}
