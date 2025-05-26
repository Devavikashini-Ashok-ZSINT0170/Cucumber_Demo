package utils;

//code for triggering the browsers

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

    private static WebDriver driver;

    // add more drivers that is cross browser testing

    public static WebDriver getDriver(){
        if(driver==null){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();

        }

        return driver;
    }

    public static void quitDriver(){
        if(driver!=null){
            driver.quit();// quiting the driver after one test case passed
            driver=null;// after quiting to invoke the next session in this driver, we are making it has null

        }
    }


}
