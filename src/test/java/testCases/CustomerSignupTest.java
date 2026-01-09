package testCases;

import pages.HomePage;

public class CustomerSignupTest extends BaseTest{

    public void verifyValidSignup()
    {
        homePage.header.selectCustomerAction("Signup");
    }
}
