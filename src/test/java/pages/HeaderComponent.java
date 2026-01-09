package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HeaderComponent extends BasePage {

    //menu links
    private By flightsLink =By.xpath("//a[contains(@href,'flights') and contains(@class,'fw-light')]");
    private By hotelsLink =By.xpath("//a[contains(@href,'hotels') and contains(@class,'fw-light')]");
    private By toursLink =By.xpath("//a[contains(@href,'tours') and contains(@class,'fw-light')]");
    private By carsLink =By.xpath("//a[contains(@href,'cars') and contains(@class,'fw-light')]");
    private By visaLink =By.xpath("//a[contains(@href,'visa') and contains(@class,'fw-light')]");
    private By blogsLink =By.xpath("//a[contains(@href,'blogs') and contains(@class,'fw-light')]");

    //dropdown toggle
    private By englishDropdown =By.xpath("//a[contains(.,'English') and contains(@class,'dropdown-toggle')]");
    private By usdDropdown =By.xpath("//a[contains(.,'USD') and contains(@class,'dropdown-toggle')]");
    private By agentsDropdown =By.xpath("//a[contains(.,'Agents') and contains(@class,'dropdown-toggle')]");
    private By customerDropdown =By.xpath("//a[contains(.,'Customer') and contains(@class,'dropdown-toggle')]");

        public HeaderComponent(WebDriver driver)
    {
        super(driver);
    }

    public FlightSearchComponent clickFlightLink() {
        click(flightsLink);
        return new FlightSearchComponent(driver);
    }

    public TourSearchComponent clickToursLink() {
        click(toursLink);
        return new TourSearchComponent(driver);
    }

    public HotelSearchComponent clickHotelsLink() {
        click(hotelsLink);
        return new HotelSearchComponent(driver);
    }

    public BlogSearchComponent clickBlogsLink() {
        click(blogsLink);
        return new BlogSearchComponent(driver);
    }

    public VisaSearchComponent clickVisaLink() {
        click(visaLink);
        return new VisaSearchComponent(driver);
    }

    public CarSearchComponent clickCarLink() {
        click(carsLink);
        return new CarSearchComponent(driver);
    }


    public HeaderComponent selectLanguage(String language) {
        click(englishDropdown);
        click(By.xpath("//a[contains(.,'"+language+"') and contains(@class,'dropdown-item')]"));
        return new HeaderComponent(driver);
    }

    public HeaderComponent selectCountry(String country) {
        click(usdDropdown);
        click(By.xpath("//a[contains(.,'"+country+"') and contains(@class,'dropdown-item')]"));
        return new HeaderComponent(driver);
    }

    public LoginSignupAgentComponent selectAction(String actionType )
    {

        click(agentsDropdown);

        click(By.xpath("//li[contains(.,'Agents')]//a[contains(@class,'dropdown-item') and contains(.,'"+actionType+"')]"));

        return new LoginSignupAgentComponent(driver);

    }

    public LoginSignupCustomerComponent selectCustomerAction(String actionType )
    {

        click(customerDropdown);

        click(By.xpath("//li[contains(.,'Customer')]//a[contains(@class,'dropdown-item') and contains(.,'"+actionType+"')]"));

        return new LoginSignupCustomerComponent(driver);

    }

}
