package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BaseClass {

    protected WebDriver driver;

    public BaseClass(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

}
