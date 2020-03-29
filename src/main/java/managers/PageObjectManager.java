package managers;

import org.openqa.selenium.WebDriver;
import pageobjects.GoogleHomePage;

public class PageObjectManager
{

    private final GoogleHomePage googleHomePage;

    public PageObjectManager(final WebDriver driver)
    {
        this.googleHomePage = new GoogleHomePage(driver);
    }

    public GoogleHomePage getGoogleHomePage() {
        return googleHomePage;
    }
}
