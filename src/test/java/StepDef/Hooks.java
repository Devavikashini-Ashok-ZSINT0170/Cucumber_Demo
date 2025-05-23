package StepDef;

import io.cucumber.java.Before;
import utils.DriverFactory;

public class Hooks {

    @Before
    public void setUp(){
        DriverFactory.getDriver();
    }

    public void tearDown(){
        DriverFactory.quitDriver();
    }
}
