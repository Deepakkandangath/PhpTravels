package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    protected WebDriver driver;
    protected FluentWait<WebDriver> wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(20)).pollingEvery(Duration.ofMillis(500)).ignoring(NoSuchElementException.class);
    }

    public void navigateTo(String url)
    {
        driver.get(url);
    }

    protected WebElement waitForElement(By locator)
    {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    protected void click(By locator)
    {
        waitForElement(locator).click();
    }

    protected void type(By locator,String text)
    {
        WebElement el=waitForElement(locator);
        el.clear();
        el.sendKeys(text);
    }
}
