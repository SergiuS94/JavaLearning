package MyFirstSeleniumProject.stepdefs;

import MyFirstSeleniumProject.utils.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class MyHooks {

    @Before
    public void setup(){
        Base.getPropValues();
        Base.getDriver();
    }

    @After
    public void teardown(){
        Base.kill();
    }

}
