package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class SeatData {
    private WebDriver driver;
    public SeatData (WebDriver driver)

    {
        this.driver = driver;
    }
    private By SelectSeat = By.xpath("//div[@class='select-service']//input[@id='SrvcSelectBtnForward0']");
    private By SeatNum = By.xpath("//li[@id='Forward98']");
    private By CustomerDetails = By.xpath("//a[@id='Forwardprofile-tab']");
    private By MobileNum = By.xpath("//input[@id='mobileNo']");
    private By Email = By.xpath("//input[@id='email']");
    private By Payment = By.xpath("//input[@id='PgBtn']");
    private By Condtion = By.xpath("//input[@id='termsChk']");

    public void SelectSeatClick()
    {
        driver.findElement(SelectSeat).click();
    }
    public void SeatNumClick()
{
    driver.findElement(SeatNum).click();
}
    public void CustomerDetailsClick()
    {
        driver.findElement(CustomerDetails).click();
    }
    public void MobileNumClick()
    {
        driver.findElement(MobileNum).click();
    }
    public void MobileNumField(String mobile)
    {
        driver.findElement(MobileNum).sendKeys(mobile);
    }
    public void EmailFieldClick()
    {
        driver.findElement(Email).click();
    }
    public void EmailField (String email)
    {
        driver.findElement(Email).sendKeys(email);
    }
    public void MakePaymentClick()
    {
        driver.findElement(Payment).click();
    }
    public void ConditionClick()
    {
        driver.findElement(Condtion).click();
    }


}
