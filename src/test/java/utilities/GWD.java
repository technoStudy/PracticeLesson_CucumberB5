package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GWD {

    private static WebDriver driver;

    // WebDriver nesnesini döndüren getDriver() metodu
    public static WebDriver getDriver() {

        Logger logger = Logger.getLogger("");
        logger.setLevel(Level.SEVERE);

        // Eğer driver henüz oluşturulmadıysa
        if (driver == null) {
            // Yeni bir ChromeDriver örneği oluştur
            driver = new ChromeDriver();

            // Pencereyi tam ekran yap
            driver.manage().window().maximize();

            // Sayfa yükleme süresi aşımı için zaman aşımı süresini 20 saniye olarak ayarla
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        }

        // Oluşturulan veya mevcut olan WebDriver nesnesini döndür
        return driver;
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
        if (driver != null) {
            // WebDriver'ı kapat
            driver.quit();

            // driver nesnesini null'a ata
            driver = null;
        }
    }
}