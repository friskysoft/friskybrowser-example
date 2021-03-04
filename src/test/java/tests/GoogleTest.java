package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.GooglePage;

public class GoogleTest extends BaseTestScript {

    GooglePage googlePage = new GooglePage();

    @Test
    public void searchTest() {

        driver.open("https://www.google.com/?complete=0");
        driver.takeScreenshot();

        googlePage.searchBox.waitToBePresent().sendKeys("selenium webdriver");
        googlePage.searchButton.waitToBeClickable().click();
        googlePage.searchResults.waitToBePresent(10);

        String actualText = googlePage.searchResults.getFirst().getText();
        Assert.assertTrue(actualText.contains("Selenium"));

        String actualLink = googlePage.searchResultLinks.getFirst().getLink();
        Assert.assertTrue(actualLink.contains("selenium"));

        driver.takeScreenshot(true);
    }

}
