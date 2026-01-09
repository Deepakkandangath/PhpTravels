package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class DriverUtilities {
    public static WebDriver initializeDriver() {
        WebDriverManager.chromedriver().setup();   // auto matches Chrome 141

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");

        return new ChromeDriver(options);
    }
}