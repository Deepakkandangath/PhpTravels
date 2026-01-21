package testCases;

import org.testng.annotations.Test;
import pages.CustomerSignupPage;
import utilities.TestDataUtility;


public class CustomerSignupTest extends BaseTest{

    @Test
    public void verifyValidSignup()
    {
        String countryName = TestDataUtility.getRandomCountryName();
       CustomerSignupPage customerSignupPage =  homePage.goToHeaderComponent().
                selectCustomerAction("Signup").
                goToCustomerSignupPage();
       customerSignupPage.enterFirstName(TestDataUtility.getRandomUsername());
       customerSignupPage.enterLastName(TestDataUtility.getRandomUsername());
       customerSignupPage.enterEmail(TestDataUtility.getRandomEmailId());

       customerSignupPage.selectCountry(countryName);
       customerSignupPage.enterPhone(TestDataUtility.getDynamicPhoneNumberByCountry(TestDataUtility.getCountryCode(countryName)));
       customerSignupPage.enterPassword(TestDataUtility.getRandomUsername());
       customerSignupPage.clickIAmHuman();


    }
}
