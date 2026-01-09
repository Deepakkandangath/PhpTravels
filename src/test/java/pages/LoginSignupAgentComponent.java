package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class
LoginSignupAgentComponent extends BasePage {

   public AgentLoginPage aLoginPage;
    public LoginSignupAgentComponent(WebDriver driver) {
        super(driver);
        aLoginPage=new AgentLoginPage(driver);
    }



}













//    WebDriver driver;
//// driver.findElement(By.xpath("//input[@id='username']")).sendKeys(" ");
////driver.findElement(By.xpath("//button[@id='submit-login']")).click();
//
//    public LoginPage(WebDriver driver){
//        this.driver=driver;
//         }
//
//    public void enterInput(String inputType, String inputValue){
//        driver.findElement(By.xpath("//input[@id='"+inputType+"']")).sendKeys(inputValue);
//    }
//
//    public void clickButton(String buttonType){
//        driver.findElement(By.xpath("//button[@id='"+buttonType+"']")).click();
//    }
//
//    public String getOutput(String outputType){
//        return driver.findElement(By.id("output-"+outputType)).getText();
//    }
//}