package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GWD {

    public static ThreadLocal<String> threadBrowserName = new ThreadLocal<>();
    private static final ThreadLocal<WebDriver> threadDriver = new ThreadLocal<>();

    // WebDriver nesnesini döndüren getDriver() metodu
    public static WebDriver getDriver() {

        Locale.setDefault(new Locale("EN"));
        System.setProperty("user.language", "EN");

        Logger logger = Logger.getLogger("");
        logger.setLevel(Level.SEVERE);

        if (threadBrowserName.get() == null) {
            threadBrowserName.set("chrome");
        }

        if (threadDriver.get() == null) {

            switch (threadBrowserName.get()) {
                case "firefox":
                    threadDriver.set(new FirefoxDriver());
                    break;
                case "edge":
                    threadDriver.set(new EdgeDriver());
                    break;
                case "safari":
                    threadDriver.set(new SafariDriver());
                    break;
                default:
                    threadDriver.set(new ChromeDriver());
            }

            // Pencereyi tam ekran yap
            threadDriver.get().manage().window().maximize();
            // Sayfa yükleme süresi aşımı için zaman aşımı süresini 20 saniye olarak ayarla
            threadDriver.get().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        }

        // Oluşturulan veya mevcut olan WebDriver nesnesini döndür
        return threadDriver.get();
    }

    // WebDriver nesnesini sonlandıran quitDriver() metodu
    public static void quitDriver() {

        // Test sonucunu görmek için ekranı 5 saniye beklet
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // Eğer driver mevcutsa
        if (threadDriver.get() != null) {
            // WebDriver'ı kapat
            threadDriver.get().quit();

            WebDriver driver = threadDriver.get();
            driver = null;

            threadDriver.set(driver);
        }
    }
}