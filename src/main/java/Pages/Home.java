package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home {
    private WebDriver driver;
    public Home (WebDriver driver)
    {
        this.driver = driver;
    }

    private By BENGALURU = By.cssSelector("a[onclick=\"populateSearch('1467469338690', 'Chikkamagaluru', '1467467616730', 'Bengaluru');\"]");
    private By NextButton = By.cssSelector("span[class=\"carousel-control-next-icon\"]");
    private By ArrivalDate = By.cssSelector("input[id=\"txtJourneyDate\"]");
    private By DateField = By.xpath("//a[text()='11']");
    private By SearchBus = By.cssSelector("button[onclick=\"openTTDConfirmPopoUp('1',this.form);\"]");

    public void BENGALURUClick()
    {
        driver.findElement(BENGALURU).click();
    }
    public void NextButtonClick()
    {
        driver.findElement(NextButton).click();
    }
    public void ArrivalDateButton()
    {
        driver.findElement(ArrivalDate).click();
    }
    public void DateFieldClick()
    {
        driver.findElement(DateField).click();
    }
    public void SearchBusClick()
    {
        driver.findElement(SearchBus).click();
    }




}
