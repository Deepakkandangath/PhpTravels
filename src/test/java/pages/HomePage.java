package pages;

import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver)
    {
        super(driver);
    }

    public HeaderComponent goToHeaderComponent() {
        return new HeaderComponent(driver);
    }

    public BlogSearchComponent goToBlogSearchComponent() {
        return new BlogSearchComponent(driver);
    }

    public CarSearchComponent goToCarSearchComponent() {
        return new CarSearchComponent(driver);
    }

    public FlightSearchComponent goToFlightSearchComponent() {
        return new FlightSearchComponent(driver);
    }

    public HotelSearchComponent goToHotelSearchComponent() {
        return new HotelSearchComponent(driver);
    }

    public LoginSignupAgentComponent goToLoginSignupAgentComponent() {
        return new LoginSignupAgentComponent(driver);
    }

    public LoginSignupCustomerComponent goToLoginSignupCustomerComponent() {
        return new LoginSignupCustomerComponent(driver);
    }

    public TourSearchComponent goToTourSearchComponent() {
        return new TourSearchComponent(driver);
    }

    public VisaSearchComponent goToVisaSearchComponent() {
        return new VisaSearchComponent(driver);
    }






}
