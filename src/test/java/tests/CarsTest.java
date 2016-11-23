package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CarsPage;

public class CarsTest extends BaseTestScript {

    @Test
    public void carsTest() {

        browser.open("https://www.cars.com");
        browser.takeScreenshot();

        CarsPage.makeDropdown.waitToBeVisible().selectByText("Toyota");
        CarsPage.zipInput.type("10001");
        CarsPage.searchSubmit.waitToBeClickable().click();

        CarsPage.searchResultListing.waitToBeVisible(10);
        String actualText = CarsPage.searchResultTitle.getText();
        Assert.assertTrue(actualText.contains("Toyota"));

    }

}
