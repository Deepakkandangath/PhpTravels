package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import pages.HomePage;
import utilities.DriverUtilities;

public class BaseTest {

    WebDriver driver;
    HomePage homePage;
    String userName="" ;
    String passWord="";


    @BeforeSuite
    public void initializeBrowser(){
        driver = DriverUtilities.initializeDriver();
        driver.get("https://phptravels.net/");
        homePage=new HomePage(driver);

    }
}
