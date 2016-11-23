package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.GooglePage;

public class GoogleTest extends BaseTestScript {

    @Test
    public void searchTest() {

        browser.open("https://www.google.com/?complete=0");
        browser.takeScreenshot();

        GooglePage.searchBox.waitToBePresent().sendKeys("Selenium");
        GooglePage.searchButton.waitToBeClickable().click();
        GooglePage.searchResults.waitToBePresent(10);

        String actualText = GooglePage.searchResults.getFirst().getText();
        Assert.assertTrue(actualText.contains("Selenium"));

        String actualLink = GooglePage.searchResultLinks.getFirst().getLink();
        Assert.assertTrue(actualLink.contains("seleniumhq.org"));

    }

}
