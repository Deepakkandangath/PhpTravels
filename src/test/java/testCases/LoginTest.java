package testCases;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import utilities.DriverUtilities;

public class LoginTest extends BaseTest{

//    @Test
//    public void verifyInputValidation() {
//        loginPage.enterInput("username",userName);
//        loginPage.enterInput("password",passWord);
//        loginPage.clickButton("submit-login");
//        String currentUrl=driver.getCurrentUrl();
//        String expectedUrl="https://practice.expandtesting.com/secure";
//        if (currentUrl.equals(expectedUrl)) {
//            System.out.println("Login success!");
//            org.junit.Assert.assertEquals(currentUrl, expectedUrl);
//
//        } else {
//            // Capture error message
//            String errorMsg = driver.findElement(By.id("flash")).getText();
//            Assert.assertTrue(errorMsg.contains("Your username is invalid!"));
//            System.out.println("Login failed!");
//        }
//
//    }
}
