package SearchResult;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import report.TestLogger;

public class ResultPage  extends CommonAPI {
    public void vaildateSearchpageDisplayed() {

        WebElement element = getElement("");
        Assert.assertEquals(element.isDisplayed(), true, "element isn't displayed");
        TestLogger.log("search result panel is displayed:" + element.isDisplayed());
    }


}
