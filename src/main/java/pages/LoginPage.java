package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.ElementUtils;

public class LoginPage extends ElementUtils {

    private final WebDriver driver;

    @FindBy(name = "username")
    private WebElement usernameText;

    private final By usernameField = By.name("username");
    private final By passwordField = By.name("password");
    private final By loginButton = By.cssSelector("button[type='submit']");

    public LoginPage(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    public void enterUsername(String username){
        waitForElementVisible(usernameField, 50);
        WebElement usernameTextBox = driver.findElement(usernameField);
        setText(usernameField, "Admin");

    }

    public void enterPassword( String password){
        waitForElementVisible(passwordField, 50);
        driver.findElement(passwordField);
        setText(passwordField, "admin123");
    }

    public void clickLoginButton(){

        clickElement(loginButton);
    }

    //driver -> elementutils -> login page

}
