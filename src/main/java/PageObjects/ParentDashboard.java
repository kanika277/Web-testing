package PageObjects;

import Helper.SeleniumHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import PageObjects.ParentDashboard;


public class ParentDashboard extends BaseClass {

    public ParentDashboard(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@id= 'suggested-card-0']")
    public WebElement card1;

    @FindBy(className = "iconcust-iconMenu")
    public WebElement menuButton;
    @FindBy(linkText = "Add Player")
    public WebElement addPlayer;


    public void verifyParentDashboard() {
        SeleniumHelper.verifyElementPresent(driver, card1);
    }
}
