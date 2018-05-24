package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.GitHubPage;

public class GitHubTest extends BaseTestScript {

    GitHubPage gitHubPage = new GitHubPage();

    @Test
    public void searchRepo() {

        browser.open("https://www.github.com");
        browser.takeScreenshot();
        browser.sleep(500);

        gitHubPage.searchBox.type("friskysoft").submit(); // sendKeys(Keys.ENTER);
        gitHubPage.menu.waitToBeVisible(10);
        gitHubPage.users.click();

        String actualText = gitHubPage.firstItem.waitToBeVisible(5).getText();
        Assert.assertEquals(actualText, "friskysoft");

    }

}
