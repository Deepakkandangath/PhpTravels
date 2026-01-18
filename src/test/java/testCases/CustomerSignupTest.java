package testCases;

import org.testng.annotations.Test;


public class CustomerSignupTest extends BaseTest{

    @Test
    public void verifyValidSignup()
    {
        homePage.goToHeaderComponent().
                selectCustomerAction("Signup").
                goToCustomerSignupPage().
                enterFirstName("Deepak");
        System.out.println("anm");


    }
}
