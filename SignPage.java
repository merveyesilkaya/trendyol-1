package Page;

import base.BasePage;
import org.openqa.selenium.WebDriver;

import static constant.Constants.*;

public class SignPage extends BasePage {
    public SignPage(WebDriver driver) {
        super(driver);
    }
    public void hoverElement(){
        hoverElement(ACCOUNT_HOVER);

    }
    public void loginClick(){
        click(LOGIN_BUTTON);
    }
    public void Emailenter(String email){
        sendKeys(EMAIL_GIRIS,email);
    }
    public void PasswordEnter(String password){
        sendKeys(PASSWORD_GIRIS,password);
    }
    public void clickLogin(){
        click(LOGIN_ENTER);
    }


}
