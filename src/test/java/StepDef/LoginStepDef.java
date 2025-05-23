
package StepDef;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import utils.DriverFactory;

public class LoginStepDef {

    WebDriver driver;

    LoginPage loginpage;

    @Given("user is on the login page")
    public void user_is_on_the_login_page()  {
        driver= DriverFactory.getDriver();
        loginpage=new LoginPage(driver);
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        loginpage = new LoginPage(driver);
    }


    @And("user enters {string} and {string}")
    public void userEntersAnd(String username, String password) {
        loginpage.enterUsername(username);
        loginpage.enterPassword(password);

    }

    @And("user clicks the login button")
    public void userClicksTheLoginButton() {
        loginpage.clickLoginButton();
    }


}