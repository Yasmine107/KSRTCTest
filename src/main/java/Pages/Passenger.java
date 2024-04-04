package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Passenger {
    private WebDriver driver;
    public Passenger (WebDriver driver)

    {
        this.driver = driver;
    }

    private By PassName = By.xpath("//input[@id='passengerNameForward0']");
    private By PassAge = By.xpath("//input[@id='passengerAgeForward0']");
    private By Gender = By.xpath("//select[@id='genderCodeIdForward0']");
    private By Male = By.xpath("//option[@value='24']");
    private By Concession = By.xpath("//select[@id='concessionIdsForward0']");
    private By ConcessionChoice = By.xpath("//select[@id='concessionIdsForward0']//option[@value='1466060086837'][normalize-space()='GENERAL PUBLIC']");

    public void PassNameClick()
    {
        driver.findElement(PassName).click();
    }
    public void PassAgeClick()
    {
        driver.findElement(PassAge).click();
    }
    public void GenderClick()
    {
        driver.findElement(Gender).click();
    }
    public void MaleClick()
    {
        driver.findElement(Male).click();
    }
    public void ConcessionClick()
    {
        driver.findElement(Concession).click();
    }
    public void ConcessionChoiceClick()
    {
        driver.findElement(ConcessionChoice).click();
    }
    public void MaleEnter()
    {
        driver.findElement(Male).sendKeys(Keys.ENTER);
    }
    public void PassNameFill(String name)
    {
        driver.findElement(PassName).sendKeys(name);
    }
    public void PassAgeFill(String age)
    {
        driver.findElement(PassAge).sendKeys(age);
    }


}
