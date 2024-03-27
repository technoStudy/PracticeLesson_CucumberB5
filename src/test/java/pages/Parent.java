package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utilities.GWD;

import java.time.Duration;

public class Parent {
    // WebDriver'ın bekleme süresi için WebDriverWait nesnesi oluşturulur
    public WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));

    // JavaScriptExecutor nesnesi oluşturulur
    public JavascriptExecutor js = (JavascriptExecutor) GWD.getDriver();

    // Belirtilen WebElement'e tıklama işlemini gerçekleştiren metot
    public void myClick(WebElement element) {
        // WebElement'in görünür olmasını bekler
        wait.until(ExpectedConditions.visibilityOf(element));

        // WebElement'e tıklama işlemi gerçekleştirilir
        element.click();
    }

    // Belirtilen WebElement'e metin gönderme işlemini gerçekleştiren metot
    public void mySendKeys(WebElement element, String text) {
        // WebElement'in görünür olmasını bekler
        wait.until(ExpectedConditions.visibilityOf(element));

        // WebElement'e kaydırma işlemi yapılır
        scrollToElement(element);

        // WebElement'in içeriği temizlenir
        element.clear();

        // WebElement'e metin gönderilir
        element.sendKeys(text);
    }

    // Belirtilen WebElement'e kaydırma işlemini gerçekleştiren metot
    public void scrollToElement(WebElement element) {
        // JavaScriptExecutor kullanılarak WebElement'e kaydırma işlemi yapılır
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    // Belirtilen WebElement'in belirtilen değeri içerip içermediğini doğrulayan metot
    public void verifyContainsText(WebElement element, String value) {
        // WebElement'in belirtilen değeri içermesini bekler
        wait.until(ExpectedConditions.textToBePresentInElement(element, value));

        // WebElement'in metni, belirtilen değeri içeriyorsa doğrulama yapılır
        Assert.assertTrue(element.getText().toLowerCase().contains(value.toLowerCase()));

        // ESCAPE tuşuna basarak herhangi bir açık pop-up veya modalı kapatır
        new Actions(GWD.getDriver()).sendKeys(Keys.ESCAPE).build().perform();
    }

    // Belirtilen WebElement'e JavaScript ile tıklama işlemini gerçekleştiren metot
    public void myJsClick(WebElement element) {
        // WebElement'in tıklanabilir olmasını bekler
        wait.until(ExpectedConditions.elementToBeClickable(element));

        // WebElement'e kaydırma işlemi yapılır
        scrollToElement(element);

        // JavaScriptExecutor kullanılarak WebElement'e tıklama işlemi yapılır
        js.executeScript("arguments[0].click();", element);
    }
}