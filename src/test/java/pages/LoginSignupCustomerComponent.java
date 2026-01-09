package pages;

import org.openqa.selenium.WebDriver;

public class LoginSignupCustomerComponent extends BasePage {

    public CustomerLoginPage customerLoginPage;
    public CustomerSignupPage customerSignupPage;
    public LoginSignupCustomerComponent(WebDriver driver)
    {
        super(driver);
        customerLoginPage=new CustomerLoginPage(driver);
        customerSignupPage=new CustomerSignupPage(driver);
    }
}
