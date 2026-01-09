package pages;

import org.openqa.selenium.WebDriver;

public class LoginSignupCustomerComponent extends BasePage {

    public CustomerLoginPage cLoginPage;
    public LoginSignupCustomerComponent(WebDriver driver)
    {
        super(driver);
        cLoginPage=new CustomerLoginPage(driver);
    }
}
