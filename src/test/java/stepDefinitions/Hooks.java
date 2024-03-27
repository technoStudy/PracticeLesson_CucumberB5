package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utilities.GWD;

public class Hooks {

    // Senaryo başlamadan önce çalışacak olan Before metodu
    @Before
    public void before() {
        System.out.println("Senaryo başladı.");
    }

    // Senaryo bittikten sonra çalışacak olan After metodu
    @After
    public void after(Scenario scenario) {
        System.out.println("Senaryo tamamlandı.");

        // GWD sınıfındaki quitDriver() metodu kullanılarak WebDriver kapatılır
        GWD.quitDriver();
    }
}