import Pages.Home;
import Pages.Passenger;
import Pages.PaymentWindow;
import Pages.SeatData;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Tests {
    WebDriver driver = null;
    Home home;
    SeatData seat;
    Passenger passenger;
    PaymentWindow payment;


    @BeforeTest
    public void OpenWebsite() throws InterruptedException {

        //Step 1 Bridge between test Scripts and Browser
        String chromePath = System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",chromePath);

        //Step 2 New Object of WebDriver
        driver = new ChromeDriver();

        //Step 3 Navigate to google website ,Maximize window and Sleep
        driver.navigate().to("https://ksrtc.in/oprs-web/guest/home.do?h=1");

//        driver.manage().window().maximize();

        Dimension dimension = new Dimension(1024,768);
        driver.manage().window().setSize(dimension);
        Thread.sleep(3000);

        home = new Home(driver);
        seat = new SeatData(driver);
        passenger = new Passenger(driver);
        payment = new PaymentWindow(driver);

    }

    @Test
    public void Search() throws InterruptedException {
        Thread.sleep(5000);
        home.NextButtonClick();

        Thread.sleep(1000);
        home.BENGALURUClick();

        Thread.sleep(2000);
        home.ArrivalDateButton();

        Thread.sleep(2000);
        home.DateFieldClick();

        Thread.sleep(5000);
        home.SearchBusClick();

    }

    @Test void Seat() throws InterruptedException {

        Thread.sleep(6000);
        seat.SelectSeatClick();

        Thread.sleep(10000);
        seat.SeatNumClick();

        Thread.sleep(6000);
        seat.CustomerDetailsClick();

        Thread.sleep(6000);
        seat.MobileNumClick();

        Thread.sleep(6000);
        seat.MobileNumField("6789125987");

        Thread.sleep(6000);
        seat.EmailFieldClick();

        Thread.sleep(6000);
        seat.EmailField("muhammed107@yahoo.com");

    }

    @Test
    public void Passenger() throws InterruptedException {
        Thread.sleep(6000);
        passenger.PassNameClick();

        Thread.sleep(6000);
        passenger.PassNameFill("Mohamed");

        Thread.sleep(6000);
        passenger.PassAgeClick();

        Thread.sleep(6000);
        passenger.PassAgeFill("24");

        Thread.sleep(6000);
        passenger.GenderClick();

        Thread.sleep(6000);
        passenger.MaleClick();

        Thread.sleep(6000);
        passenger.ConcessionClick();

        Thread.sleep(6000);
        passenger.ConcessionChoiceClick();

//        Thread.sleep(6000);
//        passenger.MaleEnter();

        Thread.sleep(6000);
        seat.ConditionClick();

        Thread.sleep(6000);
        seat.MakePaymentClick();

        Thread.sleep(3000);
        driver.switchTo().frame(payment.getFrame());


        Thread.sleep(20000);
        payment.MakePaymentMethod();
    }

    @Test
    public void Payment() throws InterruptedException
    {
        Thread.sleep(6000);
        payment.CardNoClick();

        Thread.sleep(6000);
        payment.CardNoData("1234 1254 1235 1478");

        Thread.sleep(6000);
        payment.CardExDateClick();

        Thread.sleep(6000);
        payment.CardExDateData("05/29");

        Thread.sleep(6000);
        payment.CVVClick();

        Thread.sleep(6000);
        payment.CVVData("123");

//        Thread.sleep(6000);
//        payment.CardNameClick();
//
//        Thread.sleep(6000);
//        payment.CardNameData("Mohamed");



    }




    @AfterTest
    public void CloseWebsite() throws InterruptedException {
        Thread.sleep(3000);

        //Final Step Close Driver
        driver.quit();   // for closing Browser
    }
}
