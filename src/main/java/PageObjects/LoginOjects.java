package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginOjects {

    public LoginOjects(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

//    @FindBy(xpath = "//a[@class='button button-orange flat signup-button hButton sign-in-btn js-click-signin']")
    @FindBy(linkText = "Sign In")
    public WebElement signInButton;

    @FindBy(xpath = "//p[text()='Home']")
    public WebElement Home;

    @FindBy(xpath = "//*[@id=\"login-modal\"]/div[1]/div/div[2]/div[2]/div[1]")
    public WebElement HomeLogIn;

    @FindBy(xpath ="//input[@class = 'text-field inp-brand js-home-email']")
    public WebElement username;
    @FindBy(id = "user_password")
    public WebElement password;
    @FindBy(xpath = "//input[@id= 'login-button']")
    public WebElement loginButton;

//    @FindBy(xpath = "//p[text()= 'Parent']")
//    public WebElement selectParent;


}
