import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToCart {
    WebDriver driver;

    public AddToCart(WebDriver driver)
    {
        this.driver = driver ;
    }
    protected final By addtocartBtn = By.className("//button[@class=\"button-2 product-box-add-to-cart-button\"]");
    public void addItemToCart()
    {
        driver.findElement(addtocartBtn).click();

    }
}
