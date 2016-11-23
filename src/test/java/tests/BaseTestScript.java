package tests;

import com.friskysoft.framework.Browser;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class BaseTestScript {
    public static Browser browser;

    @BeforeClass
    public void setup() {

        // Autoconfigure chromedriver executable
        ChromeDriverManager.getInstance().setup();

        // Start a new webdriver using frisky-browser
        browser = Browser.newInstance(BrowserType.CHROME)
                .setPageLoadTimeout(30, TimeUnit.SECONDS)
                .setImplicitWait(5, TimeUnit.SECONDS);
    }

    @AfterClass
    public void teardown() {

        // Save a screenshot before shutdown
        browser.takeScreenshot();

        // Shutdown webdriver
        browser.destroy();
    }
}
