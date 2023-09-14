package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;


public class SearchCoursePage extends WebTestBase {

    @FindBy(xpath = "//*[@id=\"remote\"]/span[2]")
    WebElement clickOnSearch;
    @FindBy(xpath = "//*[@id=\"search-input\"]")
    WebElement sendName;
    @FindBy(xpath = "//*[@id=\"search-results\"]/li[2]")
    WebElement selectCourse;
    public SearchCoursePage()
    {
        PageFactory.initElements(driver, this);
    }
    public void clickOnSearchBar()
    {

        clickOnSearch.click();
        sendName.sendKeys("Automation Testing");
        selectCourse.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

}
