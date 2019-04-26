package tests;

import com.friskysoft.framework.Browser;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.GitHubPage;

public class GitHubTest extends BaseTestScript {

    GitHubPage gitHubPage = new GitHubPage();

    @Test
    public void searchRepo() {

        driver.open("https://www.github.com");
        driver.takeScreenshot();
        Browser.sleep(500);

        gitHubPage.searchBox.type("friskysoft").submit(); // sendKeys(Keys.ENTER);
        gitHubPage.menu.waitToBeVisible(10);
        gitHubPage.users.click();

        String actualText = gitHubPage.firstItem.waitToBeVisible(5).getText();
        Assert.assertEquals(actualText, "friskysoft");

    }

}
