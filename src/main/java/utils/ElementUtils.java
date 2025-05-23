package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ElementUtils {

    private final WebDriver driver;

    private final WebDriverWait wait;

    public ElementUtils (WebDriver driver){
        this.driver = driver;//assigning global variable to local variable
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public void waitForElementVisible(By locator, int seconds){
        new WebDriverWait(driver, Duration.ofSeconds(seconds))
                .until(ExpectedConditions.visibilityOfElementLocated(locator));

    }

    // For clicking the web element everytime, use this method basically reuse
    public void clickElement(By locator){

        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
    }

    // Reuse of code

    public void clickWebElement(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
        element.click();
    }

    public void setText(By locator,String textToBeEntered)
    {    WebElement element=driver.findElement(locator);
        element.sendKeys(textToBeEntered);

    }

}
