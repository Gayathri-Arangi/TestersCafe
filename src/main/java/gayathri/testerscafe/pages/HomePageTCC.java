package gayathri.testerscafe.pages;

import gayathri.testerscafe.actions.PageActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class HomePageTCC extends PageActions {

    private WebDriver driver;

    public HomePageTCC(WebDriver driver) {
        this.driver = driver;
    }

    By links = By.tagName("a");

    public void findBrokenLinks() throws IOException {
        List<WebElement> totalLinks = getElements(driver, links);
        System.out.println("Total number of links on the webpage are: " + totalLinks.size());

        for (WebElement link : totalLinks) {
            String linkUrl = link.getAttribute("href");

            try {
                URL url = new URL(linkUrl);
                HttpURLConnection ht = (HttpURLConnection) url.openConnection();
                ht.connect();

                int responseCode = ht.getResponseCode();
                if (responseCode >= 400) {
                    System.out.println(linkUrl + "is a Broken Link");
                } else {
                    System.out.println(linkUrl + "is a Valid Link");
                }
            } catch (ClassCastException ex) {
                ex.printStackTrace();
            }
        }
    }
}
