package org.example;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Main {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        //DesiredCapabilities desiredCapabilities = new DesiredCapabilities(options);
        //WebDriver driver = WebDriverManager.chromiumdriver().capabilities(desiredCapabilities).create();
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://practice.expandtesting.com/login");
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys(" ");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("SuperSecretPassword!");

        driver.findElement(By.xpath("//button[@id='submit-login']")).click();

        String currentUrl=driver.getCurrentUrl();
        String expectedUrl="https://practice.expandtesting.com/secure";
//        if(currentUrl.equals(expectedUrl))
//        {
//            System.out.println("login success");
//            Assert.assertEquals(expectedUrl,currentUrl);
//
//        }
//        else
//        {
//
//            Assert.assertEquals("Your username is invalid!",driver.findElement(By.xpath("//*[@id=\"flash\"]/b")).getText());
//            System.out.println("login failed");
//        }

        if (currentUrl.equals(expectedUrl)) {
            System.out.println("Login success!");
            Assert.assertEquals(currentUrl, expectedUrl);

        } else {
            // Capture error message
            String errorMsg = driver.findElement(By.id("flash")).getText();
            Assert.assertTrue(errorMsg.contains("Your username is invalid!"));
            System.out.println("Login failed!");
        }






    }
}
