package testCases;

import org.testng.annotations.Test;


public class CustomerSignupTest extends BaseTest{

    @Test
    public void verifyValidSignup()
    {
        homePage.header.selectCustomerAction("Signup").customerSignupPage.enterFirstName("Deepak");
        System.out.println("anm");


    }
}
