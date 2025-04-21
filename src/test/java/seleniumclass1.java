import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
public class seleniumclass1 {
    public static void main (String[]args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.linkedin.com/login");
        driver.manage().window().maximize();
        driver.findElement(By.id("username")).sendKeys("anu123@gmail.com");
        driver.findElement(By.id("password")).sendKeys("Anushka");
        WebElement keepLoggedInLabel = driver.findElement(By.xpath("//label[@for='rememberMeOptIn-checkbox']"));
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(5000);
        driver.quit();
    }
}
