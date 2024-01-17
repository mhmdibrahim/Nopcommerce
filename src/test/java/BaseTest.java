import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseTest {
    WebDriver driver ;

    @BeforeMethod
    public void  setDriver(){
    driver = new ChromeDriver() ;
        driver.manage().window().maximize();
        driver.navigate().to("https://demo.nopcommerce.com/");
    }

    @AfterTest
    public void tearDown ()
    {
        if (driver != null){
            driver.quit();
        }
    }


}
