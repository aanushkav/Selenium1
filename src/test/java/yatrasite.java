import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

import java.util.List;

public class yatrasite {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.yatra.com/");
        WebElement newDelhiElement = driver.findElement(By.xpath("//p[contains(@class,'css-1rv3qys') and text()='new delhi']"));
        newDelhiElement.click();
        WebElement inputBox = driver.findElement(By.id("input-with-icon-adornment"));
        inputBox.sendKeys("del");
        List<WebElement> options = driver.findElements(By.xpath("//div[contains(@class,'fw-600')]"));
        for (WebElement option : options) {
            String city = option.getText().toLowerCase();
            if (city.contains("delhi")) {
                option.click();
                break;
            }
        }
                WebElement mumbaiElement = driver.findElement(By.xpath("//p[contains(@class,'css-1rv3qys') and text()='mumbai']"));
                mumbaiElement.click();
                inputBox = driver.findElement(By.id("input-with-icon-adornment"));
                inputBox.sendKeys("blr");
                options = driver.findElements(By.xpath("//div[contains(@class,'fw-600 mb-0')]"));
                for (WebElement option : options) {
                   String city = option.getText().toLowerCase();
                    if (city.contains("bengaluru")) {
                        option.click();
                        break;
                    }
                }
                Thread.sleep(3000);
                driver.quit();
    }
}

