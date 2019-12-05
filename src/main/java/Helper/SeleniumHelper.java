package Helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumHelper {

    public static boolean isElementPresent(WebDriver driver, By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (Exception e ){return false;}
    }


    public static boolean isElementPresent(WebDriver driver, WebElement element) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.visibilityOf(element));
            return true;
        } catch (Exception e){
            return false;
        }
    }

    public static void verifyElementPresent(WebDriver driver, WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
//    public void isElementPresent(By locator) {
//        try {
//            driver.findElement(locator);
//        } catch (Exception e) {
//        }
//    }
}
