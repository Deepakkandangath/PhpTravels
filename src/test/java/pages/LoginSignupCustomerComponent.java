package pages;

import org.openqa.selenium.WebDriver;

public class LoginSignupCustomerComponent extends BasePage {

    public LoginSignupCustomerComponent(WebDriver driver)
    {
        super(driver);
    }

    public CustomerLoginPage goToCustomerLoginPage() {
        return new CustomerLoginPage(driver);
    }

    public CustomerSignupPage goToCustomerSignupPage() {
        return new CustomerSignupPage(driver);
    }
}
