package gayathri.testerscafe.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BaseClass {

    public WebDriver driver;

    public void initBrowser(String url) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public Properties readProperties() throws IOException {
        File file = new File("E:\\Users\\user\\automation\\untitled\\src\\main\\java\\gayathri\\testerscafe\\config\\config.properties");
        FileInputStream fin = new FileInputStream(file);
        Properties prop = new Properties();
        prop.load(fin);
        return prop;
    }

}
