package pages;

import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    public HeaderComponent header;
    public BlogSearchComponent blogSearch;
    public CarSearchComponent carSearch;
    public FlightSearchComponent flightSearch;
    public HotelSearchComponent hotelSearch;
    public LoginSignupAgentComponent loginSignupAgent;
    public LoginSignupCustomerComponent loginSignupCustomer;
    public TourSearchComponent tourSearch;
    public VisaSearchComponent visaSearch;

    public HomePage(WebDriver driver)
    {
        super(driver);
        header= new HeaderComponent(driver);
        blogSearch =new BlogSearchComponent(driver);
        carSearch=new CarSearchComponent(driver);
        flightSearch=new FlightSearchComponent(driver);
        hotelSearch=new HotelSearchComponent(driver);
        loginSignupAgent=new LoginSignupAgentComponent(driver);
        loginSignupCustomer=new LoginSignupCustomerComponent(driver);
        tourSearch=new TourSearchComponent(driver);
        visaSearch=new VisaSearchComponent(driver);
    }



}
