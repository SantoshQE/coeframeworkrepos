package pageobjects;

import objectrepository.Google_OR;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ConfigFileReader;

public class GoogleHomePage {

    private WebDriver driver;

    @FindBy(name = Google_OR.searchtextBox)
    public WebElement searchtextBox;

    public GoogleHomePage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void navigateToGoogleHomePage()
    {
        driver.get(new ConfigFileReader().getUrlGoogleHomePage());
    }
    public void enterSearchTestinGoogleSearchTxt(String searchString)
    {
        searchtextBox.sendKeys(searchString);
    }
    public void searchGoogle()
    {
        searchtextBox.sendKeys(Keys.ENTER);
    }

}
