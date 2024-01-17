import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.JSONClass;

public class TestRegister extends BaseTest{
    protected final String registerData = "src/test/java/resources/register_data.json" ;
    @Test
    public void gotoRegister(){
        new HomePage(driver).goToRegisterPage();

        RegisterPage registerPage = new RegisterPage(driver);

        Assert.assertEquals(registerPage.getRegisterPageHeader() , JSONClass.readJson(registerData,"Register"), "You are not in a Register Page");

        registerPage.fillForm(
                JSONClass.readJson(registerData,"firstname"),
                JSONClass.readJson(registerData,"lastname"),
                JSONClass.readJson(registerData,"email"),
                JSONClass.readJson(registerData,"companyname"),
                JSONClass.readJson(registerData,"password"),
                JSONClass.readJson(registerData,"confirmpassword")) ;
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        };
        Assert.assertEquals(registerPage.successfulRegister(),JSONClass.readJson(registerData,"successfulRegister"),"You are not in a register page") ;
        registerPage.continueAction();
        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        };
    }

}
