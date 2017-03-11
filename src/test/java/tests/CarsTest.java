package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CarsPage;

public class CarsTest extends BaseTestScript {

    CarsPage carsPage = new CarsPage();

    @Test
    public void carsTest() {

        browser.open("https://www.cars.com");
        browser.takeScreenshot();

        browser.sleep(2000);
        carsPage.searchNowButton.waitToBeClickable().click();
        carsPage.searchModal.waitToBeVisible();
        carsPage.makeDropdown.waitToBeClickable().click();
        carsPage.makeDropdownOptionByLabel("Toyota").waitToBeClickable().click();
        carsPage.zipInput.type("10001");
        carsPage.searchSubmit.waitToBeClickable().click();

        carsPage.searchResultListing.waitToBeVisible(10);
        String actualText = carsPage.searchResultTitle.waitToBeVisible(10).getText();
        Assert.assertTrue(actualText.contains("Toyota"));

    }

}
