import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToCart {
    WebDriver driver;

    public AddToCart(WebDriver driver)
    {
        this.driver = driver ;
    }
    protected final By addtocartBtn = By.className("button-2 product-box-add-to-cart-button");

            //By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[1]/div/div[2]/div[3]/div[2]/button[1]");
    public void addItemToCart()
    {
        driver.findElement(addtocartBtn).click();

    }
}
