import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
     private WebDriver driver ;
    public HomePage(WebDriver driver)
    {
        this.driver = driver ;
    }
    protected final By registerBtn = By.className("ico-register");

    public void  goToRegisterPage()
    {
        driver.findElement(registerBtn).click();
    }

}
