package testclasses;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.SearchCoursePage;
import testbase.WebTestBase;

public class SearchCourseTest extends WebTestBase {
    public SearchCoursePage searchCoursePage;
    SearchCourseTest()
    {
        super();
    }

    @BeforeMethod
    public void beforeMethod()
    {
        initialization();
        searchCoursePage = new SearchCoursePage();
    }
    @Test(priority = 4, description = "click on search bar enter the course name and select course " +
            "from recomended option")
    public void verifySearch()
    {

        searchCoursePage.clickOnSearchBar();
        driver.close();
    }
}
