package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaymentWindow {
    private WebDriver driver;
    public PaymentWindow (WebDriver driver)

    {
        this.driver = driver;
    }

    private By Frame = By.xpath("//iframe[@class=\"razorpay-checkout-frame\"]");
//    private By PaymentMethod = By.xpath("//button[@class=\"new-method has-tooltip false svelte-1d17g67\"][1]");
private By PaymentMethod = By.xpath("//button[@method=\"card\"]");
private By CardNo = By.id("card_number");
private By CardName = By.id("card_name");
private By CardExDate = By.id("card_expiry");
private By CVV = By.id("card_cvv");


    public WebElement getFrame()
    {
        return driver.findElement(Frame);
    }
    public void MakePaymentMethod()
    {
        driver.findElement(PaymentMethod).click();
    }
    public void CardNoClick ()
    {
        driver.findElement(CardNo).click();
    }
    public void CardNameClick ()
    {
        driver.findElement(CardName).click();
    }
    public void CardExDateClick ()
    {
        driver.findElement(CardExDate).click();
    }
    public void CVVClick ()
    {
        driver.findElement(CVV).click();
    }
    public void CardNoData (String number)
    {
        driver.findElement(CardNo).sendKeys(number);
    }
    public void CardNameData (String name)
    {
        driver.findElement(CardName).sendKeys(name);
    }
    public void CardExDateData (String date)
    {
        driver.findElement(CardExDate).sendKeys(date);
    }
    public void CVVData (String cvv)
    {
        driver.findElement(CVV).sendKeys(cvv);
    }



}
