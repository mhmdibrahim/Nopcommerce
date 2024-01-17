import org.testng.annotations.Test;
import utils.JSONClass;

public class TestAddToCart extends BaseTest{
    protected final String loginData = "src/test/java/resources/login_data.json";

    @Test
    public void addItemToCart()
    {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickLoginIcon();
        loginPage.clickLoginIcon();
        loginPage.login(
                JSONClass.readJson(loginData,"email"),
                JSONClass.readJson(loginData,"password"));
        AddToCart addToCart = new AddToCart(driver);
        addToCart.addItemToCart();
    }
}
