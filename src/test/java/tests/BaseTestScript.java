package tests;

import com.friskysoft.framework.Browser;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class BaseTestScript {
    public static Browser browser;

    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();
        browser = Browser.newInstance(driver);
    }

    @AfterClass
    public void teardown() {

        // Save a screenshot before shutdown
        browser.takeScreenshot();

        // Shutdown webdriver
        browser.destroy();
    }
}
