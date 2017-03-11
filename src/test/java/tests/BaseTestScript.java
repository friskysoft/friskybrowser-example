package tests;

import com.friskysoft.framework.Browser;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTestScript {
    public static Browser browser;

    @BeforeClass
    public void setup() {
        ChromeDriverManager.getInstance().setup();
        browser = Browser.newInstance(BrowserType.CHROME);
    }

    @AfterClass
    public void teardown() {

        // Save a screenshot before shutdown
        browser.takeScreenshot();

        // Shutdown webdriver
        browser.destroy();
    }
}
