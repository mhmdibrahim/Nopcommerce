import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import utils.JSONClass;

public class TestLogin extends BaseTest{

    protected final String loginData = "src/test/java/resources/login_data.json";

    @Test
    public void login()
    {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickLoginIcon();
        loginPage.login(
                JSONClass.readJson(loginData,"email"),
                JSONClass.readJson(loginData,"password"));

    }
}
