package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AgentSignupPage extends BasePage{

    private By signupLink= By.xpath("//a[@href='#signup']']");
    private By firstName= By.xpath("//input[@id='firstname']");
    private By lastName= By.xpath(" //input[@name='last_name']");
    private By country= By.xpath("//button[@title='Select Country']");
    private By phone= By.xpath("//input[@name='phone']");
    private By emailAddress= By.xpath("//input[@name='user_email']");
    private By password= By.xpath("//input[@name='password']");
    private By agencyCity=By.xpath("//input[@name='agency_city']");
    private By agencyName=By.xpath("//input[@name='agency_name']");
    private By agencyLicense=By.xpath("//input[@name='agency_license']");
    private By agencyAddress=By.xpath("//input[@name='agency_address']");
    private By logoChooseFile=By.xpath("//input[@id='hlogo']");
    private By iAmHuman=By.xpath("//div[@id='anchor']");
    private By signup=By.xpath("//button[@id='submitBTN']");

    public AgentSignupPage(WebDriver driver)
    {
        super(driver);
    }

    protected void clickSignupLink() {
        click(signupLink);
    }

    protected void enterFirstName(String fName){
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
    protected void enterAgencyCity(String agencyCityValue){
        type(agencyCity,agencyCityValue);
    }

    protected void enterAgencyName(String agencyNameValue){
        type(agencyName,agencyNameValue);
    }

    protected void enterAgencyAddress(String agencyAddressValue){
        type(agencyAddress,agencyAddressValue);
    }

    protected void enterAgencyLicense(String agencyLicenseValue){
        type(agencyLicense,agencyLicenseValue);
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
