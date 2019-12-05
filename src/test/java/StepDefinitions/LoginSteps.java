package StepDefinitions;

import Helper.waitHelper;
import PageObjects.ParentDashboard;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import PageObjects.LoginOjects;

import javax.swing.*;

public class LoginSteps {
    public WebDriver driver;
    LoginOjects SignInObj;
    ParentDashboard parentobj;
    private By locator;


    @Given("user opens the application")
    public void userOpensTheApplication() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/STYLKANIKAK/eclipse-workspace/_TrailSelenium/src/main/Driver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://staging-1.splashmath.com/");
        Thread.sleep(3000);
    }

    @When("User clicks on SignIn button")
    public void userClicksOnSignInButton() throws InterruptedException {
        Thread.sleep(2000);
        SignInObj = new LoginOjects(driver);
        SignInObj.signInButton.click();
        waitHelper.waitforprocessing(driver, SignInObj.Home);
        SignInObj.Home.click();
    }

    @And("User fills valid username and password")
    public void userFillsValidUsernameAndPassword() throws InterruptedException {

//        String getstr = SignInObj.HomeLogIn.getText();
//        System.out.println(getstr);
//        Assert.assertEquals("Home Log In", getstr );

        SignInObj.username.clear();
        SignInObj.password.clear();

        SignInObj.username.sendKeys("gk+newcurri34@splashmath.com");
        SignInObj.password.sendKeys("123456");
        Thread.sleep(1000);
        Actions builder = new Actions(driver);
        builder.moveToElement(SignInObj.loginButton).click(SignInObj.loginButton);
        builder.perform();
        SignInObj.loginButton.click();
        Thread.sleep(2000);
    }

    @And("User fills invalid username and password")
    public void userFillsInvalidUsernameAndPassword() throws  InterruptedException{
        String getstr = SignInObj.HomeLogIn.getText();
        System.out.println(getstr);
        Assert.assertEquals("Home Log In", getstr);

        SignInObj.username.sendKeys("kk");
        SignInObj.password.sendKeys("123456");
        SignInObj.loginButton.click();
        Thread.sleep(2000);
        String errormsg;
        errormsg = driver.findElement(By.xpath("//div[@class='login-error red error js-error']")).getText();
        Assert.assertEquals("Invalid email or password.", errormsg);

        SignInObj.username.clear();
        SignInObj.password.clear();
//        driver.navigate().refresh();
//
    }
    @Then("User Should enter Parent dashboard")
    public void userShouldEnterParentDashboard() throws InterruptedException {
//        waitHelper.waitforprocessing(driver, SignInObj.selectParent);
        Thread.sleep(2000);
//        SignInObj.selectParent.click();
        parentobj = new ParentDashboard(driver);
        parentobj.verifyParentDashboard();
        parentobj.menuButton.click();
        parentobj.addPlayer.click();

    }

}



