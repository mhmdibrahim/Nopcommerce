import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class RegisterPage {
    private WebDriver driver ;

    public RegisterPage(WebDriver driver)
    {
        this.driver = driver ;
    }
    protected final By registerPageHeader = By.className("page-title");
    protected final By gender = By.id("gender-male");
    protected final By firstNameField = By.id("FirstName");
    protected final By lastNameField = By.id("LastName");
    protected final By emailField = By.id("Email");
    protected final By companyField = By.id("Company");
    protected final By passwordField = By.id("Password");
    protected final By confirmPasswordField = By.id("ConfirmPassword");
    protected final By dateOfBirthDay = By.name("DateOfBirthDay");
    protected final By dateOfBirthMonth = By.name("DateOfBirthMonth");
    protected final By dateOfBirthYear = By.name("DateOfBirthYear");
    protected final By registerBtn = By.name("register-button");
    protected final By completeRegister = By.className("result");
//    protected final By continueBtn = By.className("register-continue-button");
    protected final By continueBtn = By.xpath("//a[@class=\"button-1 register-continue-button\"]");


    public String getRegisterPageHeader ()
    {
        return  driver.findElement(registerPageHeader).getText();
    }
    public void fillForm(String firstName , String lastname , String email
            , String company ,String password, String confrimPassword)
    {
        driver.findElement(gender).click();
        driver.findElement(firstNameField).sendKeys(firstName);
        driver.findElement(lastNameField).sendKeys(lastname);

        WebElement dateOfBirth = driver.findElement(dateOfBirthDay);
        Select select = new Select(dateOfBirth);
        select.selectByValue("23");

        WebElement monthOfBirth = driver.findElement(dateOfBirthMonth);
        Select select1 = new Select(monthOfBirth);
        select1.selectByValue("3");
        WebElement yearOfBirth = driver.findElement(dateOfBirthYear);
        Select select2 = new Select(yearOfBirth);
        select2.selectByValue("1991");

        driver.findElement(emailField).sendKeys(email);
        driver.findElement(companyField).sendKeys(company);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(confirmPasswordField).sendKeys(confrimPassword);
        driver.findElement(registerBtn).click();

    }
    public String successfulRegister()
    {
        return  driver.findElement(completeRegister).getText();
    }

    public void continueAction()
    {
        driver.findElement(continueBtn).click();
    }
}
