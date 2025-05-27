package StepDef;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.DriverFactory;

public class Hooks {

    @Before
    public void setUp() {
        System.out.println("Running test on browser: " + System.getProperty("firefox", "chrome"));
        DriverFactory.getDriver();  // this should initialize browser based on Jenkins param
    }

    @After
    public void tearDown() {
        DriverFactory.quitDriver();
    }
}
