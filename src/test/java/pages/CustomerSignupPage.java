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
    private By countrySearchInput =  By.cssSelector("input[aria-label=Search]");
    public CustomerSignupPage(WebDriver driver)
    {
        super(driver);
    }

    public void enterFirstName(String fName){
        type(firstName,fName);
    }
    public void enterLastName(String lName){
        type(lastName,lName);
    }
    public void selectCountry(String selectCountry) {
        click(country);
        type(countrySearchInput,selectCountry);
        click(By.xpath("//a[starts-with(.,' "+country+"') and contains(@class,'dropdown-item')]"));

    }
    public void enterPhone(String phoneNo){
        type(phone,phoneNo);
    }
    public void enterEmail(String email){
        type(emailAddress,email);
    }
    public void enterPassword(String passWord){
        type(password,passWord);
    }
    public void clickIAmHuman() {
        click(iAmHuman);
    }

    public void clickSignup() {
        click(signup);
    }



}
