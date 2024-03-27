package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utilities.GWD;


public class Hooks {
    @Before
    public void before() {
        System.out.println("The scenario has started.");
    }

    @After
    public void after(Scenario scenario) {
        System.out.println("The scenario finished.");
        GWD.quitDriver();
    }
}
