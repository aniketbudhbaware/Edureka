package utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import testbase.WebTestBase;

import java.time.Duration;

import static testbase.WebTestBase.driver;

public class Utility extends WebTestBase {

    public static final long IMPLICIT_WAIT = 20;
    public static final long PAGE_LOAD = 20;

    public static final long EXPLICIT_WAIT = 20;

    public static WebDriverWait wait;

    public static void waitUntilElementToBeClickable(WebElement element)
    {
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }
    public static String getTextOfElement(WebElement element){
        return element.getText();
    }

}
