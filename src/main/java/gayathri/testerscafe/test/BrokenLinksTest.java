package gayathri.testerscafe.test;

import gayathri.testerscafe.base.BaseClass;
import gayathri.testerscafe.pages.HomePageTCC;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class BrokenLinksTest extends BaseClass {

    HomePageTCC homePageTCC;

    @BeforeMethod
    public void openBrowser() throws IOException {
        initBrowser(readProperties().getProperty("url"));
        homePageTCC = new HomePageTCC(getDriver());
    }

    @Test
    public void listOfBrokenLinks() throws IOException {
        homePageTCC.findBrokenLinks();
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }
}
