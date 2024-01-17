import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
    }

    protected final By loginClick = By.xpath("//a[@class=\"ico-login\"]");
    protected final By emailField = By.xpath("//input[@id=\"Email\"]");
    protected final By passwordField = By.xpath("//input[@id=\"Password\"]");
    protected final By loginBtn = By.xpath("//button[@class=\"button-1 login-button\"]");

    public void clickLoginIcon()
    {
        driver.findElement(loginClick).click();
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        };
    }
    public void login(String email,String password)
    {
        driver.findElement(emailField).sendKeys(email);
        driver.findElement(passwordField).sendKeys(password);
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        };
        driver.findElement(loginBtn).click();
    }
}
