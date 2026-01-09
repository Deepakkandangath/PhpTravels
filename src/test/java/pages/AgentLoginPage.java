package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AgentLoginPage extends LoginSignupAgentComponent{

    public AgentLoginPage(WebDriver driver)
    {
        super(driver);
    }

    private By emailAddress=By.xpath("//input[@id='email']");
    private By password=By.xpath("//input[@id='password']");
    private By rememberMe=By.xpath("//input[@id='rememberchb']");
    private By login=By.xpath("//button[@id='submitBTN']");
    private By signup=By.xpath("//a[contains(@class,'btn') and contains(.,'Signup')]");
    private By resetPassword=By.xpath("//label[contains(@class,'forgot-link') and contains(.,'Reset Password')]");



    protected void enterEmail(String email){
        type(emailAddress,email);
    }
    protected void enterPassword(String passWord){
        type(password,passWord);
    }
    protected void clickLogin() {
        click(login);
    }

    protected void clickRememberMe(){
        click(rememberMe);
    }
    protected void clickSignup() {
        click(signup);
    }
    protected void setResetPassword(){
        click(resetPassword);
    }



}
