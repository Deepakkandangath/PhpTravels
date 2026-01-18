package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomerSignupPage extends BasePage{

   private By firstName= By.xpath("//input[@id='firstname']");
    private By lastName= By.xpath(" //input[@name='last_name']");
    private By country= By.xpath("//button[@title='Select Country']");
    private By phone= By.xpath("//input[@name='phone']");
    private By emailAddress= By.xpath("//input[@name='user_email']");
    private By password= By.xpath("//input[@name='password']");
    private By iAmHuman=By.xpath("//div[@id='anchor']");
    private By signup=By.xpath("//button[@id='submitBTN']");
    public CustomerSignupPage(WebDriver driver)
    {
        super(driver);
    }

    public void enterFirstName(String fName){
        type(firstName,fName);
    }
    protected void enterLastName(String lName){
        type(lastName,lName);
    }
    protected void clickCountry(String selectCountry) {
        click(country);
        click(By.xpath("//a[contains(.,'"+country+"') and contains(@class,'dropdown-item')]"));

    }
    protected void enterPhone(String phoneNo){
        type(phone,phoneNo);
    }
    protected void enterEmail(String email){
        type(emailAddress,email);
    }
    protected void enterPassword(String passWord){
        type(password,passWord);
    }
    protected void clickIAmHuman() {
        click(iAmHuman);
    }

    protected void clickSignup() {
        click(signup);
    }



}
