import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Collections;
import java.util.List;
import java.util.Set;

public class flipkart {
    public static void main(String[]args) {
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        WebElement searchBox=driver.findElement(By.name("q"));
        searchBox.sendKeys("iphone 15 pro max");
        WebElement searchBox1 = searchBox;
        searchBox1.submit();
        String mainPage = driver.getWindowHandle();
        System.out.println("Main page="+mainPage);
        WebElement blueTitaniumIphone = driver.findElement(By.xpath("//div[text()='Apple iPhone 15 Pro Max (Blue Titanium, 256 GB)']"));
        blueTitaniumIphone.click();
        Set<String> allPages= Collections.singleton(driver.getWindowHandle());
        String[] allpages;
        for (String page : allPages) {
            if (!page.equals(mainPage)) {
                driver.switchTo().window(page);
                break;
            }
        }
        System.out.println(driver.getCurrentUrl());
        List<WebElement>products= driver.findElements(By.className("_21Ahn-"));
        System.out.println(products.size());
        for(WebElement product : products) {
         System.out.println(product.getText());
        }
    }
}